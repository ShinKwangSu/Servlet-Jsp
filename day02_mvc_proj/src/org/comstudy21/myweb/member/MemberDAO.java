package org.comstudy21.myweb.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.comstudy21.myweb.util.JdbcUtil;

public class MemberDAO {
	public static final String SELECT = "SELECT * FROM MEMBER";
	public static final String INSERT = "INSERT INTO member(NAME,PHONE)VALUES(?,?)";
	public static final String UPDATE = "UPDATE member SET NAME=?, PHONE=? WHERE NO=?";
	public static final String SELECT_ONE = "SELECT * FROM member WHERE NO=?";
	public static final String SELECT_NAME = "SELECT * FROM member WHERE NAME=?";
	public static final String DELETE = "DELETE FROM member WHERE NO=?";
	
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public List<MemberDTO> selectAll() throws SQLException {
		List<MemberDTO> mlist = new ArrayList<>();
		
		conn = JdbcUtil.getConnection();
		stmt = conn.createStatement();
		
		rs = stmt.executeQuery(SELECT);
		while (rs.next()) {
			MemberDTO dto = new MemberDTO();
			dto.setNo(rs.getInt("no"));
			dto.setName(rs.getString("name"));
			dto.setPhone(rs.getString("phone"));
			
			mlist.add(dto);
		}
		
		JdbcUtil.close(conn, stmt, rs);
		
		return mlist;
	}
	
	public MemberDTO selectId(int id) throws SQLException {
		MemberDTO dto = null;
		
		conn = JdbcUtil.getConnection();
		
		pstmt = conn.prepareStatement(SELECT_ONE);
		pstmt.setInt(1, id);
		
		rs = pstmt.executeQuery();
		while (rs.next()) {
			dto = new MemberDTO();
			dto.setNo(rs.getInt("id"));
			dto.setName(rs.getString("name"));
			dto.setPhone(rs.getString("phone"));
		}
		
		JdbcUtil.close(conn, stmt, rs);
		
		return dto;
	}
	
	public MemberDTO selectName(String name) throws SQLException {
		
		MemberDTO dto = new MemberDTO();
		
		conn = JdbcUtil.getConnection();
		
		pstmt = conn.prepareStatement(SELECT_NAME);
		pstmt.setString(1, name);
		
		rs = pstmt.executeQuery();
		while (rs.next()) {
			dto.setNo(rs.getInt("id"));
			dto.setName(rs.getString("name"));
			dto.setPhone(rs.getString("phone"));
		}
		
		JdbcUtil.close(conn, stmt, rs);
		
		return dto;
	}
	
	public void insert(MemberDTO dto) throws SQLException {
		conn = JdbcUtil.getConnection();
		
		pstmt = conn.prepareStatement(INSERT);
		pstmt.setString(1, dto.getName());
		pstmt.setString(2, dto.getPhone());
		
		int resultCnt = pstmt.executeUpdate();
		if (resultCnt > 0) {
			System.out.println("등록 성공");
		} else {
			System.out.println("등록 실패");
		}
		
		JdbcUtil.close(conn, stmt, rs);
	}
	
	public void update(MemberDTO dto) throws SQLException {
		conn = JdbcUtil.getConnection();
		
		pstmt = conn.prepareStatement(UPDATE);
		pstmt.setString(1, dto.getName());
		pstmt.setString(2, dto.getPhone());
		pstmt.setInt(3, dto.getNo());
		
		int resultCnt = pstmt.executeUpdate();
		if (resultCnt > 0) {
			System.out.println("수정 성공");
		} else {
			System.out.println("수정 실패");
		}
		
		JdbcUtil.close(conn, stmt, rs);
	}
	
	public void delete(MemberDTO dto) throws SQLException {
		conn = JdbcUtil.getConnection();
		
		pstmt = conn.prepareStatement(DELETE);
		pstmt.setInt(1, dto.getNo());
		
		int resultCnt = pstmt.executeUpdate();
		if (resultCnt > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
		
		JdbcUtil.close(conn, stmt, rs);
	}
}
