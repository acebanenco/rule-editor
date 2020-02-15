package com.example.rule.editor.model;

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

    public Object getAttribute(String name) {
        int attributeIndex = conceptDef.getAttributeIndex(name);
        return conceptData.getAttribute(attributeIndex);
    }

    public void setAttribute(String name, Object value) {
        int attributeIndex = conceptDef.getAttributeIndex(name);
        conceptData.setAttribute(attributeIndex, value);
    }
}
