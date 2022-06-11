package com.hunseong.eventpublisher.member;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by Hunseong on 2022/06/12
 */
@RequiredArgsConstructor
@Getter
public class MemberSignUpEvent {

    private final Member member;
}
