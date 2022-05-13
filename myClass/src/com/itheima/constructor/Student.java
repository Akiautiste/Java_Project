package com.itheima.constructor;

public class Student {
    private String name;
    private int age;

    public Student(String name,int age){
        this.name = name;
        this.age =age;
        System.out.println("Student类构造方法");
    }

    public void show(){
        System.out.println(name+"..."+age);
    }

}
