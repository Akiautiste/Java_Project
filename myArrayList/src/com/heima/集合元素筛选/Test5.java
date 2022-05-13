package com.heima.集合元素筛选;

import com.heima.domain.Student;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三",17);
        Student stu2 = new Student("李四",16);
        Student stu3 = new Student("王五",25);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        ArrayList<Student> sorted = sort(list);
        for (int i = 0; i < sorted.size(); i++) {
            System.out.println(sorted.get(i).getName()+","+sorted.get(i).getAge());
        }


    }
    public static ArrayList<Student> sort(ArrayList<Student> list){
        ArrayList<Student> newlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge()<18){
                newlist.add(list.get(i));
            }
        }
        return newlist;
    }
}


