package io.fhir.entity.dataTypes.special;/*
    Project : Fhir
    Author  : a.FouladiFar
    Created : 12:57
*/

import io.fhir.entity.dataTypes.general.Identifier;

public class Reference {

    private String reference;   // e.g. Patient/123
    private String type;        // Resource type
    private Identifier identifier;
    private String display;
}
