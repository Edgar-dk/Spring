package com.sias.New.Test;

import com.sias.New.Dao.User;
import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author Edgar
 * @create 2022-02-18 22:17
 */
public class FunctionStyle {
    /*
    * 在spring中可以去自己手动创建对象，
    * 但是自己new的对象spring不知道，你自己创建了一个对象，
    * 需要把你创建的对象交给spring管理，
    * 需要一个函数式风格来操作这一步，
    * 让spring知道你创建了对象，并且可以帮助你管理。
      这就是函数式风格的作用。*/


    @Test
    public void FunctionStyle(){

        //1.去创建GenericApplicationContext对象
        GenericApplicationContext context=new GenericApplicationContext();
        //2.去调用对象里面的方法
        context.refresh();
        //自己创建的对象在交给Spring去管理，去注册
        context.registerBean("user", User.class,() -> new User());
        //3.获取Spring注册的对象
        Object user = context.getBean("user");
        System.out.println(user);//输出对象的地址
    }
}
