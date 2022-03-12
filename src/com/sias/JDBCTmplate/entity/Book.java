package com.sias.JDBCTmplate.entity;

/**
 * @author shkstart
 * @create 2022-01-14 21:23
 */
public class Book {

    /*
    * 分析：至于为什么写这样的代码的原因是因为，下面的代码相当于是在Sql中表的底层代码，那些表上的值
    * 需要设置是多少，这些代码， 是可以设置这些值的，通过get的方式去得到，在通过set的方式去设置
    * book 对象是一个设置值和的到值的类*/
    private String username;
    private String userId;
    private String ustatus;

    @Override
    public String toString() {
        return "Book{" +
                "username='" + username + '\'' +
                ", userId='" + userId + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }
}
