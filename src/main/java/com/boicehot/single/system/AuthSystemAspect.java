package com.boicehot.single.system;

import com.boicehot.single.common.CommonUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class AuthSystemAspect {

    @Pointcut("@annotation(com.boicehot.single.aop.AuthSystem)")
    public void authSystem(){}

    @Before("authSystem()")
    public void before(JoinPoint joinPoint){
        HttpServletRequest httpServletRequest = CommonUtils.request();
        // TODO 自定义授权登录校验策略
    }
}