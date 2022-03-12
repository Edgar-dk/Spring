package com.sias.IOC;

/**
 * @author shkstart
 * @create 2022-01-04 18:32
 */
public class User {
    private String Username;

    public User(String username) {
        Username = username;
    }

    public void cat(){
        System.out.println("这是你看到的数据");
        System.out.println("表示我已经创建成功");
    }
    /*
    * 1.set的方式为属性赋值
    * 2.有参构造为属性赋值
    * 3.内部注入类
    * 4.外部注入类
    * */
}
