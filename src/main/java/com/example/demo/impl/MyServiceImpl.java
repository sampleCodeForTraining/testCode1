package com.example.demo.impl;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class MyServiceImpl implements MyService {

    @Override
    public List<ProductItem> getProductItems(long productId) {
        // stub
        return List.of(new ProductItem(0, BigDecimal.ONE));
    }

}
