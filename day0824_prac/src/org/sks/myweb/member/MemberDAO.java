package org.sks.myweb.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.sks.myweb.dbcp.JdbcUtil;

public class MemberDAO {
	public static final String INSERT = "INSERT INTO member(MNO,MNAME,EMAIL,PW)VALUES(nextval('seq_member'),?,?,?)";
	public static final String SELECT_CHECK = "SELECT * FROM member WHERE EMAIL=? AND PW=?";

	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public void insert(MemberDTO dto) throws SQLException {
		conn = JdbcUtil.getConnection();

		pstmt = conn.prepareStatement(INSERT);
		pstmt.setString(1, dto.getMname());
		pstmt.setString(2, dto.getEmail());
		pstmt.setString(3, dto.getPw());

		int resultCnt = pstmt.executeUpdate();
		if (resultCnt > 0) {
			System.out.println("등록 성공");
		} else {
			System.out.println("등록 실패");
		}

		JdbcUtil.close(conn, stmt, null);
	}

	public MemberDTO selectCheck(String email, String pw) throws SQLException {

		MemberDTO dto = null;

		conn = JdbcUtil.getConnection();

		pstmt = conn.prepareStatement(SELECT_CHECK);
		pstmt.setString(1, email);
		pstmt.setString(2, pw);

		rs = pstmt.executeQuery();
		while (rs.next()) {
			dto = new MemberDTO();
			dto.setMno(rs.getInt("mno"));
			dto.setMname(rs.getString("mname"));
			dto.setEmail(rs.getString("email"));
			dto.setPw(rs.getString("pw"));
		}

		JdbcUtil.close(conn, stmt, rs);

		return dto;
	}
}
