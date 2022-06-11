package com.hunseong.eventpublisher.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Hunseong on 2022/06/12
 */
@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public void signUp(MemberSignUpRequest dto) {
        final Member member = memberRepository.save(dto.toEntity()); // 1. member save
        // 2. 외부 시스템에서 이메일 전송 로직 호출
        // 3. 회원가입 쿠폰 발급 -> 예외 발생
        // * 3에서의 문제 : Transaction에 의해 1,3은 롤백. 그러나 2는 외부 시스템 로직이므로 롤백 안됨
    }
}
