package com.itheima_09;
/*
 创建对象并为其成员变量赋值的两种方式
 1：无参构造方法创建对象后使用setXxx()赋值
 2:使用带参构造方法直接创建带有属性值的对象
*/
public class StudentDemo {
    public static void main(String[] args) {
        //第一种
        Student s1 = new Student();
        s1.setName("林");
        s1.setAge(30);
        s1.show();

        //第二种
        Student s2 = new Student("林",30);
        s2.show();
    }
}
