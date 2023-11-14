package com.example.springjpa.jpaonetomany;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartJpaRepository extends CrudRepository<Cart, Long> {
}
