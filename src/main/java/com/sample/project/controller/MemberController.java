package com.sample.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sample.project.entity.Member;
import com.sample.project.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;

	// 로그인페이지
	@GetMapping("/home")
	public String home() {
		return "home";
	}

	// 로그인성공 후 게시판페이지로 이동하기
	@PostMapping("/home")
	public String loginMember(Member member) {
		if (memberService.loginMember(member)) {
			return "redirect:/board";
		}
		return "/home";
	}

	// 회원가입페이지
	@GetMapping("/join")
	public String join() {
		return "join";
	}

	// 게시판페이지
	@GetMapping("/board")
	public String board() {
		return "board";
	}

	// 회원가입로직
	@PostMapping("/join")
	public String joinMember(Member member) {
		memberService.joinMember(member);
		return "redirect:/home";
	}
}
