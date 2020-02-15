package com.example.rule.editor.model;

public class ConceptBuilder {

    private final ConceptDef conceptDef;
    private final ConceptData conceptData;

    public ConceptBuilder(ConceptDef conceptDef) {
        this.conceptDef = conceptDef;
        int attributeCount = conceptDef.getAttributeCount();
        this.conceptData = new ConceptData(attributeCount);
    }

    ConceptDef getConceptDef() {
        return conceptDef;
    }

    ConceptData getConceptData() {
        return conceptData;
    }

    public ConceptBuilder attribute(String name, Object value) {
        int attributeIndex = conceptDef.getAttributeIndex(name);
        conceptData.setAttribute(attributeIndex, value);
        return this;
    }

    public Concept build() {
        return new Concept(this);
    }
}
