package com.hunseong.exceptionnvalidation.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by Hunseong on 2022/06/11
 */
@Documented
@Constraint(validatedBy = EmailDuplicationValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailUnique {

    String message() default "이메일이 중복되었습니다.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
