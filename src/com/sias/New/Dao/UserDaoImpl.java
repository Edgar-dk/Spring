package com.sias.New.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author shkstart
 * @create 2022-01-16 11:35
 */

@Service
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    //多钱的方法
    @Override
    public void addmoney() {
        String sql=" update account set money=money-? where username=?";
        jdbcTemplate.update(sql,100,"Luncy");//sql需要先进去之后,在写Sql中的参数,是什么,这个方法是更新数据库的
    }

    //少钱的方法
    @Override
    public void reducemoney() {
        String sql=" update account set money=money+? where username=?";
        jdbcTemplate.update(sql,100,"mary");
    }
}
