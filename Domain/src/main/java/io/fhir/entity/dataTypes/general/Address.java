package io.fhir.entity.dataTypes.general;
/*
  Project : Fhir
  Author  : AmirHFF
  Created : 9/21/2025 - 11:32 AM
*/

import java.util.List;

public class Address {
  private String use;         // home | work | temp | old | billing
  private String type;        // postal | physical | both
  private String text;
  private List<String> line;
  private String city;
  private String district;
  private String state;
  private String postalCode;
  private String country;
  private Period period;


}

