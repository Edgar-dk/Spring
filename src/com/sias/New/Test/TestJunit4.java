package com.sias.New.Test;


import com.sias.Affairs.Service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Edgar
 * @create 2022-02-19 9:52
 */
@RunWith(SpringJUnit4ClassRunner.class)//junit4单元测试
@ContextConfiguration("classpath:bean02.xml")//加载配置文件相当于写的这个代码，ApplicationContext context=new ClassPathXmlApplicationContext("bean02.xml");
public class TestJunit4 {
    /*
    *
    * 整个junit4*/
    @Autowired
    private UserService userService;
    @Test
    public void Junit4(){
        userService.accountMoney();
    }
}
