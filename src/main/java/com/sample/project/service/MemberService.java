package com.sample.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.project.dao.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;

}
