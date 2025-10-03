package io.fhir.entity.dataTypes.general;
/*
    Project : Fhir
    Author  : a.FouladiFar
    Created : 14:12
*/

import io.fhir.entity.Element;
import io.fhir.entity.dataTypes.primitive.DateTimeType;
import io.fhir.entity.dataTypes.special.Reference;

public class Annotation extends Element {

    private Reference authorReference;
    private String authorString;
    @DateTimeType
    private String time;
    private String text;
}
