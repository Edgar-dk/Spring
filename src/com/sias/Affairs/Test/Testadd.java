package com.sias.Affairs.Test;

import com.sias.Affairs.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2022-01-16 16:51
 */
public class Testadd {
    @Test
    public void TestAccount(){
        /*
        * XML的方式的事务操作数据库,在去执行这个方法的时候，需要先去，注释掉配置类的信息（不知道是什么原因）
        * */
        ApplicationContext context=new ClassPathXmlApplicationContext("bean02.xml");
        UserService userService = context.getBean("userService11111", UserService.class);
        userService.accountMoney();
        //可以加上01，也可以不加上（每次执行的话，需要更改数据库中的数值，并且注释掉，配置类的全部内容）
        //第一次尝试知道了原因，在第二次尝试的时候，直接失败
    }
}
