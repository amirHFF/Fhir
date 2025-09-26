package io.fhir.entity.resource;
/*
  Project : Fhir
  Author  : AmirHFF
  Created : 9/26/2025 - 10:35 AM
*/

import io.fhir.entity.Base;
import io.fhir.entity.dataTypes.primitive.CodeType;
import io.fhir.entity.dataTypes.primitive.IdType;

public class Resource extends Base {

    @IdType
    private long id;
    private Meta meta;
    private String implicitRules;
    @CodeType
    private String language;
}

