import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.gzc.Dept;
import com.gzc.Employee;
import com.gzc.Student;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/04/14  12:28  周五
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
public class SpringTest{

    @Test
    //使用ioc管理第三方bean(以duird为例)
    public void test1() throws Exception{
            //获取容器对象
            ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext_duird.xml");

            DruidDataSource dataSource = ioc.getBean("dataSource", DruidDataSource.class);
            System.out.println("dataSource = " + dataSource);

            DruidPooledConnection connection = dataSource.getConnection();
            System.out.println("connection = " + connection);
    }

    @Test
    public void test2(){//获取getbean的方式

        //获取ioc容器对象
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取getbean的三种方式之一
        //Student stuGZC = (Student) ioc.getBean("stuGZC");
        //System.out.println("stuGZC = " + stuGZC);

        //获取getbean的三种方式之一
        //Student bean = ioc.getBean(Student.class);
        //System.out.println("bean = " + bean);

        //获取getbean的三种方式之一
        //Student stuGZC = ioc.getBean("stuGZC1", Student.class);
        //System.out.println("stuGZC = " + stuGZC);

        //引用外部已经声明的bean
        //Employee emp01 = ioc.getBean("emp01", Employee.class);
        //System.out.println("emp01 = " + emp01);

        //更改bean会导致被引用的bean也会被改
        //Dept dept = ioc.getBean("dept01", Dept.class);
        //System.out.println("dept = " + dept);

        //内部bean声明方式
        //Employee emp02 = ioc.getBean("emp02", Employee.class);
        //System.out.println("emp02 = " + emp02);

        //list集合引入方式
        //Dept dept4 = ioc.getBean("dept4",Dept.class);
        //System.out.println("dept4 = " + dept4);

        //Map集合引入方式
        //Dept dept6 = ioc.getBean("dept6", Dept.class);
        //System.out.println("dept6 = " + dept6);

        //bean的生命周期测试
        //Student stu05 = ioc.getBean("stu05", Student.class);
        //System.out.println("4.使用对象 = " + stu05);
        //第5步销毁需要使用另一个实现类中的close方法

    }

    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //bean的作用的测试
        Dept dept7 = applicationContext.getBean("dept7", Dept.class);
        Dept dept71 = applicationContext.getBean("dept7", Dept.class);
        System.out.println("是否为同一对象?" + (dept7==dept71));

    }
}
