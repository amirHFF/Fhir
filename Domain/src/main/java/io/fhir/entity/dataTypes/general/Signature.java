package io.fhir.entity.dataTypes.general;/*
    Project : Fhir
    Author  : a.FouladiFar
    Created : 12:57
*/

import io.fhir.entity.dataTypes.primitive.Base64Binary;
import io.fhir.entity.dataTypes.primitive.CodeType;
import io.fhir.entity.dataTypes.primitive.Instant;
import io.fhir.entity.dataTypes.special.Reference;
import java.util.List;

public class Signature {

    private List<Coding> type;
    @Instant
    private String when;
    private Reference who;
    private Reference onBehalfOf;
    @CodeType
    private String targetFormat;
    @CodeType
    private String sigFormat;
    @Base64Binary
    private String data;
}
