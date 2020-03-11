package com.example.demo.impl;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private MyService myService;

    @GetMapping(path = "totalPrice")
    public ResponseEntity<BigDecimal> totalPriceProduct(@RequestParam long productId) {
        List<ProductItem> productItems = myService.getProductItems(productId);

        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < productItems.size(); i++) {
            sum.add(productItems.get(i).getPrice());
        }

        return ResponseEntity.ok(sum);
    }

}
