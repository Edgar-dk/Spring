package com.sias.IOC1.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author shkstart
 * @create 2022-01-08 11:52
 */
public class Student {
    private String[] course;
    private List<String> lname;//list是按照进入的顺序排列，数据是可以重复的，可以按照索引值来查找
    private Set<String> set;//set是按照里面的顺序排列数据，数据是不可以重复的。set和list是继承了collection
    private Map<String,String> map;//是健值对的数据关系，是和Python中的字典差不多的，一个key，对应一个value,key不可重复
    private List<Course> courseList;//为什数据类型是course的时候，因为在调用student的时候，会执行course中的方法，这个时候
                                     //起到了作用，因为方法虽然是执行了，但是有关的数据咋弄，那就需要返回到第一个类中来显示，至于
                                      //怎么返回的，这样的数据类型就起到了作用，来返回数据到student中显示打印

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public void setLname(List<String> lname) {
        this.lname = lname;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
    public void cat(){
        System.out.println(Arrays.toString(course));
        System.out.println(lname);
        System.out.println(set);
        System.out.println(map);
        System.out.println(courseList);
    }
}
