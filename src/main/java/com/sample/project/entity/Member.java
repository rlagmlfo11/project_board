package com.sample.project.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Data
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;

	@Column(nullable = false, length = 10)
	public String name;

	@Column(nullable = false, length = 30)
	public String password;

	@Column(nullable = false, length = 100)
	public String address;

	@Column(nullable = false, length = 100)
	public String email;

	@Column(nullable = false, length = 2)
	public String gender;

	@CreationTimestamp
	private Timestamp createdTime;

	@Enumerated(EnumType.STRING)
	private EnumType role;

}
