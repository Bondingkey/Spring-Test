package com.gzc.dao;

public interface BookShopDao {

    //根据书号查询书的价格
    public Integer findBookPriceByIsbn(String isbn);
    //根据书号修改书的库存(需求:每次只能买一本书,如果库存<=0,则抛出异常)
    public void updateBookStock(String isbn);
    //根据书的价格修改用户的余额(需求:如果用户余额不足,则抛出异常)
    public void updateUserAccount(String username,Integer price);
}
