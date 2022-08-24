package org.comstudy21.myweb.people.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.comstudy21.myweb.util.JdbcUtil;

public class PeopleDAO {

	String SELECT_ALL = "select * from people p inner join product d on p.rno=d.rno order by pno desc";
	String SELECT_ONE = "select * from people where pno=?";
	String INSERT = "insert into people(pno, name, phone, rpay, rno) values(nextval('seq_people'), ?, ?, ?,?)";
	String UPDATE = "update people set name=?, phone=?, rpay=? where pno=?";
	String DELETE = "delete from people where pno=?";

	private Connection conn;
	// private Statement stmt;
	private PreparedStatement stmt;
	private ResultSet rs;

	public List<PeopleDTO> selectAll() {
		List<PeopleDTO> plist = new ArrayList<>();
		conn = JdbcUtil.getConnection();

		try {
			stmt = conn.prepareStatement(SELECT_ALL);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int pno = rs.getInt("pno");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String rpay = rs.getString("rpay");
				int rno = rs.getInt("rno");
				String rtitle = rs.getString("rtitle");	
				int rprice = rs.getInt("rprice");
				
				plist.add(new PeopleDTO(pno, name, phone, rpay, rno, rtitle, rprice));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, stmt, rs);
		}
		return plist;
	}

	public void insert(PeopleDTO dto) throws SQLException {
		conn = JdbcUtil.getConnection();

		stmt = conn.prepareStatement(INSERT);
		stmt.setString(1, dto.getName());
		stmt.setString(2, dto.getPhone());
		stmt.setString(3, dto.getRpay());
		stmt.setInt(4, dto.getRno());

		int resultCnt = stmt.executeUpdate();
		if (resultCnt > 0) {
			System.out.println("등록 성공");
		} else {
			System.out.println("등록 실패");
		}

		JdbcUtil.close(conn, stmt, rs);
	}
}
