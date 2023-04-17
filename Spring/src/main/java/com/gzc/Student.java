package com.gzc;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/04/14  12:23  周五
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
public class Student {

    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}