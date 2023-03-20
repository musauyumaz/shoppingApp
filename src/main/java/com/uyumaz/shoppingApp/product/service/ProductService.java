package com.uyumaz.shoppingApp.product.service;

import com.uyumaz.shoppingApp.product.model.ProductResponse;
import com.uyumaz.shoppingApp.product.model.ProductSaveRequest;
import com.uyumaz.shoppingApp.product.repository.elasticSearch.ProductESRepository;
import com.uyumaz.shoppingApp.product.repository.mongo.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductESRepository productESRepository;
    private final ProductRepository productRepository;

    List<ProductResponse> getByPaging(Pageable pageable) {
        // 1 - ES den sorgula
        // 2 - Calc field'ları işle
        // 3 - redisten ihtiyaç alanlarımı getir.
        // 4 - response nesnesine dönüştür
        return null;
    }

    ProductResponse save(ProductSaveRequest productSaveRequest) {
        // 1 - mongoya yaz
        // 2 - ES'den güncelle
        // 3 - redis güncelle
        // 4 - ES den cevap dön
        // 5 - response nesnesine dönüştür
        return null;
    }
}
