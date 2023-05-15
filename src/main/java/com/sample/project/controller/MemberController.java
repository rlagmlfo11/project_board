package com.sample.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sample.project.entity.Member;
import com.sample.project.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@PostMapping("/home")
	public String join(Member member) {
		memberService.joinMember(member);
		return "/home";
	}

}
