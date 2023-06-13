import com.gzc.aop.Calc;
import com.gzc.aop.CalcImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/13  10:49  周二
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
public class AOPTest {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Calc calc = applicationContext.getBean("calcImpl", Calc.class);

        int add = calc.add(3, 3);

        System.out.println("add = " + add);

    }
}
