package com.hunseong.eventpublisher.cart;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Hunseong on 2022/06/12
 */
@RequiredArgsConstructor
@RequestMapping("/carts")
@RestController
public class CartController {

    private final CartRepository cartRepository;

    @GetMapping
    public List<Cart> getCarts() {
        return cartRepository.findAll();
    }
}
