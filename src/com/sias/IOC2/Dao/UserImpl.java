package com.sias.IOC2.Dao;

import org.springframework.stereotype.Service;

/**
 * @author shkstart
 * @create 2022-01-12 19:51
 */
@Service(value = "userimpl01")
public class UserImpl  implements UserDao{
    public void cat() {
        System.out.println("Dao被调用");
    }
}
