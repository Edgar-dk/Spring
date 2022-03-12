package com.sias.IOC1.automic;

/**
 * @author shkstart
 * @create 2022-01-09 19:03
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }
    public void cat(){
        System.out.println(dept);
    }
}
