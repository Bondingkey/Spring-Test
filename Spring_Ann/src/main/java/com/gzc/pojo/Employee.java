package com.gzc.pojo;

import org.springframework.stereotype.Component;

/**
 * @author Chunsheng Zhang 尚硅谷
 * @create 2022/3/22 14:18
 */
@Component
public class Employee {

    private Integer id;         //员工id
    private String lastName;    //员工姓名
    private String email;       //员工邮箱
    private Double salary;      //员工薪资

    private Dept dept;          //员工所属部门信息

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", dept=" + dept +
                '}';
    }

    public Employee(Integer id, String lastName, String email, Double salary, Dept dept) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
        this.dept = dept;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(Integer id, String lastName, String email, Double salary) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
    }
}
