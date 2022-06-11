package com.hunseong.eventpublisher.order;

import com.hunseong.eventpublisher.cart.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Hunseong on 2022/06/12
 */
@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final CartService cartService;

    @Transactional
    public void doOrder(OrderRequest dto) {
        final Order order = orderRepository.save(dto.toEntity()); // 1. Order entity save
        cartService.deleteCart(order); // 2. 장바구니 제거 -> 2초 delay -> 예외 발생
        // 2의 문제 : 장바구니 제거는 예외가 발생해도 주문이 굳이 rollback 될 이유는 없음
    }
}
