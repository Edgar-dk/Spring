package com.sias.IOC.Test;

import com.sias.IOC.Class.Book;
import com.sias.IOC.Class.Order;
import com.sias.IOC.Service.Userservice;
import com.sias.IOC.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2022-01-04 18:33
 */
public class Spring {
    @Test
    public void Testadd(){
        //先通过在Spring中的一个对象来获取上下文中的信息，加载进入
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        //在获取创建的对象，获取方法，在调用方法
        User user= context.getBean("user", User.class);
        System.out.println(user);//输出的是对象的地址
        user.cat();
    }

    //2.set的方式为属性赋值
    @Test
    public void Testbook(){
        //先通过在Spring中的一个对象来获取上下文中的信息，加载进入
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        //在获取创建的对象，获取方法，在调用方法
        Book book= context.getBean("book01", Book.class);
        System.out.println(book);//输出的是对象的地址
        book.cat();
    }

    //3.有参数的构造方式为属性赋值
    @Test
    public void TestOrder(){
        //先通过在Spring中的一个对象来获取上下文中的信息，加载进入
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        //在获取创建的对象，获取方法，在调用方法
        Order order= context.getBean("order1", Order.class);
        System.out.println(order);//输出的是对象的地址
        order.cat();
    }

    @Test
    public void testbean(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean02.xml");
        Userservice userservice=context.getBean("userservice01",Userservice.class);
        userservice.add();
    }
}

