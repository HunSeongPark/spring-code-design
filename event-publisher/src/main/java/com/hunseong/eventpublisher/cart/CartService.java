package com.hunseong.eventpublisher.cart;

import com.hunseong.eventpublisher.order.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Hunseong on 2022/06/12
 */
@RequiredArgsConstructor
@Service
public class CartService {

    private final CartRepository cartRepository;

    @Transactional
    public void deleteCart(Order order) {
        cartRepository.deleteByProductId(order.getProductId());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("deleteCart Exception");
    }
}
