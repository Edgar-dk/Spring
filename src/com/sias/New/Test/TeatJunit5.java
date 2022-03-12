package com.sias.New.Test;

import com.sias.Affairs.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author Edgar
 * @create 2022-02-19 10:37
 */
//@ExtendWith(SpringExtension.class)//Junit5的整合
//@ContextConfiguration("classpath:bean02.xml")//把配置文件加入进去
@SpringJUnitConfig(locations = "classpath:bean02.xml")//可以代替上面的两个注解，既加载了配置文件，同时也是Junit5 的整合
public class TeatJunit5 {

    /*
    *
    * 整合Junit5，这个是在事务里面来测试junit的*/
    @Autowired
    private UserService userService;


    @Test
    public void Junit5(){
        userService.accountMoney();
    }
}
