package com.itheima.Symmetric_String;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入对称字符串");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        String s1 = sb.reverse().toString();
        //s:String
        //sb:StringBuilder
        if(s.equals(s1)){
            System.out.println("是对称字符串");
        }else {
            System.out.println("不是对称字符串");
        }
    }
}
