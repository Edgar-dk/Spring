package com.sias.JDBCTmplate.Test;

import com.sias.JDBCTmplate.Service.Bookservice;
import com.sias.JDBCTmplate.entity.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2022-01-15 17:50
 */
public class TestBook {
    @Test
    public void testJabcTmplate(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean02.xml");
        Bookservice bookservice = context.getBean("bookservice01", Bookservice.class);
        //1.添加
        Book book=new Book();
        book.setUserId("202010541111");
        book.setUsername("王五");
        book.setUstatus("部长");
        bookservice.addBook(book);

        //2.修改
//        Book book=new Book();
//        book.setUserId("202010541");
//        book.setUsername("小李");
//        book.setUstatus("省长");
//        bookservice.updataBook(book);

        //3.删除
//        bookservice.deleteBook("202010541");



        //4.按照行来查询有多少
//        int count=bookservice.findCount();
//        System.out.println(count);


        //5.按照对象来查询,说白了就是查询完这一行的全部数据，在返回过来，接受
        //接受的对象是Book
//        Book book = bookservice.findOne("202010541");
//        System.out.println(book);




        //6.返回集合的形式去接受数据，就是全部的数据
//        List<Book> All = bookservice.findList();
//        System.out.println(All);





//        7.批量添加
        //这是一个集合的形式，是可以在集合里面写任何类型的，所以是OBject类型的数组
//        List<Object[]> bachArgs =new ArrayList<>();
//        //添加数据是以数组的形式往里面写入数据的
//        Object [] o1={"3","java","s"};
//        Object [] o2={"4","C#","t"};
//        bachArgs.add(o1);
//        bachArgs.add(o2);
//        bookservice.bachAdd(bachArgs);



//        8.批量修改
//        List<Object[]> bachArgs =new ArrayList<>();
//        //添加数据是以数组的形式往里面写入数据的
//        Object [] o1={"java111","s3","3"};
//        Object [] o2={"C#1111","t4","4"};
//        bachArgs.add(o1);
//        bachArgs.add(o2);
//        bookserv
//        ice.bachupdate(bachArgs);





//        9.批量删除
//        List<Object[]> bachArgs =new ArrayList<>();
//        //添加数据是以数组的形式往里面写入数据的
//        Object [] o1={"3"};
//        Object [] o2={"4"};
//        bachArgs.add(o1);
//        bachArgs.add(o2);
//        bookservice.bachdelete(bachArgs);

    }
}
