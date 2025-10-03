package io.fhir.entity;
/*
  Project : Fhir
  Author  : AmirHFF
  Created : 9/25/2025 - 5:22 PM
*/

import io.fhir.entity.Base;
import io.fhir.entity.Extension;

public abstract class Element extends Base {
    private long id;
    private Extension extension;
}

