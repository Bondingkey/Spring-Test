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

    public void initmothed(){
        System.out.println("3.对象初始化");
    }
    public void destorymothed(){
        System.out.println("对象销毁");
    }

    public Student(Integer id, String name) {
        //System.out.println("通过构造器进行数值注入");
        this.id = id;
        this.name = name;
    }

    public Student() {
        System.out.println("1.创建构造器");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        System.out.println("2.设置属性");
        //System.out.println("通过Set方式注入数值验证");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}