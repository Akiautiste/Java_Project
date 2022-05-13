package com.itheima.stringCount.stringSplit;

import com.itheima.domain.Student;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生信息");
        String stuInfo = sc.nextLine();

        String[] split = stuInfo.split("，");
//        System.out.println(split[0]);
//        System.out.println(split[1]);

        Student stu = new Student(split[0],split[1]);

        System.out.println(stu.getName()+"..."+stu.getAge());
    }
}
