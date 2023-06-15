package com.gzc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/15  09:29  周四
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@Service("cashierService")
public class CashierServiceImpl implements CashierService{

    @Autowired
    @Qualifier("bookShopService")
    private BookShopService bookShopService;

    //声明当前方法为事务方法,方法里面的代码必须同时成功或失败
    @Transactional()
    public void checkOut(String username, List<String> isbns){

        for (String isbn:isbns){
            bookShopService.purchase(username,isbn);
        }
    }
}