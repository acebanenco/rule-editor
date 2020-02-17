package com.example.rule.editor.model;

import java.util.Arrays;
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

    public String getName() {
        return name;
    }

    public AttributeDef[] getAttributes() {
        return Arrays.copyOf(attributes, attributes.length);
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

    public int getAttributeCount() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        ConceptDef that = (ConceptDef) o;
        if (!name.equals(that.name)) {
            return false;
        }
        return Arrays.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
