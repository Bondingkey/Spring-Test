package com.gzc.controller;

import com.gzc.pojo.Dept;
import com.gzc.service.DeptService;
import org.springframework.stereotype.Controller;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/12  15:09  周一
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@Controller
public class DeptController {

    private DeptService deptService;

    public void saveDept(Dept dept){
        deptService.saveDept(dept);
    }

}
