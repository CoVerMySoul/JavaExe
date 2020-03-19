package com.tb.exercise.doeverything.Pojo;


import java.io.Serializable;

/**
 * 描述：学生实体类
 *
 * @author: TanBoQiuYun
 * @date: 2019/10/24 11:41
 */

public class Student implements Serializable {
    private String name;
    private int age;

    public Student() {
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
}
