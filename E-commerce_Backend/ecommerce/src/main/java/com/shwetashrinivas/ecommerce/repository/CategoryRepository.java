package com.shwetashrinivas.ecommerce.repository;

import com.shwetashrinivas.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path="product-category")  //Name of JSON entry, /product-category
public interface CategoryRepository extends JpaRepository<ProductCategory,Long> {
}
