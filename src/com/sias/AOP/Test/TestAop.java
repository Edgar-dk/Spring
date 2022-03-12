package com.sias.AOP.Test;

import com.sias.AOP.Aopanno.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2022-01-14 13:08
 */
public class TestAop {
    @Test
    public void TestUser(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean02.xml");
        User user = context.getBean("user01", User.class);
        user.add();
    }
    


}
