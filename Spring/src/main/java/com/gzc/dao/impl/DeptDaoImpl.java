package com.gzc.dao.impl;

import com.gzc.Dept;
import com.gzc.dao.DeptDao;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/11  21:47  周日
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
public class DeptDaoImpl implements DeptDao {
    @Override
    public void addDept(Dept dept) {
        System.out.println("添加部门方法成功了!!");
    }
}
