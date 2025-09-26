package io.fhir.entity.resource;
/*
  Project : Fhir
  Author  : AmirHFF
  Created : 9/26/2025 - 10:54 AM
*/

import io.fhir.entity.Extension;
import io.fhir.entity.dataTypes.primitive.CodeType;

import java.util.List;

public class DomainResource extends Resource {

    private Narrative text;
    private List<Resource> contained;
    private List<Extension> extension;
    private List<Extension> modifierExtension;

    public static class Narrative{
        @CodeType
        private String status;
        private String div;
    }
}

