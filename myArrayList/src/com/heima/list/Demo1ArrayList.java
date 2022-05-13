package com.heima.list;

import java.util.ArrayList;

/* ArrayList构造方法：
Arraylist(）构造一个初始容量为 10 的空列表。
成员方法：
添加：
boolean add(E e) 将指定的元素添加到此列表的居部。
void add(int index, element）将指定的元素插入此列表中的指定位置。

 */
public class Demo1ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 集合容器如果没有<>就可以存储任意数据类型
        // <>泛型:对集合容器存储的数据类型进行限制
        list.add("abc");
        list.add("dd");

        list.add(0,"12");
        System.out.println(list);
    }
}
