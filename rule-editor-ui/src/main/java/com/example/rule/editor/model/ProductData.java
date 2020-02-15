package com.example.rule.editor.model;

import java.util.ArrayList;
import java.util.List;

public class ProductData {

    private final List<Concept> conceptList;

    public ProductData(List<Concept> conceptList) {
        this.conceptList = new ArrayList<>(conceptList);
    }

}
