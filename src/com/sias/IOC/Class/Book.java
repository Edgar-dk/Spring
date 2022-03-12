package com.sias.IOC.Class;

/**
 * @author shkstart
 * @create 2022-01-06 17:28
 */




/*
* 注意：set的方式为属性赋值
* */
public class Book {
    private String bname;
    private String bsuter;
    private String bcat;

    public void setBcat(String bcat) {
        this.bcat = bcat;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBsuter(String bsuter) {
        this.bsuter = bsuter;
    }
    public void cat(){
        System.out.println(bname+"::"+bsuter+"::"+bcat);
    }

//    public static void main(String[] args) {
//        book book1=new book();
//        book1.bname="张三";
//        book1.bsuter="王武";
//    }
}
