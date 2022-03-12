package com.sias.IOC1.factorybean;

import com.sias.IOC1.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author shkstart
 * @create 2022-01-09 13:26
 */
public class Mybean implements FactoryBean<Course> {

//    private String fname;
//
//    public void setFname(String fname) {
//        this.fname = fname;
//    }
//    public  void cat(){
//        System.out.println(fname);
//    }
    //虽然是定义了Bean，但是不会返回这个类，是因为返回的是下面写的类型，是course,
    //至于为什么返回的是这样的类型，原因是在Bean这个类是继承了Factory这个类，又是泛型的方式
    //在下面的方法中的类型也是这个类型的数据类型，所以返回的是继承，工厂类中定义的那个course数据
    @Override
    public Course getObject() throws Exception {
        //泛型定义好的，所以是可以直接去使用的
        Course course=new Course();
        course.setCname("sab");
        return course;
    }
    @Override
    public Class<?> getObjectType() {
        return null;
    }
    @Override
    public boolean isSingleton() {
        return false;
    }
}
