package com.itheima.revert;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {19,28,37,46,50};
        for (int start = 0,end= arr.length-1; start < end; start++,end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        for (int j : arr) {
            System.out.println(j);

        }
    }
}
