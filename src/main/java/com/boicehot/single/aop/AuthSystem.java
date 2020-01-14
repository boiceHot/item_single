package com.boicehot.single.aop;

import java.lang.annotation.*;

/**
 * 授权
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthSystem {
}