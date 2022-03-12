//package com.sias.Affairs.Test;
//
//
//import com.sias.Affairs.Config.TxConfig;
//import com.sias.Affairs.Service.UserService;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
///**
// * @author shkstart
// * @create 2022-01-15 17:50
// */
//public class TestBook {
//
//    @Test
//    public void TestAccount2(){
//        /*
//        * 配置类的方式操作数据库
//        * */
//        ApplicationContext context=new AnnotationConfigApplicationContext(TxConfig.class);
//        UserService userService = context.getBean("userService", UserService.class);
//        userService.accountMoney();
//        //可以加上01，也可以不加上（数据库中的值需要执行一次方法，更改一次方法）
//    }
//}
