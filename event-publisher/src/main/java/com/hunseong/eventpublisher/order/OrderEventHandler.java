package com.hunseong.eventpublisher.order;

import com.hunseong.eventpublisher.cart.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by Hunseong on 2022/06/12
 */
@RequiredArgsConstructor
@Component
public class OrderEventHandler {

    private final CartService cartService;

    @Async
    @EventListener
    public void orderCompletedEventListener(OrderCompletedEvent event) {
        cartService.deleteCart(event.getOrder());
    }
}
