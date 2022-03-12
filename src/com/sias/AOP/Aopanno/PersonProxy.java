package com.sias.AOP.Aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2022-01-14 15:08
 */
@Component//注解的方式去创建对象
@Aspect//代理对象
@Order(1)
public class PersonProxy {
    @Before(value = "execution(* com.sias.AOP.Aopanno.User.add(..))")
    //前置通知方法
    public void before(){
        System.out.println("Persion方法之前被执行");
    }

}
