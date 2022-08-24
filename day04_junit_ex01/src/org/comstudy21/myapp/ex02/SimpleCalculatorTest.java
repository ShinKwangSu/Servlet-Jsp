package org.comstudy21.myapp.ex02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

class SimpleCalculatorTest {
	SimpleCalculator calc;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		calc = new SimpleCalculator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("더하기 기능 테스트")
	void test_add() {
		System.out.println("calc.add(1, 2) ==> " + calc.add(1, 2));
		int result = calc.add(1, 2);
		assertAll(
				() -> assertEquals(3,  result),
				() -> assertTrue(result > 0),
				() -> System.out.println("더하기 다음 기능")
		);
	}

	@Test
	@Disabled
	@DisplayName("빼기 기능 테스트")
	void test_sub() {
		System.out.println("빼기");
	}

	@Test
	@DisplayName("곱하기 기능 테스트")
	@EnabledIfEnvironmentVariable(named = "TEST_JUNIT", matches = "gogo")
	void test_mul() {
		System.out.println("곱하기");
	}

	@Test
	@DisplayName("나누기 기능 테스트")
	void test_div() {
		System.out.println("나누기");
	}

}