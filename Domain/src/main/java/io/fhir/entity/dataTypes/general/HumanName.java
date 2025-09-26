package io.fhir.entity.dataTypes.general;

import io.fhir.entity.dataTypes.Element;
import io.fhir.entity.dataTypes.primitive.CodeType;
import java.util.List;

/*
  Project : Fhir
  Author  : AmirHFF
  Created : 9/21/2025 - 11:31 AM
*/
public class HumanName extends Element {

    @CodeType
    private String use;         // usual | official | temp | nickname | anonymous
    private String text;        // full name
    private String family;
    private List<String> given;
    private List<String> prefix;
    private List<String> suffix;
    private Period period;

    // Getters & Setters
}

