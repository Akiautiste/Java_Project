package com.itheima.logintest;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名");
            String scUsername = sc.nextLine();
            System.out.println("请输入密码");
            String scPassword = sc.nextLine();
            if (username.equals(scUsername) && password.equals(scPassword)){
                System.out.println("登陆成功");
                break;
            }else {
                if(i==3){
                    System.out.println("您的登录次数已达今日上限");
                }else {
                    System.out.println("登录失败,还剩"+(3-i)+"机会");
                }

            }

        }
    }
}
