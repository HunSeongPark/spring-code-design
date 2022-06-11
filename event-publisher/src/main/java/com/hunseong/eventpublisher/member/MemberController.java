package com.hunseong.eventpublisher.member;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Hunseong on 2022/06/12
 */
@RequiredArgsConstructor
@RequestMapping("/members")
@RestController
public class MemberController {

    private final MemberService memberService;
    private final MemberRepository memberRepository;

    @GetMapping
    public List<Member> getMembers() {
        return memberRepository.findAll();
    }

    @PostMapping
    public void signUp(@RequestBody MemberSignUpRequest dto) {
        memberService.signUp(dto);
    }
}
