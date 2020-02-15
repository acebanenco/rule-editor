package com.example.rule.editor.model;

import java.util.NoSuchElementException;
import java.util.Objects;

public class ConceptDef {

    public static final AttributeDef[] EMPTY_ATTIBUTE_DEFS = new AttributeDef[0];
    private final String name;
    private final AttributeDef[] attributes;

    ConceptDef(ConceptDefBuilder builder) {
        name = builder.getName();
        attributes = builder.getAttributes().toArray(EMPTY_ATTIBUTE_DEFS);
    }

    int getAttributeIndex(String name) {
        int index = 0;
        for (AttributeDef attribute : attributes) {
            if (Objects.equals(name, attribute.getName())) {
                return index;
            }
            index++;
        }
        throw new NoSuchElementException(this.name + "." + name);
    }

    int getAttributeCount() {
        return attributes.length;
    }

    private AttributeDef getAttribute(String name) {
        int attributeIndex = getAttributeIndex(name);
        return attributes[attributeIndex];
    }

    Class<?> getAttributeType(String name) {
        AttributeDef attribute = getAttribute(name);
        return attribute.getType();
    }

}
