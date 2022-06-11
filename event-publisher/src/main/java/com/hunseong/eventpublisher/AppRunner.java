package com.hunseong.eventpublisher;

import com.hunseong.eventpublisher.cart.Cart;
import com.hunseong.eventpublisher.cart.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Hunseong on 2022/06/12
 */
@RequiredArgsConstructor
@Component
public class AppRunner implements ApplicationRunner {

    private final CartRepository cartRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        cartRepository.save(new Cart(1L));
        cartRepository.save(new Cart(2L));
        cartRepository.save(new Cart(3L));
        cartRepository.save(new Cart(4L));
        cartRepository.save(new Cart(5L));
        cartRepository.save(new Cart(6L));
    }
}
