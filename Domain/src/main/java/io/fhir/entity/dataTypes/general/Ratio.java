package io.fhir.entity.dataTypes.general;
/*
    Project : Fhir
    Author  : a.FouladiFar
    Created : 14:13
*/

import io.fhir.entity.Element;

public class Ratio extends Element {
    private Quantity numerator;
    private Quantity denominator;
}
