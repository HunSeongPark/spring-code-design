package com.hunseong.eventpublisher.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Created by Hunseong on 2022/06/12
 */
@Getter
@RequiredArgsConstructor
public class OrderCompletedEvent {

    private final Order order;

}
