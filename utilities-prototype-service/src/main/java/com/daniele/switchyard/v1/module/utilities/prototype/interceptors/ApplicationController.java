package com.daniele.switchyard.v1.module.utilities.prototype.interceptors;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;
import javax.interceptor.InterceptorBinding;
/**
 * @company daniele
 * @author daniele
 * @mail danielematteo90@gmail.com
 * @date 7/18/2017
 * @time 14:00
 * @version 0.1
 * 
 */
@InterceptorBinding
@Target({TYPE,METHOD, FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface ApplicationController {

}
