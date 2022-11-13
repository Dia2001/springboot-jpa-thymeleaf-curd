package com.demo.springmvc.thymeleaf.springbootjpathymeleafcurd.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springmvc.thymeleaf.springbootjpathymeleafcurd.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {
	
}
