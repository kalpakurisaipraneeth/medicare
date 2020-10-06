package com.medicare.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.main.Product;
@Repository
public interface ProductDao extends JpaRepository<Product, Long>{
	
	
	public Product getProductByName(String name);


}
