package com.gzc.service;

import java.util.List;

public interface CashierService {

    public void checkOut(String username, List<String> isbns);
}
