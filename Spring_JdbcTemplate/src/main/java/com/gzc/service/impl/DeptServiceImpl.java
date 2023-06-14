package com.gzc.service.impl;

import com.gzc.dao.impl.DeptDaoImpl;
import com.gzc.pojo.Dept;
import com.gzc.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/14  22:13  周三
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDaoImpl deptDao;

    @Override
    public List<Dept> getAllDept() {
        List<Dept> list = deptDao.selectAllDept();
        return list;
    }
}
