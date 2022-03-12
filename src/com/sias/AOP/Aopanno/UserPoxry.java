package com.sias.AOP.Aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2022-01-13 16:51
 */


/*
* 增强的类
* */
@Component
@Aspect//这个注解的目的是生成一个代理对象，可以为User这个类去增强方法，这只是一个注解，就是一个标明，最终的实现还是需要
    //在XML中配置去实现，在XML中是生成代理对象的一步
@Order(2)
public class UserPoxry {
    //相同切入点
    @Pointcut(value = "execution(* com.sias.AOP.Aopanno.User.add(..))")
    public void pointcut(){
    }
    @Before(value = "pointcut()")
    //前置通知方法
    public void before(){
        System.out.println("方法之前被执行");
    }
    //后置切入点
    @After(value = "execution(* com.sias.AOP.Aopanno.User.add(..))")
    public void after(){
        System.out.println("方法之后执行");
    }
    //围绕切入点
    @Around(value = "execution(* com.sias.AOP.Aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前执行");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后执行");
    }
    @AfterReturning(value = "execution(* com.sias.AOP.Aopanno.User.add(..))")
    public void afterReturn(){
        System.out.println("dhsidhishd");
    }
    //异常切入点
    @AfterThrowing(value = "execution(* com.sias.AOP.Aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("dsdhsodpdkw。。。。。。。");
    }


}
