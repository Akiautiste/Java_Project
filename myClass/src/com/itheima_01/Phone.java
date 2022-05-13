package com.itheima_01;

public class Phone {
    //成员变量
    String brand;
    int price;
    //成员方法
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }
    public void sendMessage( ){
        System.out.println("发短信");
    }
    public void show(){
        System.out.println("手机品牌："+brand+"\t价格："+price);
    }
}


