package com.sias.New.Test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Edgar
 * @create 2022-02-18 21:58
 */
public class UserLog {
    /*
    * 自定义去设置日志文件
    *
    * 先去把这个类导入进来，之后，在去掉用相应的方法，去在日志中做出想要的设置*/
    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    @Test
    public void TestLog(){
        log.warn("你好这个是警告的内容");
        log.info("你好这个是。。。。。。。（info为也不知道这个是什么意思）");
    }
}
