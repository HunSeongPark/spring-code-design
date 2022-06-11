package com.hunseong.exceptionnvalidation.member.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by Hunseong on 2022/06/11
 */
@RequiredArgsConstructor
@Getter
public class Member {
    private final String name;
    private final String email;
}
