package com.example.springcore.xmlbased.service;

import com.example.springcore.xmlbased.dao.AccountDao;
import com.example.springcore.xmlbased.dao.ItemDao;

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
        System.out.printf("%-50s%s%n", "setter function invoked in ", PetStoreServiceServiceImpl.class.getName());
        this.accountDao = accountDao;
    }

    public void setItemDao(ItemDao itemDao) {
        System.out.printf("%-50s%s%n", "setter function invoked in ", PetStoreServiceServiceImpl.class.getName());
        this.itemDao = itemDao;
    }
}