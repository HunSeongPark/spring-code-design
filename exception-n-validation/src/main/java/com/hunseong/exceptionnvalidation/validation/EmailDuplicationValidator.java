package com.hunseong.exceptionnvalidation.validation;

import com.hunseong.exceptionnvalidation.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.MessageFormat;

/**
 * Created by Hunseong on 2022/06/11
 */
@Component
@RequiredArgsConstructor
public class EmailDuplicationValidator implements ConstraintValidator<EmailUnique, String> {

    private final MemberRepository memberRepository;

    @Override
    public void initialize(EmailUnique constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        boolean isExistEmail = memberRepository.existsByEmail(email);

        if (isExistEmail) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(
                    MessageFormat.format("{0} - 이미 존재하는 이메일입니다.", email)
            ).addConstraintViolation();
        }

        return !isExistEmail;
    }
}
