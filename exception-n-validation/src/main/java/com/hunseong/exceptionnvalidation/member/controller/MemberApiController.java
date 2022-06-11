package com.hunseong.exceptionnvalidation.member.controller;

import com.hunseong.exceptionnvalidation.exception.CustomException;
import com.hunseong.exceptionnvalidation.exception.ErrorCode;
import com.hunseong.exceptionnvalidation.member.domain.Member;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by Hunseong on 2022/06/11
 */
@RestController
public class MemberApiController {

    @GetMapping("/member")
    public Member getMember(@RequestParam(required = false) String ex) {
        if (ex != null) {
            switch (ex) {
                case "c1" -> throw new CustomException(ErrorCode.COUPON_ALREADY_USE);
                case "c2" -> throw new CustomException(ErrorCode.LOGIN_INPUT_INVALID);
                case "c3" -> throw new RuntimeException("common exception");
            }
        }
        return new Member("hunseong", "hunseong@adf.com");
    }

    @PostMapping("/member")
    public Member createMember(@Valid @RequestBody Member member) {
        return member;
    }
}
