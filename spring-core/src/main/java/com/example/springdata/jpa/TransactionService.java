package com.example.springdata.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service
public class TransactionService {

    CrudRepository<CountryPojo, Integer> repository;

    @Autowired
    public TransactionService(CrudRepository<CountryPojo, Integer> repository) {
        this.repository = repository;
    }

    @Transactional(rollbackFor = SQLException.class)
    public void testTransactionRollback(int id) throws SQLException {
        System.out.println("\n----------- attempting to delete country with id " + id + " ---------");
        repository.deleteById(id);
        throw new SQLException("Throwing exception for demoing Rollback!!!");
    }

}
