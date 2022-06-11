package com.hunseong.eventpublisher.member;

import lombok.Getter;

/**
 * Created by Hunseong on 2022/06/12
 */
@Getter
public class MemberSignUpRequest {

    private String name;

    public Member toEntity() {
        return new Member(name);
    }
}
