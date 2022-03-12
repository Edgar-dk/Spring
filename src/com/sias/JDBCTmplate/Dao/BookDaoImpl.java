package com.sias.JDBCTmplate.Dao;

import com.sias.JDBCTmplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author shkstart
 * @create 2022-01-14 19:33
 */
@Service
public class BookDaoImpl implements BookDao{

    @Autowired//把类注入了进去就可以使用了，使用调用的是本身自己的方法
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        //1.创建Sql语句,三个问号代表的是三个值，只是现在不知道是什么
        String sql="insert into student values(?,?,?)";
        //调用方法去实现
        Object[] args={book.getUserId(),book.getUsername(),book.getUstatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
        System.out.println("BookImpl中的方法被调用");
    }

    @Override
    public void updateBook(Book book) {

        //2.注意：在下面的两行代码上，需要前后的一致，否则的话，会导致错误
        String sql="update student set username=?,ustatus=? where userid=?";
        Object[] args={book.getUsername(),book.getUstatus(),book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
        System.out.println("BookImpl中的方法被调用");
    }

    @Override
    //3.删除
    public void delete(String id) {
        String sql="delete  from student where userid=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
        System.out.println("BookImpl中的方法被调用");

    }

    @Override
    //4.按照行来查询，行的标志是count
    public int selectcount( ) {
        String sql="select count(*) from student";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;//返回的数据，在返回到最上面的方法中
    }

    //5.按照返回的对象来查询，就是这一行的数据全部返回过来
    @Override
    public Book findBookInfo(String id) {
        String sql="select * from student where userid=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    //6.按照集合的形式去返回数据，就是全部的数据被返回了
    public List<Book> findAllBook() {
        String sql="select * from student";
        //一开始返回的数据是在Book中的，然后一条一条的到了集合里面存储，在返回到最上面一层。最后在数据所有的数据
//        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }




    @Override
//    7.批量添加数据
    public void bachAddBook(List<Object[]> bachArgs) {
        String sql="insert into student values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, bachArgs);//是可以做批量的增删改查的操作
        System.out.println(Arrays.toString(ints));




        //8.批量修改

    }

    @Override
    public void bachupdateBook(List<Object[]> bachArgs) {
        String sql="update student set username=?,ustatus=? where userid=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, bachArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void bachdeleteBook(List<Object[]> bachArgs) {
        String sql="delete  from student where userid=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, bachArgs);
        System.out.println(Arrays.toString(ints));
    }
}
