package io.fhir.entity.resource.terminology;/*
    Project : Fhir
    Author  : a.FouladiFar
    Created : 12:48
*/

import io.fhir.entity.BackboneElement;
import io.fhir.entity.dataTypes.general.CodeableConcept;
import io.fhir.entity.dataTypes.general.Coding;
import io.fhir.entity.dataTypes.general.Identifier;
import io.fhir.entity.dataTypes.general.Period;
import io.fhir.entity.dataTypes.metadata.ContactDetail;
import io.fhir.entity.dataTypes.metadata.UsageContext;
import io.fhir.entity.dataTypes.primitive.CodeType;
import io.fhir.entity.dataTypes.primitive.DateTimeType;
import io.fhir.entity.dataTypes.primitive.DateType;
import io.fhir.entity.dataTypes.primitive.MarkDown;
import io.fhir.entity.resource.DomainResource;
import io.fhir.entity.resource.VersionAlgorithm;
import java.util.List;

public class ValueSet extends DomainResource {

    private String uri;
    private List<Identifier> identifier;
    private String version;
    private VersionAlgorithm versionAlgorithm;
    private String name;
    private String title;
    @CodeType
    private String status;
    @CodeType
    private String code;
    private Boolean experimental;
    @DateTimeType
    private String date;
    private String publisher;
    private ContactDetail contact;
    @MarkDown
    private List<String> description;
    private List<UsageContext> useContext;
    private List<CodeableConcept> jurisdiction;

    private Boolean immutable;

    @MarkDown
    private String purpose;
    @MarkDown
    private String copyRight;
    private String copyRightLabel;
    @DateType
    private String approvalDate;
    private Period effectivePeriod;
    private List<CodeableConcept> topic;
    private List<ContactDetail> author;
    private List<ContactDetail> editor;
    private List<ContactDetail> reviewer;
    private List<ContactDetail> endorser;
    private Compose compose;
    private Expansion expansion;
    private Scope scope;


    public static class Compose extends BackboneElement {
        @DateType
        private String lockedDate;
        private Boolean inactive;
        private List<Include> include;
        private List<Include> exclude;
        private List<String> property;


        public static class Include extends BackboneElement{
            private String system;
            private String version;
            private List<Concept> concept;
            private List<Concept> filter;
            private String valueSet;
            private String copyRight;


            public static class Concept extends BackboneElement{
                @CodeType
                private String code;
                private String display;

                public static class Designation extends BackboneElement{
                    @CodeType
                    private String language;
                    private Coding use;
                    private List<Coding> additionalUse;
                    private String value;

                }
            }

            public static class Filter{
                @CodeType
                private String property;
                @CodeType
                private String op;
                private String value;
            }
        }
    }
    public static class Expansion{
        private String identifier;
        private String next;
        @DateTimeType
        private String timeStamp;
        private Integer total;
        private Integer offset;
        private List<Parameter> parameter;
        private List<Property> property;
        private List<Contains> contains;

        public static class Parameter extends BackboneElement {

            @CodeType
            private String valueCode;
            private Coding valueCoding;
            private String valueString;
            private String valueInteger;
            private String valueBoolean;
            @DateTimeType
            private String valueDatTime;
            //            @DecimalType
            private String valueDecimal;

        }
        public static class Property extends BackboneElement{
            @CodeType
            private String code;
            private String uri;
        }
        public static class Contains extends BackboneElement{
            private String system;
            private Boolean isAbstract;
            private Boolean inactive;
            private Boolean version;
            @CodeType
            private String code;
            private String display;
            private List<String> designation;
            private List<property> property;
            private List<property> subProperty;
            private List<Contains> contains;


            public static class property extends BackboneElement {

                @CodeType
                private  String code;
                @CodeType
                private String valueCode;
                private Coding valueCoding;
                private String valueString;
                private String valueInteger;
                private String valueBoolean;
                @DateTimeType
                private String valueDatTime;
                //            @DecimalType
                private String valueDecimal;

            }
        }

    }
    public static class Scope{
        private static String inclusionCriteria;
        private static String exclusionCriteria;
    }
}
