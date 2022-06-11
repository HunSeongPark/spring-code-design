package com.hunseong.exceptionnvalidation.member.dto;

import com.hunseong.exceptionnvalidation.validation.EmailUnique;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;

/**
 * Created by Hunseong on 2022/06/11
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class SignUpRequest {

    @Email
    @EmailUnique
    private String email;
}
