package com.shwetashrinivas.ecommerce.repository;

import com.shwetashrinivas.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.Repository;

//@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
