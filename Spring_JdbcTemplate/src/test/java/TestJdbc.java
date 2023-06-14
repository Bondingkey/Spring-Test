import com.gzc.pojo.Dept;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/14  20:59  周三
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
public class TestJdbc {

    @Test
    //环境搭建测试
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println("jdbcTemplate = " + jdbcTemplate);
    }

    @Test
    //测试API
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);

//        //增
//        String sql="insert into tbl_dept(dept_name) values(?)";
//        jdbcTemplate.update(sql,"研发部");

//        //删
//        String sql="delete from tbl_dept where dept_id=?";
//        jdbcTemplate.update(sql,34);

//        //改
//        String sql="update tbl_dept set dept_name=? where dept_id=?";
//        jdbcTemplate.update(sql,"行政部",1);

//        //批量增
//        String sql = "insert into tbl_dept(dept_name) values(?)";
//        List<Object[]> dept = new ArrayList<>();
//        dept.add(new Object[]{"人事部"});
//        dept.add(new Object[]{"经理部"});
//        dept.add(new Object[]{"财务部"});
//        dept.add(new Object[]{"后勤部"});
//        jdbcTemplate.batchUpdate(sql,dept);

//        //查询单个数值
//        String sql = "select count(1) from tbl_dept";
//        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
//        System.out.println("部门数量 = " + integer);

//        //查询单个对象
//        String sql="select dept_id deptId,dept_name deptName from tbl_dept where dept_id=?";
          //准备一个RowMapper类(需要标明你要封装的类)
//        RowMapper<Dept> rowMapper = new BeanPropertyRowMapper<>(Dept.class);
//        Dept dept = jdbcTemplate.queryForObject(sql,rowMapper, 1);
//        System.out.println("dept = " + dept);

//        //查询所有
//        String sql = "select dept_id deptId,dept_name deptName from tbl_dept";
//        RowMapper<Dept> rowMapper = new BeanPropertyRowMapper<>(Dept.class);
//        List<Dept> query = jdbcTemplate.query(sql, rowMapper);
//        for (Dept dept: query) {
//
//            System.out.println("dept = " + dept);
//        }


    }
}
