package com.itheima_01;

public class PhoneDemo {
    public static void main(String[] args) {
        //创建对象
        Phone phone = new Phone();
        //使用成员变量
        System.out.println(phone.brand);
        System.out.println(phone.price);

        phone.brand = "小米";
        phone.price = 2999;

        System.out.println(phone.brand);
        System.out.println(phone.price);
        //使用成员方法
        phone.call("的");
        phone.sendMessage();
        phone.show();

    }
}
