package com.uyumaz.shoppingApp.product.repository.elasticSearch;

import com.uyumaz.shoppingApp.product.domain.elasticSearch.ProductES;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;

public interface ProductESRepository extends ReactiveElasticsearchRepository<ProductES,String> {
}
