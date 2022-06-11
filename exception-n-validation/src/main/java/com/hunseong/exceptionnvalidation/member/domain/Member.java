package com.hunseong.exceptionnvalidation.member.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * Created by Hunseong on 2022/06/11
 */
@RequiredArgsConstructor
@Getter
public class Member {

    @NotBlank
    private final String name;

    @Email
    @NotBlank
    private final String email;
}
