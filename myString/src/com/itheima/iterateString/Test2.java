package com.itheima.iterateString;

import java.util.Scanner;

//public class Test2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入：");
//        String s = sc.nextLine();
//        for (int i = 0; i < s.length(); i++) {
//            char c=s.charAt(i);     //逐个返回索引处字符
//            System.out.println(c);
//        }
//
//    }
//}
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();   //将字符串拆分成为字符数组

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }


    }
}
