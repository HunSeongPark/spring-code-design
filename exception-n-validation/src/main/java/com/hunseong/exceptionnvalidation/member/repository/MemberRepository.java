package com.hunseong.exceptionnvalidation.member.repository;

import com.hunseong.exceptionnvalidation.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hunseong on 2022/06/11
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
    boolean existsByEmail(String email);
}
