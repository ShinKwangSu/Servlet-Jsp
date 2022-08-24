package org.comstudy21.myapp.member.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.comstudy21.myapp.dbcp.DAO;
import org.comstudy21.myapp.dbcp.JdbcUtil;

public class MemberDAO implements DAO<MemberDTO> {

	public static final String tableName = "member";
	public static final String[] fields = { "memNo", "memName", "memEmail", "memPw", "regDate" };

	public static final String SELECT_ALL = DAO.mkSql_selectAll(tableName);
	public static final String SELECT_ONE = DAO.mkSql_selectOne(tableName, "memNo");
	public static final String INSERT = DAO.mkSql_insert(tableName, fields);
	public static final String UPDATE = DAO.mkSql_update(tableName, "memName", "memEmail", "memPw", "regDate", "memNo");
	public static final String DELETE = DAO.mkSql_delete(tableName, "memNo");
	public static final String SEARCH = "SELECT * FROM member WHERE memName LIKE '%'||?||'%'";

	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	private int resultCnt;

	private static final String RESOURCENAME = "jdbc/h2DB";

	private Connection getConnection() {
		return JdbcUtil.getConnection(RESOURCENAME);
	}

	@Override
	public List<MemberDTO> selectAll() {
		List<MemberDTO> list = new ArrayList();
		conn = getConnection();
		try {
			stmt = conn.prepareStatement(SELECT_ALL);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int memNo = rs.getInt(1);
				String memName = rs.getString(2);
				String memEmail = rs.getString(3);
				String memPw = rs.getString(4);
				String regDate = rs.getString(5);

				list.add(new MemberDTO(memNo, memName, memEmail, memPw, regDate));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, stmt, rs);
		}

		return null;
	}

	@Override
	public MemberDTO selectOne(MemberDTO obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(MemberDTO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(MemberDTO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(MemberDTO obj) { // TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
//		System.out.println(SELECT_ALL);
//		System.out.println(SELECT_ONE);
//		System.out.println(INSERT);
//		System.out.println(UPDATE);
//		System.out.println(DELETE);
//		System.out.println(SEARCH);
		
		// 톰캣이 실행되지 않으면 jndi가 구동 되지 않는다
//		MemberDAO dao = new MemberDAO();
//		System.out.println(dao.selectAll());
	}

}
