package com.itheima.api;

import java.util.Scanner;

public class Demo1Scanner {
    // next():遇到空格，不在录入数据
    //结束标记：空格，tab键
    // nextLine():可以将数据完整的接收过来
    //结束标记：回车符换行
    public static void main(String[] args) {
        //1.创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        //2.调用nextLine方法接受字符串
        //ctrl + alt + v:快速生成方法的返回值
        String s = sc.next();
        System.out.println(s);
    }
}
