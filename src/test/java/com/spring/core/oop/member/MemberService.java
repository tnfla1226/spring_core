package com.spring.core.oop.member;

//역할: 적당한 회원 저장소에 저장 명령을 내리는 책임
public class MemberService {

    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //회원가입 명령 기능
    public void join(Member member) {
        memberRepository.save(member);
    }

    //회원조회 명령 기능
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
