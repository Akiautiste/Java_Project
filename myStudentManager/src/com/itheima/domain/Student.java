package com.itheima.domain;

public class Student {
    private String sig;
    private String name;
    private int age;
    private String birthday;

    public Student() {
    }

    public Student(String sig, String name, int age, String birthday) {
        this.sig = sig;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getSig() {
        return sig;
    }

    public void setSig(String sig) {
        this.sig = sig;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
