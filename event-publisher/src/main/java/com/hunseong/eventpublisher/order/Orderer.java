package com.hunseong.eventpublisher.order;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 * Created by Hunseong on 2022/06/12
 */
@Getter
@Embeddable
public class Orderer {

    @Column(nullable = false, updatable = false)
    private Long memberId;

    @Column(nullable = false, updatable = false)
    private String email;
}
