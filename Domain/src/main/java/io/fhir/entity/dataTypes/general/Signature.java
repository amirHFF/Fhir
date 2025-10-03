package io.fhir.entity.dataTypes.general;/*
    Project : Fhir
    Author  : a.FouladiFar
    Created : 12:57
*/

import io.fhir.entity.Element;
import io.fhir.entity.dataTypes.primitive.Base64BinaryType;
import io.fhir.entity.dataTypes.primitive.CodeType;
import io.fhir.entity.dataTypes.primitive.InstantType;
import io.fhir.entity.dataTypes.special.Reference;
import java.util.List;

public class Signature extends Element {

    private List<Coding> type;
    @InstantType
    private String when;
    private Reference who;
    private Reference onBehalfOf;
    @CodeType
    private String targetFormat;
    @CodeType
    private String sigFormat;
    @Base64BinaryType
    private String data;
}
