package com.boicehot.single.common;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

public class CommonUtils {
    private CommonUtils(){}

    /**
     * 系统十位时间戳
     */
    public static int timeTmp(){
        return (int)(System.currentTimeMillis()/1000);
    }

    /**
     * http上下文
     */
    public static HttpServletRequest request(){
        return ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
    }
}