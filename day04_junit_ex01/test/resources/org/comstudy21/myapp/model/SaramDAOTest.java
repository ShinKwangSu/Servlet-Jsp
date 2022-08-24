package org.comstudy21.myapp.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SaramDAOTest {
	SaramDAO dao;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		dao = new SaramDAO();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSelectAll() {
		//SaramDTO dto = new SaramDTO();
		List<SaramDTO> list = dao.selectAll();
		assertNotNull(list);
		assertTrue(list.size() > 0);
		System.out.println(list);
	}

	@Test
	void testSelectOne() {
		fail("Not yet implemented");
	}

	@Test
	void testFindByName() {
		SaramDTO dto = new SaramDTO(0, "shin", "", "");
		List<SaramDTO> list = dao.findByName(dto);
		assertNotNull(list);
		assertTrue(list.size() > 0);
		System.out.println(list);
	}

	@Test
	void testInsert() {
		SaramDTO dto = new SaramDTO(0, "HOST", "010-4567-4567", "host@aaa.naver");
		int resultCnt = dao.insert(dto);
		assertTrue(resultCnt > 0, () -> "입력 실패입니다!");
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

}
