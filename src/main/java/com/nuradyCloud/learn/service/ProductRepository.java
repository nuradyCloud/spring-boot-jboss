package com.nuradyCloud.learn.service;

import com.nuradyCloud.learn.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
