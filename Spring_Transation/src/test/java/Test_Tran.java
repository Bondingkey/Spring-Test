import com.gzc.service.BookShopService;
import com.gzc.service.CashierService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/15  10:03  周四
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class Test_Tran {

//    @Autowired
//    private BookShopService bookShopService;
    @Autowired
    @Qualifier("cashierService")
    private CashierService  cashierService;

    @Test
    public void test1(){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("1001");
        arrayList.add("1002");
        cashierService.checkOut("zhangsan",arrayList);

    }
}
