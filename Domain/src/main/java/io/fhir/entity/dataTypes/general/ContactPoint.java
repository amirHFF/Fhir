package io.fhir.entity.dataTypes.general;

import io.fhir.entity.Element;

public class ContactPoint extends Element {
        private String system;      // phone | fax | email | pager | url | sms | other
        private String value;
        private String use;         // home | work | temp | old | mobile
        private Integer rank;       // preferred order
        private Period period;

}
