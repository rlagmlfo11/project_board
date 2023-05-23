package com.sample.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SampleTest {

	@BeforeEach
	void before() {
		System.out.println("TESTING");
	}

	@Test
	@DisplayName("test1입니당")
	void test1() {

		int a = 5;
		int b = 10;
		int sum = a + b;

		assertEquals(15, sum);
		System.out.println("test1입니다");
	}

	@Test
	@DisplayName("test2입니다")
	void test2() {

		String a = "hello";
		String b = a;
		String c = "hello";

		assertEquals("hello spring", a);
		System.out.println("test2입니당");
	}

}
