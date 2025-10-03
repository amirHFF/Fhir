package io.fhir.entity.resource.terminology;/*
    Project : Fhir
    Author  : a.FouladiFar
    Created : 12:48
*/

import io.fhir.entity.BackboneElement;
import io.fhir.entity.dataTypes.general.CodeableConcept;
import io.fhir.entity.dataTypes.general.Coding;
import io.fhir.entity.dataTypes.general.Period;
import io.fhir.entity.dataTypes.metadata.ContactDetail;
import io.fhir.entity.dataTypes.metadata.RelatedArtifact;
import io.fhir.entity.dataTypes.metadata.UsageContext;
import io.fhir.entity.dataTypes.primitive.CodeType;
import io.fhir.entity.dataTypes.primitive.DateTimeType;
import io.fhir.entity.dataTypes.primitive.DateType;
import io.fhir.entity.dataTypes.primitive.MarkDown;
import io.fhir.entity.resource.DomainResource;
import io.fhir.entity.resource.VersionAlgorithm;
import java.util.List;

public class CodeSystem extends DomainResource {

    private String uri;
    private List<String> identifier;
    private String version;
    private VersionAlgorithm versionAlgorithm;
    private String name;
    private String title;
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
    private List<RelatedArtifact> relatedArtifact;
    private Boolean caseSensitive;
    //    private ValueSet valueSet;
    @CodeType
    private String hierarchyMeaning;
    private Boolean compositional;
    private Boolean versionNeeded;
    @CodeType
    private String content;

    private List<Filter> filter;
    private List<Property> property;
    private List<Concept> concept;


    public static class Filter extends BackboneElement {

        @CodeType
        private String code;
        private String description;
        private List<String> operator;
        @CodeType
        private String value;
    }

    public static class Property extends BackboneElement {

        @CodeType
        private String code;
        private String uri;
        private String description;
        private List<String> operator;
        @CodeType
        private String value;
    }

    public static class Concept extends BackboneElement {

        @CodeType
        private String code;
        private String display;
        private String definition;
        private List<String> operator;
        private String value;
        private List<Designation> designation;
        private List<Property> property;
        private List<Concept> concept;

        public static class Designation extends BackboneElement {

            @CodeType
            private String language;
            private Coding use;
            private Coding additionalUse;
            private String value;
        }

        public static class Property extends BackboneElement {

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
