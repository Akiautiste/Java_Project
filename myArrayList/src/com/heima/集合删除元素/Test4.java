package com.heima.集合删除元素;

import java.util.ArrayList;

public class Test4 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("张三");
        list.add("test");

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("test")){
                //if("test".equals(s)) 避免空指针异常
                list.remove(i);
                i--; //删除元素后数据会左移1位
            }
        }
        System.out.println(list);
    }
}
