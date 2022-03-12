package com.sias.IOC1.Bean;

/**
 * @author shkstart
 * @create 2022-01-09 17:40
 */
public class Orders {
    private String oname;

    //无参数的构造方法调用
    public Orders() {
        System.out.println("第一步，调用了无参数的构造方法");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步，调用了set方法");
    }
    public void initMethod1(){
        System.out.println("第三步，调用了初始化方法");
    }
    public void destroyMethod(){
        System.out.println("第五部，执行了销毁的方法");
    }
}
