package com.heima.遍历集合;

import java.util.ArrayList;

/*需求：创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台逼历该集合
思路：
1. 创建集合对靠
2. 往集合中添加字符串对象
3. 逼历集合
获取到集合中的每一个元素，这个通过get(int index)方法实现
获取到集合的长度，这个通过size()方法实现

 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }

}
