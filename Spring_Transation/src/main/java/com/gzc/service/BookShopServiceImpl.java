package com.gzc.service;

import com.gzc.dao.BookShopDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
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
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void purchase(String username,String isbn){
        //查询book价格
        Integer price = bookShopDao.findBookPriceByIsbn(isbn);
        //修改库存
        bookShopDao.updateBookStock(isbn);
        //修改余额
        bookShopDao.updateUserAccount(username,price);
    }
}
