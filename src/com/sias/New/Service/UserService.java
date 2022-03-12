package com.sias.New.Service;

import com.sias.New.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author shkstart
 * @create 2022-01-16 11:32
 */

@Service//(value = "userService01")
//(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
public class UserService {
    @Autowired
    private UserDao userDao;

    //在UserDao中写完方法之后,需要在User service中去调用相应的钱多和钱少的方法

    public void accountMoney(){

        //多钱的方法
        userDao.addmoney();

        int i=10/0;
        //少钱的方法
        userDao.reducemoney();
    }
}
