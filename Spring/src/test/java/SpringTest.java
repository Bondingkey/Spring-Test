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
public class SpringTest {

    @Test
    public void test1(){//获取getbean的方式

        //获取ioc容器对象
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取getbean的三种方式之一
//        Student stuGZC = (Student) ioc.getBean("stuGZC");
//        System.out.println("stuGZC = " + stuGZC);

        //获取getbean的三种方式之一
//        Student bean = ioc.getBean(Student.class);
//        System.out.println("bean = " + bean);

        //获取getbean的三种方式之一
        Student stuGZC = ioc.getBean("stuGZC1", Student.class);
        System.out.println("stuGZC = " + stuGZC);

    }
}
