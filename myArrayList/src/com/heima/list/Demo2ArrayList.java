package com.heima.list;

import java.util.ArrayList;

/*集合常历成员万法：
添加：
boolean add(E e) 将脂定的元素添加到此列表的居部。
void add(int index, E element）将指定的元素病入此列表中的指定位置。
网除：
public boolean remove(Object o)關除指定的元素，返回册除是否成功
public E remove(int index) 册除指定菜引处的元素，返回被册除的元素
修改：
public E set(int index, E element) 修改指定菜引处的元素，返回被修改的元素
查询：
public E get(int index) 返回指定菜引处的元素
public int size() 返回集合中的元素的个数

 */
public class Demo2ArrayList {
    public static void main(String[] args) {
//        testremove();
//        testset();

    }

    public static void testset() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("123");
        list.add("456");
        list.add("889");
        list.add("901");
        String set = list.set(0, "666");
        System.out.println(set);
        System.out.println(list);
    }
    public static void testremove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("123");
        list.add("456");
        list.add("889");
        list.add("901");

        boolean b1 = list.remove("abc");
        boolean z2 = list.remove("zzz");
        System.out.println(b1);
        System.out.println(z2);
        System.out.println(list);

        String s = list.remove(0);

        System.out.println(s);
        System.out.println(list);
    }
}
