package com.gzc.service;

import com.gzc.dao.BookShopDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/15  09:28  周四
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@Service("bookShopService")
public class BookShopServiceImpl implements BookShopService{

    @Autowired
    @Qualifier("bookShopDao")
    private BookShopDao bookShopDao;

    //买书-查询book价格-修改库存-修改余额
    //声明当前方法为事务方法,方法里面的代码必须同时成功或失败
    //propagation为事务的传播行为
    // Propagation.REQUIRED为一起失败
    // Propagation.REQUIRED_NEW为单独失败
    //isolation为事务的隔离级别
    //timeout为事务超时,单位为秒
    //readOnly为设置事务只读,一般用于查询事务中
    //noRollbackFor为遇到异常会报错但是不回滚事务,等号后面加异常的类.class
    @Transactional(propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.READ_COMMITTED,
            timeout = 3,
            readOnly = false,
            noRollbackFor = ArithmeticException.class)
    public void purchase(String username,String isbn){
        //查询book价格
        Integer price = bookShopDao.findBookPriceByIsbn(isbn);
        //设置timeout
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        //修改库存
        bookShopDao.updateBookStock(isbn);
        //修改余额
        bookShopDao.updateUserAccount(username,price);
        //模拟算术异常查看事务回滚与不回滚
//        try {
//            int i = 1/0;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
