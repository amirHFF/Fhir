package io.fhir.entity.dataTypes.primitive;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface OidType {
    String regex = "urn:oid:[0-2](\\.(0|[1-9][0-9]*))+";
}
