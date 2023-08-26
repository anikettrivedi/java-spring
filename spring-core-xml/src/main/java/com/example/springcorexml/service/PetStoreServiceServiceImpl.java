package com.example.springcorexml.service;

import com.example.springcorexml.dao.AccountDao;
import com.example.springcorexml.dao.ItemDao;

public class PetStoreServiceServiceImpl implements PetStoreService {

    public AccountDao accountDao;
    public ItemDao itemDao;

    @Override
    public void printClassName() {
        System.out.printf("%-30s%s%s%n", "classname", " = ", PetStoreServiceServiceImpl.class.getName());
    }

    @Override
    public void printDependenciesClassNames() {
        System.out.printf("%-30s%s%s%n", "accountDao classname", " = ", accountDao.getClassName());
        System.out.printf("%-30s%s%s%n", "itemdao classname", " = ", itemDao.getClassName());
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }
}