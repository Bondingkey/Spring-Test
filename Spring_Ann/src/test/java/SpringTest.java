import com.gzc.conf.SpringConf;
import com.gzc.controller.DeptController;
import com.gzc.dao.impl.DeptDaoImpl;
import com.gzc.pojo.Dept;
import com.gzc.service.DeptService;
import com.gzc.service.impl.DeptServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/12  15:12  周一
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTest {

    @Test
    //测试四大注解
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        DeptDaoImpl deptDao = applicationContext.getBean("DeptDao", DeptDaoImpl.class);
        DeptController deptController = applicationContext.getBean("deptController", DeptController.class);
        Dept dept = applicationContext.getBean("dept", Dept.class);
        DeptServiceImpl deptService = applicationContext.getBean("deptServiceImpl", DeptServiceImpl.class);

        System.out.println("deptService = " + deptService);
        System.out.println("dept = " + dept);
        System.out.println("deptController = " + deptController);
        System.out.println("deptDao = " + deptDao);

    }

    @Test
    //测试注解的自动装配
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        DeptServiceImpl deptService = applicationContext.getBean("DeptService", DeptServiceImpl.class);
        deptService.saveDept(new Dept());

        //测试value注解
        Dept dept = applicationContext.getBean("dept", Dept.class);
        System.out.println("dept = " + dept);

    }

    @Test
    //0xml配置(完全注解开发)
    public void test3(){
        //通过配置类来加载配置信息
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConf.class);
        Dept dept = applicationContext.getBean("dept", Dept.class);
        System.out.println("dept = " + dept);

    }

    @Autowired
    DeptServiceImpl deptServiceImpl;
    @Test
    //Spring整合Junit4
    public void test4(){
        deptServiceImpl.saveDept(new Dept());
    }
}
