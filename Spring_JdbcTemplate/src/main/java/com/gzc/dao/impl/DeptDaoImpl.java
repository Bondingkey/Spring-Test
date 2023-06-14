package com.gzc.dao.impl;

import com.gzc.dao.DeptDao;
import com.gzc.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/14  22:08  周三
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@Repository
public class DeptDaoImpl implements DeptDao {

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Dept> selectAllDept() {
        String sql = "select dept_id deptId,dept_name deptName from tbl_dept";
        RowMapper<Dept> rowMapper = new BeanPropertyRowMapper<>(Dept.class);
        List<Dept> list = jdbcTemplate.query(sql, rowMapper);
        return list;
    }
}
