package com.uyumaz.shoppingApp.product.repository.mongo;

import com.uyumaz.shoppingApp.product.domain.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product,String> {
}
