package com.hunseong.eventpublisher.order;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Hunseong on 2022/06/12
 */
@Table(name = "orders")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Order {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long productId;

    @Column(nullable = false)
    private BigDecimal productAmount;

    @Embedded
    private Orderer orderer;

    public Order(Long productId, BigDecimal productAmount, Orderer orderer) {
        this.productId = productId;
        this.productAmount = productAmount;
        this.orderer = orderer;
    }
}
