package com.opensw.safeguard.service.join;

import com.opensw.safeguard.domain.Member;
import com.opensw.safeguard.domain.dto.DuplicateUsername;
import com.opensw.safeguard.repository.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberJoinServiceImpl implements MemberJoinService {
    private final MemberRepository memberRepository;


    @Override
    @Transactional
    public Member join(String memberId, String password, String email) {
        Member member = Member.builder()
                .username(memberId)
                .password(password)
                .email(email)
                .roles(List.of("USER"))
                .build();
        return memberRepository.save(member);
    }

    @Transactional
    @Override
    public DuplicateUsername duplicateCheckUsername(String username){
        DuplicateUsername duplicateUsername = DuplicateUsername.
                builder()
                .username(username)
                .duplicate(memberRepository.existsByUsername(username))
                .build();
        return duplicateUsername;

    }


}