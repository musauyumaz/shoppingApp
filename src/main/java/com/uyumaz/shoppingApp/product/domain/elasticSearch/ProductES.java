package com.uyumaz.shoppingApp.product.domain.elasticSearch;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.elasticsearch.annotations.Document;

import java.math.BigDecimal;

@Document(indexName = "product")
@Data
@EqualsAndHashCode(of = "id")
public class ProductES {
    private String id;
    private String name;
    private String code;
    private String description;
    private ComponyES seller;
    private String features;
    private BigDecimal price;
    private CategoryES category;
    private Boolean active;
}
