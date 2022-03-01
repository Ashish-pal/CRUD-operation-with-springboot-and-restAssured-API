package com.firstsetup.demo.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.firstsetup.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

