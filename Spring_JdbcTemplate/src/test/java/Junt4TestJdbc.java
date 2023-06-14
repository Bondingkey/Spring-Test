import com.gzc.pojo.Dept;
import com.gzc.service.impl.DeptServiceImpl;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/14  22:17  周三
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class Junt4TestJdbc {

    @Autowired
    private DeptServiceImpl deptService;

    @Test
    public void test1(){
        for (Dept dept : deptService.getAllDept()) {
            System.out.println("dept = " + dept);
        }


    }
}
