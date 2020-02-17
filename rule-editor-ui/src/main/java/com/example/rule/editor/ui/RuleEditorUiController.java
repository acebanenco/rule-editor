package com.example.rule.editor.ui;

import com.example.rule.editor.model.*;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RuleEditorUiController {

    private final RuleRepository ruleRepository;
    private final ProductDataTableColumnFactory tableColumnFactory;
    @FXML
    private TableView<ProductData> rulesTable;

    public RuleEditorUiController(@Autowired RuleRepository ruleRepository,
                                  @Autowired ProductDataTableColumnFactory tableColumnFactory) {
        this.ruleRepository = ruleRepository;
        this.tableColumnFactory = tableColumnFactory;
    }

    @FXML
    public void initialize() {
        List<ConceptDef> concepts = ruleRepository.getConcepts();
        List<TableColumn<ProductData, Object>> tableColumns = new ArrayList<>(concepts.size());
        for (ConceptDef conceptDef : concepts) {
            TableColumn<ProductData, Object> conceptColumn = tableColumnFactory.getProductDataTableColumn(conceptDef);
            tableColumns.add(conceptColumn);
        }
        rulesTable.getColumns().setAll(tableColumns);
        rulesTable.getItems().setAll(ruleRepository.getProducts());
    }

}
