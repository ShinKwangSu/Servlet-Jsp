package org.comstudy21.myapp.ex01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudyEx01TestTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("test");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("test");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("test");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("test");
	}

	@Test
	void test() {
		System.out.println("test");
	}

}
