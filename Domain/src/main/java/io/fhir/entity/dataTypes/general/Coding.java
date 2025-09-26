package io.fhir.entity.dataTypes.general;

import io.fhir.entity.dataTypes.Element;

/*
  Project : Fhir
  Author  : AmirHFF
  Created : 9/21/2025 - 10:59 AM
*/
public class Coding extends Element {
    private String system;
    private String version;
    private String code;
    private String display;
    private Boolean userSelected;
}

