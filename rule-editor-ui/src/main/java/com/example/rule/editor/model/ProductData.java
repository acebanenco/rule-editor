package com.example.rule.editor.model;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ProductData {

    private final List<Concept> conceptList;

    public ProductData(List<Concept> conceptList) {
        this.conceptList = new ArrayList<>(conceptList);
    }

    public Concept getConcept(ConceptDef conceptDef) {
        for (Concept concept : conceptList) {
            if ( concept.getConceptDef().equals(conceptDef) ) {
                return concept;
            }
        }
        throw new NoSuchElementException(conceptDef.getName());
    }

}
