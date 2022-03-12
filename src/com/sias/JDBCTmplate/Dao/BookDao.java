package com.sias.JDBCTmplate.Dao;

import com.sias.JDBCTmplate.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-01-14 19:33
 */
@Service
public interface BookDao {
    public void add(Book book);

    public void updateBook(Book book);
    public void delete(String  id);

    public  int selectcount( );

   public Book findBookInfo(String  id);

   public List<Book> findAllBook();

    void bachAddBook(List<Object[]> bachArgs);

    void bachupdateBook(List<Object[]> bachArgs);

    void bachdeleteBook(List<Object[]> bachArgs);
}
