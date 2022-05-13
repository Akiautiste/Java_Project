package com.heima.存储学生对象并遍历;

import com.heima.domain.Student;

import java.util.ArrayList;

/*
秀夹：创建一个存储学生对象的集合，存烤3个学生对象，使用程序实现在垫制台逼历该集合
思路：
1. 定义学生类
2. 创建集合对家
3. 创建学生对家
4. 添加学生对家到集合中
5. 遍历集合，采用通用遍历格式实现
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("李四",23);
        Student stu3 = new Student("王五",23);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getName()+","+student.getAge());
        }
    }
}
