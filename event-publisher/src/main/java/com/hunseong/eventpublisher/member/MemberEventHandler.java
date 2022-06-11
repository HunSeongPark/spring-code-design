package com.hunseong.eventpublisher.member;

import com.hunseong.eventpublisher.EmailSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * Created by Hunseong on 2022/06/12
 */
@RequiredArgsConstructor
@Component
public class MemberEventHandler {

    private final EmailSenderService emailSenderService;

    @TransactionalEventListener
    public void memberSignUpEventListener(MemberSignUpEvent dto) {
        emailSenderService.sendSignUpEmail(dto.getMember());
    }
}
