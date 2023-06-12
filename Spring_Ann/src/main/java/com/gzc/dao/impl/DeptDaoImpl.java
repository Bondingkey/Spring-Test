package com.gzc.dao.impl;

import com.gzc.dao.DeptDao;
import com.gzc.pojo.Dept;
import org.springframework.stereotype.Repository;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/12  15:04  周一
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@Repository("DeptDao")
public class DeptDaoImpl implements DeptDao {
    @Override
    public void insertDept(Dept dept) {
        System.out.println("添加部门成功了!!!");
    }
}
