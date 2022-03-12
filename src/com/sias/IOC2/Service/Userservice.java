package com.sias.IOC2.Service;

import com.sias.IOC2.Dao.UserDao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author shkstart
 * @create 2022-01-12 19:08
 */
/*
*
* 注解的方式去创建对象和为属性赋值
* 就是在Service中去调用UseDao中的方法，调用还是UseDao在User service去创建自身的对象，在去用
* 自己的对象的名字去调用自己的方法，说白了就是在人家地方拿上自己的碗去吃自己的饭
*
* */
@Component(value = "userservice011")
public class Userservice {

    private String uname;

//    @Autowired//根据类型进行注入
//    private UserDao userDao;

    //是把当前的类注入进来，导入的是接口，然后自动去调用实现类
    @Resource
    private UserDao userDao;

    public void cat(){
        System.out.println("注解的方式创建类成功");
        userDao.cat();
    }
}
