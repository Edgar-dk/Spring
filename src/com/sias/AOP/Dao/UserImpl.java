package com.sias.AOP.Dao;

/**
 * @author shkstart
 * @create 2022-01-13 11:29
 */
public class UserImpl implements UserDao{

    @Override
    public int cat(int a, int b) {
        System.out.println("cat方法被执行");
        return a+b;
    }

    @Override
    public String cat1(String id) {
        System.out.println("cat1的方法执行了.....");
        return id;
    }

}
