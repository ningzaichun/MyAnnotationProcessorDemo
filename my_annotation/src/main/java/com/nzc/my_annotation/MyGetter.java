package com.nzc.my_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ASUS
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface MyGetter {
}
