package com.hunseong.exceptionnvalidation;

import com.hunseong.exceptionnvalidation.member.domain.Member;
import com.hunseong.exceptionnvalidation.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Hunseong on 2022/06/11
 */
@RequiredArgsConstructor
@Component
public class AppRunner implements ApplicationRunner {

    private final MemberRepository memberRepository;

    @Override
    public void run(ApplicationArguments args) {
        memberRepository.save(new Member("test@test.com"));
        memberRepository.save(new Member("test2@test2.com"));
    }
}
