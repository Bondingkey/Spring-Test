package com.gzc.service.impl;

import com.gzc.Dept;
import com.gzc.dao.DeptDao;
import com.gzc.dao.impl.DeptDaoImpl;
import com.gzc.service.DeptService;
import org.springframework.stereotype.Service;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/11  21:50  周日
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@Service("Service")
public class DeptServiceImpl implements DeptService {

    //buName:该属性名需要与xml文件中的id保持一直
    DeptDao deptDao;

    @Override
    public void saveDept(Dept dept) {
        deptDao.addDept(dept);
    }


    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }
}
