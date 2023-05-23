package com.sample.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sample.project.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {

	@Query(value = "select * from member where name = ?", nativeQuery = true)
	Member findMemberName(String name);

}
