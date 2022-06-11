package com.hunseong.eventpublisher.order;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * Created by Hunseong on 2022/06/12
 */
@Getter
public class OrderRequest {

    private Long productId;
    private BigDecimal productAmount;
    private Orderer orderer;

    public Order toEntity() {
        return new Order(productId, productAmount, orderer);
    }
}
