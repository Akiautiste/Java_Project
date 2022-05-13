package com.itheima.overload;

public class Demo1Overload {
    public static void main(String[] args) {
        long a = 10,b = 20;
        System.out.println(compare(a,b));

    }
    public static boolean compare (int a,int b ){
        return a == b ;
    } public static boolean compare (byte a,byte b ){
        return a == b ;
    } public static boolean compare (short a,short b ){
        return a == b ;
    } public static boolean compare (long a,long b ){
        return a == b ;
    }
}
