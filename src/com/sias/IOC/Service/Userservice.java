package com.sias.IOC.Service;

import com.sias.IOC.Dao.UserDao;

/**
 * @author shkstart
 * @create 2022-01-07 13:14
 */


/*
* XML配置的方式去创建对象和赋值
*
* */
public class Userservice {

    //外部的方式去注入类
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void add(){
        System.out.println("service 已经调用");
//        1.原始做法
//        UserDao userDao=new UserDaoImpl();
//        userDao.Update();
        //2.Bean管理器已经帮助我们去创建好对象了，可以直接去使用调用方法
        userDao.Update();
    }


}
