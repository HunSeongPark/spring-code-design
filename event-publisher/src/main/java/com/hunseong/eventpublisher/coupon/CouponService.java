package com.hunseong.eventpublisher.coupon;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * Created by Hunseong on 2022/06/12
 */
@RequiredArgsConstructor
@Service
public class CouponService {

    private final CouponRepository couponRepository;

    @Transactional
    public void issueSignUpCoupon(Long memberId) {
        couponRepository.save(new Coupon(BigDecimal.TEN, memberId));
        throw new RuntimeException("SignUpCoupon Exception");
    }
}
