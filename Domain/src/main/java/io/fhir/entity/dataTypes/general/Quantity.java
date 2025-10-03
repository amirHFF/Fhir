package io.fhir.entity.dataTypes.general;
/*
  Project : Fhir
  Author  : AmirHFF
  Created : 9/21/2025 - 10:58 AM
*/

import io.fhir.entity.Element;

public class Quantity extends Element {
    private Double value;
    private String comparator;  // < | <= | >= | >
    private String unit;        // display unit
    private String system;      // UCUM system
    private String code;
}

