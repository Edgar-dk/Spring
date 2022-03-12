package com.sias.IOC2.Test;

import com.sias.IOC2.Config.Springconfig;
import com.sias.IOC2.Service.Userservice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2022-01-12 19:11
 */
public class Spring5 {


    //1.注解的形式去创建对象
    @Test
    public void testservice(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean02.xml");
        Userservice userservice = context.getBean("userservice011", Userservice.class);
        userservice.cat();
    }


    //同上
    @Test
    public void testservice01(){
        //加载配置类
        ApplicationContext context=new AnnotationConfigApplicationContext(Springconfig.class);
        Userservice userservice = context.getBean("userservice011", Userservice.class);
        userservice.cat();
    }
}
