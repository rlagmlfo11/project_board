package com.sample.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.project.dao.MemberRepository;
import com.sample.project.entity.Member;
import com.sample.project.entity.MemberType;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;

	public void joinMember(Member member) {
		member.setRole(MemberType.USER);
		memberRepository.save(member);
	}

	public boolean loginMember(Member member) {
		Member result = memberRepository.findMemberName(member.getName());
		if (result == null) {
			return false;
		}
		if (!result.getPassword().equals(member.getPassword())) {
			return false;
		}
		return true;
	}

}
