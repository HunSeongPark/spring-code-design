package com.hunseong.exceptionnvalidation.member.controller;

import com.hunseong.exceptionnvalidation.member.dto.SignUpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by Hunseong on 2022/06/11
 */
@RequestMapping("/members")
@RestController
public class MemberApiController {

    @PostMapping
    public void create(@Valid @RequestBody SignUpRequest dto) {

    }
}
