package com.hunseong.eventpublisher.member;

import com.hunseong.eventpublisher.EmailSenderService;
import com.hunseong.eventpublisher.coupon.CouponService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Hunseong on 2022/06/12
 */
@RequiredArgsConstructor
@Service
public class MemberService {

    private final CouponService couponService;
//    private final EmailSenderService emailSenderService;
    private final MemberRepository memberRepository;
    private final ApplicationEventPublisher eventPublisher;

    @Transactional
    public void signUp(MemberSignUpRequest dto) {
        final Member member = memberRepository.save(dto.toEntity()); // 1. member save
//        emailSenderService.sendSignUpEmail(member);// 2. 외부 시스템에서 이메일 전송 로직 호출
        couponService.issueSignUpCoupon(member.getId());// 3. 회원가입 쿠폰 발급 -> 예외 발생
        // * 3에서의 문제 : Transaction에 의해 1,3은 롤백. 그러나 2는 외부 시스템 로직이므로 롤백 안됨
    }
}
