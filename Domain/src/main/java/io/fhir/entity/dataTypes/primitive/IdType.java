package io.fhir.entity.dataTypes.primitive;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface IdType {
    String regex = "[A-Za-z0-9\\-\\.]{1,64}";
}
