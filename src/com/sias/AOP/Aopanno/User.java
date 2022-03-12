package com.sias.AOP.Aopanno;
//注解的方式去增强方法

import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2022-01-13 16:50
 */


/*
*
* 被增强的类*/
@Component(value = "user01")
public class User {
    public void add(){
        System.out.println("add方法被执行了......");
    }

}
