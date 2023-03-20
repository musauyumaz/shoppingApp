package com.uyumaz.shoppingApp.product.repository.mongo;

import com.uyumaz.shoppingApp.product.domain.ProductPrice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductPriceRepository extends ReactiveMongoRepository<ProductPrice, String> {
}
