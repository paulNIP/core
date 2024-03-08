package com.opolos.core.repository.products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.opolos.core.models.products.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
   
}
