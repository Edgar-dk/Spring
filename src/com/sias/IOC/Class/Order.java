package com.sias.IOC.Class;

/**
 * @author shkstart
 * @create 2022-01-06 21:30
 */



/*
* 注意：有参数的方式为属性赋值*/
public class Order {
    private String Oname;
    private String Oaddress;
    private String Ocat;

    public Order(String oname, String oaddress) {
        Oname = oname;
        Oaddress = oaddress;
    }

    public void cat(){
        System.out.println(Oaddress+"::"+Oname);
    }
//
//    public static void main(String[] args) {
//
//    }
}
