package com.sias.IOC1.Test;

import com.sias.IOC1.Bean.Orders;
import com.sias.IOC1.automic.Emp;
import com.sias.IOC1.collectiontype.Book;
import com.sias.IOC1.collectiontype.Course;
import com.sias.IOC1.collectiontype.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2022-01-08 12:37
 */
public class Spring5 {

    //1.注入集合（set的方式）
    @Test
    public void TestStudent(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean02.xml");
        Student student=context.getBean("student01", Student.class);
        student.cat();
    }

    //2.提取出来公共使用（set的方式）
    @Test
    public void TestBook(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean02.xml");
        Book book=context.getBean("book01", Book.class);
        book.cat();
    }

    //3.Bean的种类（工厂Bean）
    @Test
    public void TestMybean(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean02.xml");
        Course course=context.getBean("mybean01", Course.class);
        System.out.println(course);
    }

    //4.Bean的生命周期
    @Test
    public void TestBean(){
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("bean02.xml");
        Orders orders=context.getBean("orders01",Orders.class);
        System.out.println("第四步，获取到了");
        System.out.println(orders);
        context.close();
    }

    //5.自动装配
    @Test
    public void Testemp(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean02.xml");
        Emp emp =context.getBean("emp01", Emp.class);
        /*01.输出里面的tostring，没有的话，在对象*/
        System.out.println(emp);
        emp.cat();
    }
}
