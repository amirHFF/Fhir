package io.fhir.entity.dataTypes.general;

import io.fhir.entity.dataTypes.primitive.DateTimeType;

public class Period {

    @DateTimeType
    private String start;

    @DateTimeType
    private String end;
}
