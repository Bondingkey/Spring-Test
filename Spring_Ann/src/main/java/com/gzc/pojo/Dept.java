package com.gzc.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author Chunsheng Zhang 尚硅谷
 * @create 2022/3/22 14:19
 */
@Component
public class Dept {

    @Value("001")//为属性装配字面量值
    private Integer deptId;
    @Value("研发部门")//为属性装配字面量值
    private String deptName;
    private List<Employee> empList;
    private Map<Integer,Employee> employeeMap;


    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", empList=" + empList +
                ", employeeMap=" + employeeMap +
                '}';
    }

    public Map<Integer, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<Integer, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Dept() {
    }

    public Dept(Integer deptId, String deptName, List<Employee> empList, Map<Integer, Employee> employeeMap) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.empList = empList;
        this.employeeMap = employeeMap;
    }
}
