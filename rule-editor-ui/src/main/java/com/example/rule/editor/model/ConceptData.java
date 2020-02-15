package com.example.rule.editor.model;

import java.util.Arrays;

class ConceptData {

    private final Object[] attributes;

    ConceptData(int attributeCount) {
        attributes = new Object[attributeCount];
    }

    private ConceptData(Object[] attributes) {
        this.attributes = attributes;
    }

    Object getAttribute(int index) {
        return attributes[index];
    }

    void setAttribute(int index, Object attribute) {
        this.attributes[index] = attribute;
    }

    ConceptData copy() {
        return new ConceptData(Arrays.copyOf(attributes, attributes.length));
    }

}
