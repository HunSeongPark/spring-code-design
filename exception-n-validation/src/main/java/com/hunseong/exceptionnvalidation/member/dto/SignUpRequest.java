package com.hunseong.exceptionnvalidation.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Email;

/**
 * Created by Hunseong on 2022/06/11
 */
@Getter
@AllArgsConstructor
public class SignUpRequest {

    @Email
    private String email;
}
