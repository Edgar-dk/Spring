package com.sias.IOC.Class;

/**
 * @author shkstart
 * @create 2022-01-07 17:35
 */
public class Empl {
    //既然是在一个类中有一些属性，那在配置的时候，就需要写上和这些属性相关联的数据，从下面看出是用
    //的是set的方式，那在配置XMl中也需要用set的方式去为属性赋值
    private String ename;
    private String esex;
    //这是一个员工属于某一个部门，从属性的地方来注入（内部）
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEsex(String esex) {

        this.esex = esex;
    }
    public void cat(){
        //分析：在下面的输出中，写的是dept，不是，dname，因为在配置信心中是类的名字做的数据类型变量
        System.out.println(ename+"::"+esex+"::"+dept);
    }
}
