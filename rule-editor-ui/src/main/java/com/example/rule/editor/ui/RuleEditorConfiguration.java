package com.example.rule.editor.ui;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RuleEditorConfiguration {

    @Bean
    public RuleRepository getRuleRepository() {
        return new RuleRepository();
    }
}
