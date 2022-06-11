package com.hunseong.eventpublisher;

import com.hunseong.eventpublisher.member.Member;
import org.springframework.stereotype.Service;

/**
 * Created by Hunseong on 2022/06/12
 */
@Service
public class EmailSenderService {

    /**
     * 외부 인프라 서비스 호출 가정
     */
    public void sendSignUpEmail(Member member) {
        System.out.println(member.getName() + "님, 회원가입을 축하드립니다.");
    }
}
