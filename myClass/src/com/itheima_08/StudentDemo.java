package com.itheima_08;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        s.show();

        Student s1 = new Student(12);
        s1.show();

        Student s2 = new Student("我");
        s2.show();

        Student s3 = new Student("我",13);
        s3.show();

    }
}
