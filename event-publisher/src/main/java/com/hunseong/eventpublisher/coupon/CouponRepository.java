package com.hunseong.eventpublisher.coupon;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hunseong on 2022/06/12
 */
public interface CouponRepository extends JpaRepository<Coupon, Long> {
}
