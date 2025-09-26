package io.fhir.entity.resource;
/*
  Project : Fhir
  Author  : AmirHFF
  Created : 9/26/2025 - 12:42 PM
*/

import io.fhir.entity.dataTypes.general.CodeableConcept;
import io.fhir.entity.dataTypes.general.Period;
import io.fhir.entity.dataTypes.metadata.ContactDetail;
import io.fhir.entity.dataTypes.metadata.RelatedArtifact;

import java.util.List;

public class MetaDataResource extends CanonicalResource{
    private String approvalDate;
    private String lastReviewDate;
    private Period effectivePeriod;
    private List<CodeableConcept> topic;
    private List<ContactDetail> author;
    private List<ContactDetail> editor;
    private List<ContactDetail> reviewer;
    private List<ContactDetail> endorser;
    private List<RelatedArtifact> relatedArtifact;

}

