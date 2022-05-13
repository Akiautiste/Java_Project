package com.itheima.sensitive_word_replacement;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();

        String tmd = s.replace("TMD", "***");
        System.out.println(tmd);

    }
}
