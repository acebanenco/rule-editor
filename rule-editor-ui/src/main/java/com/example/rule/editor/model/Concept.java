package com.example.rule.editor.model;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;

public class Concept {

    private final ConceptDef conceptDef;
    private final ConceptData conceptData;

    public Concept(ConceptDef conceptDef, ConceptData conceptData) {
        this.conceptDef = conceptDef;
        this.conceptData = conceptData;
    }

    public Concept(ConceptBuilder builder) {
        this.conceptDef = builder.getConceptDef();
        this.conceptData = builder.getConceptData().copy();
    }

    public ConceptDef getConceptDef() {
        return conceptDef;
    }

    public Property<Object> getAttributeProperty(String name) {
        int attributeIndex = conceptDef.getAttributeIndex(name);
        return new SimpleObjectProperty<>(conceptData.getAttribute(attributeIndex));
    }

}
