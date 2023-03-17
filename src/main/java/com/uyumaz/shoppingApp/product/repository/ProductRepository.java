package com.uyumaz.shoppingApp.product.repository;

import com.uyumaz.shoppingApp.product.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
