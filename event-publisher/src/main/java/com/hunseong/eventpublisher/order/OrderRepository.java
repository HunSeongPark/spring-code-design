package com.hunseong.eventpublisher.order;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hunseong on 2022/06/12
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
