package com.example.rule.editor.ui;

import com.example.rule.editor.model.*;

import java.math.BigDecimal;
import java.util.List;

public class RuleRepository {

    public List<ConceptDef> getConcepts() {
        return List.of(getProductConcept(), getIssuerConcept());
    }

    private ConceptDef getIssuerConcept() {
        return new ConceptDefBuilder().
                name("Issuer").
                attribute(new AttributeDef("IssuerName", String.class)).
                attribute(new AttributeDef("IssuerCountry", String.class)).
                build();
    }

    private ConceptDef getProductConcept() {
        return new ConceptDefBuilder().
                name("Product").
                attribute(new AttributeDef("MarketSector", String.class)).
                attribute(new AttributeDef("SecurityTypeLevel1", String.class)).
                attribute(new AttributeDef("Country", String.class)).
                build();
    }


    public List<ProductData> getProducts() {
        return List.of(
                new ProductData(
                        List.of(
                                new ConceptBuilder(getProductConcept()).
                                        attribute("MarketSector", "FI").
                                        attribute("SecurityTypeLevel1", "OPTION").
                                        attribute("Country", "US").
                                        build(),
                                new ConceptBuilder(getIssuerConcept()).
                                        attribute("IssuerName", "JP").
                                        attribute("IssuerCountry", "US").
                                        build()
                        )
                ),
                new ProductData(
                        List.of(
                                new ConceptBuilder(getProductConcept()).
                                        attribute("MarketSector", "SPREAD").
                                        attribute("SecurityTypeLevel1", "CONTRACT").
                                        attribute("Country", "PL").
                                        build(),
                                new ConceptBuilder(getIssuerConcept()).
                                        attribute("IssuerName", "JP").
                                        attribute("IssuerCountry", "US").
                                        build()
                        )
                ),
                new ProductData(
                        List.of(
                                new ConceptBuilder(getProductConcept()).
                                        attribute("MarketSector", "TREASUES").
                                        attribute("SecurityTypeLevel1", "FUTURE").
                                        attribute("Country", "UK").
                                        build(),
                                new ConceptBuilder(getIssuerConcept()).
                                        attribute("IssuerName", "JP").
                                        attribute("IssuerCountry", "US").
                                        build()
                        )
                )
        );
    }
}
