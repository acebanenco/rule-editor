package com.example.rule.editor.ui;

import com.example.rule.editor.model.ProductData;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RuleEditorUiController {

    @FXML
    private TableView<ProductData> rulesTable;
    private final RuleRepository ruleRepository;

    public RuleEditorUiController(@Autowired RuleRepository ruleRepository) {
        this.ruleRepository = ruleRepository;
    }

    @FXML
    public void initialize() {
        rulesTable.getColumns().add(new TableColumn<>());
        rulesTable.setItems(FXCollections.observableList(ruleRepository.getProductData()));
    }

}
