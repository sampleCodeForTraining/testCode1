package com.example.demo.impl;

import java.math.BigDecimal;

public class ProductItem {
    private long productId;
    private BigDecimal price;

    public ProductItem(long productId) {
        this.productId = productId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
