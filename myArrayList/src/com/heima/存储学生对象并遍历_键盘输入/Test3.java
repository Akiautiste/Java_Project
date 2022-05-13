package com.heima.存储学生对象并遍历_键盘输入;

import com.heima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        ArrayList<Student> stu = getStudent(list);
        show(stu);
    }

    public static void show(ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }

    public static ArrayList<Student> getStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入第"+i+"个学生的姓名:");
            String s = sc.next();
            System.out.println("请输入第"+i+"个学生的年龄:");
            int a = sc.nextInt();
            Student stu = new Student(s,a);
            list.add(stu);


        }
        return list;
    }
}
