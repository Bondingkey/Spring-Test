package com.gzc.service.impl;

import com.gzc.dao.DeptDao;
import com.gzc.pojo.Dept;
import com.gzc.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/12  15:06  周一
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired()//为属性设置自动装配,先按type后name,required为是否使用强制装配,ture:不装配会报错
    @Qualifier("DeptDao")//用来将beanId对应的对象注入到属性中,不能单独使用需配合Autowired
    private DeptDao deptDao;

    @Override
    public void saveDept(Dept dept) {
        deptDao.insertDept(dept);
    }

}
