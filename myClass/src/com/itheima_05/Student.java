package com.itheima_05;

public class Student {
    //成员变量
    private String name;
    private int age;
    //getter和setter方法
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public void setAge(int a) {
        age = a;
    }
    public int getAge() {
        return age;
    }
    //成员方法
    public void show() {
        System.out.println(name+","+age);
    }
}
