package com.sias.JDBCTmplate.Service;

import com.sias.JDBCTmplate.Dao.BookDao;
import com.sias.JDBCTmplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-01-14 19:31
 */
@Service(value = "bookservice01")//注解的方式去创建对象
public class Bookservice {
    //注解的方式添加其他类，所以是可以在addBook 中去调用自己的方法的
    @Autowired
    private BookDao bookDao;


    /*
    * 方法中的参数是类的原因是，可以获取到这个类的地址，就是获得了一份
    * book 类的属性和方法，就可以对book这个类操作
    * */
    public void addBook(Book book){
        bookDao.add(book);
    }
    public void updataBook(Book book){
        bookDao.updateBook(book);
    }
    public void deleteBook(String  id){
        bookDao.delete(id);
    }

    //按照行来查询
    public int findCount() {
        return bookDao.selectcount();
    }
    //按照返回的对象来查询
    public Book findOne(String  id){
        return bookDao.findBookInfo(id);
    }

    //按照集合的形式去返回数据,返回的是集合的形式，所以在写类型的时候，也是需要把类型修改的
    //因为数据最终要过来，过来的数据是和方法的类型要一致的
    public List<Book> findList(){
        return bookDao.findAllBook();
    }

    //批量添加数据
    public void bachAdd(List<Object[]> bachArgs){
        bookDao.bachAddBook(bachArgs);
    }

    //批量修改数据
    public void bachupdate(List<Object[]> bachArgs){
        bookDao.bachupdateBook(bachArgs);
    }

    //批量删除
    public void bachdelete(List<Object[]> bachArgs){
        bookDao.bachdeleteBook(bachArgs);
    }




}
