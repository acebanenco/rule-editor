package com.example.rule.editor.model;

import java.util.ArrayList;
import java.util.List;

public class ConceptDefBuilder {

    private String name;
    private final List<AttributeDef> attributes = new ArrayList<>();

    String getName() {
        return name;
    }

    List<AttributeDef> getAttributes() {
        return attributes;
    }

    public ConceptDefBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ConceptDefBuilder attribute(AttributeDef attribute) {
        this.attributes.add(attribute);
        return this;
    }

    public ConceptDef build() {
        return new ConceptDef(this);
    }
}
