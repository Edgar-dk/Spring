package com.sias.IOC.Test;

//import org.junit.Test;

import com.sias.IOC.Class.Empl;
import com.sias.IOC.Service.Userservice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2022-01-07 16:48
 */
public class Bean {
//    在测试里面需要写上方法，在方法里面在写上创建对象的内容


    //1.外部注入，测试第一个代码（set的方式）
    @Test
    public void testbean(){
        //01.加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean02.xml");
        //02.获取配置创建的对象
        //context.getBean是获取创建好对象的方法，第一个参数是获取具体的
        Userservice userservice=context.getBean("userservice01",Userservice.class);
        userservice.add();
    }


    //2.内部注入
    @Test
    public void testbean01(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean02.xml");
        Empl empl=context.getBean("empl01",Empl.class);
        empl.cat();
    }

    //3.级联赋值
    @Test
    public void cascade(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean02.xml");
        Empl empl = context.getBean("empl02", Empl.class);
        empl.cat();
    }
    }



