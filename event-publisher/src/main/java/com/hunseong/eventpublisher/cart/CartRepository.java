package com.hunseong.eventpublisher.cart;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hunseong on 2022/06/12
 */
public interface CartRepository extends JpaRepository<Cart, Long> {
    void deleteByProductId(Long productId);
}
