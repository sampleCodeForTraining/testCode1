package com.example.demo.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class CustomServiceImpl implements MyService {

    @Override
    public List<ProductItem> getProductItems(long productId) {
        // stub
        return new ArrayList<>();
    }
}
