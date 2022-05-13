package com.heima.array;

import com.heima.domain.Student;

/*需求：浮（张三，23）（李四，24)（王五，25）
        封裝为3个学生对象并存入数组
        随后逼历数组，将学生信息输出在控制台
        思路：
        1. 定义学生类准备用于封裝数据
        2. 动态初始化长度为3的数组，类型为Student类型
        3. 根据需求创建3个学生对象
        4. 将学生对象存入数组
        5. 逼历数纽，取出每一个学生对象
        6. 调用对象的getXxx方法获取学生信息，并粉出在控制台

 */
public class TestObjectArray {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("李四",24);
        Student stu3 = new Student("王五",25);

        arr[0]=stu1;
        arr[1]=stu2;
        arr[2]=stu3;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName()+","+arr[i].getAge());
        }


    }
}
