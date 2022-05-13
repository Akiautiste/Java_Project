package com.itheima.phoneNumberBlock;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String telString = sc.nextLine();

        String start = telString.substring(0, 3);
        String end = telString.substring(7);
        System.out.println(start+"****"+end);

    }
}
