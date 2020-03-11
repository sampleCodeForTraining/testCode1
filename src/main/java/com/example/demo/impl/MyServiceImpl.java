package com.example.demo.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class MyServiceImpl implements MyService {

    @Override
    public List<ProductItem> getProductItems(long productId) {
        return new ArrayList<>();
    }

}
