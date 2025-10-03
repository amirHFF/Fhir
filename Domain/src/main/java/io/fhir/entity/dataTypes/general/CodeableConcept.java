package io.fhir.entity.dataTypes.general;

import io.fhir.entity.Element;

import java.util.List;

/*
  Project : Fhir
  Author  : AmirHFF
  Created : 9/21/2025 - 10:58 AM
*/
public class CodeableConcept extends Element {
    private List<Coding> coding;
    private String text;

    public List<Coding> getCoding() {
        return coding;
    }

    public void setCoding(List<Coding> coding) {
        this.coding = coding;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

