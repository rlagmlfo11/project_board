package com.sample.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.project.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {

}
