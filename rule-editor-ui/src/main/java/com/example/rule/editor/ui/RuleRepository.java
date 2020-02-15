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
                attribute(new AttributeDef("Name", String.class)).
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


    public List<Concept> getProducts() {
        return List.of(
                new ConceptBuilder(getProductConcept()).
                        attribute("MarketSector", "FI").
                        attribute("SecuityTypeLevel1", "OPTION").
                        attribute("Country", "US").
                        build(),
                new ConceptBuilder(getProductConcept()).
                        attribute("MarketSector", "FI").
                        attribute("SecuityTypeLevel1", "OPTION").
                        attribute("Country", "US").
                        build(),


                new ProductData(
                        new ProductBuilder().
                                marketSector("FI").
                                secuityTypeLevel1("OPTION").
                                country("US").
                                build(),
                        new FactorInformation(BigDecimal.valueOf(10.9))
                ),
                new ProductData(
                        new ProductBuilder().
                                marketSector("SPREAD").
                                secuityTypeLevel1("CONTRACT").
                                country("PL").
                                build(),
                        new FactorInformation(BigDecimal.valueOf(12.1))
                ),
                new ProductData(
                        new ProductBuilder().
                                marketSector("TREASUES").
                                secuityTypeLevel1("FUTURE").
                                country("UK").
                                build(),
                        new FactorInformation(BigDecimal.valueOf(250.4))
                )
        );
    }
}
