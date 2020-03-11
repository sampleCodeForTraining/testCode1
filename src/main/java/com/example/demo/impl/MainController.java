package com.example.demo.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
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

    @Autowired
    private CustomServiceImpl customService;

    @GetMapping(path = "totalPrice")
    public ResponseEntity<BigDecimal> THE_ENDPOINT(@RequestParam long productId) {
        boolean isLegacy = checkIfIsLegacy(productId);

        List<ProductItem> productItems = new ArrayList<>();

        if (isLegacy) {
            productItems = myService.getProductItems(productId);
        } else {
            productItems = customService.getProductItems(productId);
        }

        BigDecimal SUM = BigDecimal.ZERO;
        for (int i = 0; i < productItems.size(); i++) {
            SUM = SUM.add(productItems.get(i).getPrice());
        }

        return ResponseEntity.ok(SUM);
    }

    private boolean checkIfIsLegacy(@RequestParam long productId) {
        boolean isLegacy = false;

        if (productId > 10000) {
            isLegacy = false;
        }

        if (productId <= 10000) {
            isLegacy = true;
        }

        return isLegacy;
    }

}
