package com.hunseong.eventpublisher.member;

import com.hunseong.eventpublisher.EmailSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by Hunseong on 2022/06/12
 */
@RequiredArgsConstructor
@Component
public class MemberEventHandler {

    private final EmailSenderService emailSenderService;

    @EventListener
    public void memberSignUpEventListener(MemberSignUpEvent dto) {
        emailSenderService.sendSignUpEmail(dto.getMember());
    }
}
