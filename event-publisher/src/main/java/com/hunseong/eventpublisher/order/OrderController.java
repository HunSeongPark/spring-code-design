package com.hunseong.eventpublisher.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Hunseong on 2022/06/12
 */
@RequiredArgsConstructor
@RequestMapping("/orders")
@RestController
public class OrderController {

    private final OrderService orderService;
    private final OrderRepository orderRepository;

    @GetMapping
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @PostMapping
    public void doOrder(@RequestBody OrderRequest dto) {
        orderService.doOrder(dto);
    }
}
