package com.emitter.test;

import com.google.inject.BindingAnnotation;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;


import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@BindingAnnotation @Target({ FIELD, PARAMETER, METHOD, MODULE }) @Retention(RUNTIME)
public @interface Configuration {
}
