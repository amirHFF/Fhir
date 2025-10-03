package io.fhir.entity.dataTypes.general;

import io.fhir.entity.Element;
import io.fhir.entity.dataTypes.primitive.DateTimeType;

public class Period extends Element {

    @DateTimeType
    private String start;

    @DateTimeType
    private String end;
}
