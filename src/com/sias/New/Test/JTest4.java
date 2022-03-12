package com.sias.New.Test;

import com.sias.New.Service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author shkstart
 * @create 2022-01-16 19:46
 */

@RunWith(SpringJUnit4ClassRunner.class)//测试版本的号是4
@ContextConfiguration("classpath:bean02.xml")//就相当于是contest的哪一个，加载配置文件的类
public class JTest4 {


    //上面的代替了加载的类，那下面的是直接可以用注解的方式把这个类加到这个类中的
    @Autowired

    private UserService userService;

    @Test
    public void test1(){
        userService.accountMoney();
    }



}
