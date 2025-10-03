package io.fhir.entity.dataTypes.general;

import io.fhir.entity.Element;
import io.fhir.entity.dataTypes.primitive.CodeType;
import io.fhir.entity.dataTypes.special.Reference;

/*
  Project : Fhir
  Author  : AmirHFF
  Created : 9/21/2025 - 11:31 AM
*/
public class Identifier extends Element {
    @CodeType
    private String use;         // usual | official | temp | secondary
    private CodeableConcept type;        // CodeableConcept
    private String system;      // e.g. http://hospital.org/mrn
    private String value;
    private Period period;      // start/end
    private Reference assigner;
}

