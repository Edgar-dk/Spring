package com.sias.New.Test;

import com.sias.New.Service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author shkstart
 * @create 2022-01-16 20:08
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:bean02.xml")//就相当于是contest的哪一个，加载配置文件的类


//下面的一个注解可以代替上面两个注解的功能
@SpringJUnitConfig(locations = "classpath:bean02.xml")
public class JTest5 {

    @Autowired
    private UserService userService;

    @Test
    public void Test1(){
        userService.accountMoney();
    }
    @Test
    public void dsjo(){

    }

}
