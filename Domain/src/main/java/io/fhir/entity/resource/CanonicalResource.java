package io.fhir.entity.resource;
/*
  Project : Fhir
  Author  : AmirHFF
  Created : 9/26/2025 - 12:19 PM
*/

import io.fhir.entity.dataTypes.general.CodeableConcept;
import io.fhir.entity.dataTypes.general.Identifier;
import io.fhir.entity.dataTypes.general.Period;
import io.fhir.entity.dataTypes.metadata.ContactDetail;
import io.fhir.entity.dataTypes.metadata.UsageContext;
import io.fhir.entity.dataTypes.primitive.CodeType;
import io.fhir.entity.dataTypes.primitive.DateTimeType;
import io.fhir.entity.dataTypes.primitive.MarkDown;
import io.fhir.entity.dataTypes.special.Reference;

import java.util.List;

public class CanonicalResource {
    private String uri;
    private List<Identifier> identifier;
    private String version;

//    private versionAlgorithms
    private String name;
    private String title;
    @CodeType
    private String status;
    private Boolean experimental;
    @DateTimeType
    private String date;
    private String publisher;
    private ContactDetail contact;
    @MarkDown
    private String description;
    private UsageContext useContext;
    private CodeableConcept jurisdiction;
    @MarkDown
    private String purpose;
    @MarkDown
    private String copyright;
    private String copyrightLabel;


}

