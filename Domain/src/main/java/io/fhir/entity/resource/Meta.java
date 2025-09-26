package io.fhir.entity.resource;
/*
  Project : Fhir
  Author  : AmirHFF
  Created : 9/26/2025 - 10:37 AM
*/

import io.fhir.entity.dataTypes.Element;
import io.fhir.entity.dataTypes.general.Coding;
import io.fhir.entity.dataTypes.primitive.IdType;
import io.fhir.entity.dataTypes.primitive.InstantType;

public class Meta extends Element {

    @IdType
    private long versionId;
    @InstantType
    private String lastUpdated;

    private String uri;

//    private Profile profile;
    private Coding coding;
    private Coding tag;
}

