package com.hunseong.eventpublisher.coupon;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Hunseong on 2022/06/12
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false, updatable = false)
    private Long memberId;

    public Coupon(BigDecimal amount, Long memberId) {
        this.amount = amount;
        this.memberId = memberId;
    }
}
