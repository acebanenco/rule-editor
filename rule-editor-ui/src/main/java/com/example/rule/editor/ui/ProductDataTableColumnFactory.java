package com.example.rule.editor.ui;

import com.example.rule.editor.model.AttributeDef;
import com.example.rule.editor.model.Concept;
import com.example.rule.editor.model.ConceptDef;
import com.example.rule.editor.model.ProductData;
import javafx.scene.control.TableColumn;
import org.springframework.stereotype.Component;

@Component
public class ProductDataTableColumnFactory {

    TableColumn<ProductData, Object> getProductDataTableColumn(ConceptDef conceptDef) {
        TableColumn<ProductData, Object> conceptColumn = new TableColumn<>(conceptDef.getName());
        AttributeDef[] attributes = conceptDef.getAttributes();
        for (AttributeDef attributeDef : attributes) {
            TableColumn<ProductData, Object> attributeColumn = getConceptDataTableColumn(conceptDef, attributeDef);
            conceptColumn.getColumns().add(attributeColumn);
        }
        return conceptColumn;
    }

    private TableColumn<ProductData, Object> getConceptDataTableColumn(ConceptDef conceptDef, AttributeDef attributeDef) {
        TableColumn<ProductData, Object> attributeColumn = new TableColumn<>(attributeDef.getName());
        attributeColumn.setCellValueFactory(cellData -> {
            ProductData value = cellData.getValue();
            Concept concept = value.getConcept(conceptDef);
            return concept.getAttributeProperty(attributeDef.getName());
        });
        return attributeColumn;
    }

}
