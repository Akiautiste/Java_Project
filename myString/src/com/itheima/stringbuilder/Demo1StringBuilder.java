package com.itheima.stringbuilder;

public class Demo1StringBuilder {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5000000; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
//        method();
}

    private static void method() {
        long start = System.currentTimeMillis();//获取1970年1月1日 0时0分0秒 到当前时间所经历过的毫秒值
        System.out.println(start);
        String s = "";
        for (int i = 0; i < 50000; i++) {
           s += i;
        }
        System.out.println(s);

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
