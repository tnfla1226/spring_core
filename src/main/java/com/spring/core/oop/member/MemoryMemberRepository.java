package com.spring.core.oop.member;

public class MemoryMemberRepository implements MemberRepository {
    @Override
    public boolean save(Member member) {
        return false;
    }

    @Override
    public Member findById(Long id) {
        return null;
    }

}
