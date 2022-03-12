package com.sias.IOC1.collectiontype;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-01-08 16:21
 */
public class Book {

    private List<String> list;
    public void setList(List<String> list) {
        this.list = list;
    }
    public void cat(){
        System.out.println(list);
    }

}
