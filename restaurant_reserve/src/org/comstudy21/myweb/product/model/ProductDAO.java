package org.comstudy21.myweb.product.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.comstudy21.myweb.people.model.PeopleDTO;
import org.comstudy21.myweb.util.JdbcUtil;

public class ProductDAO {

	String SELECT_ALL = "select * from product order by rno desc";
	String SELECT_ONE = "select * from product where rno=?";
	String INSERT = "insert into product(rno, rtitle, rprice) values (nextval('seq_product'), ?, ?)";
	String UPDATE = "UPDATE PRODUCT SET rtitle=?, rprice=? where rno=?";
	String DELETE = "DELETE from product where rno=?";

	private Connection conn;
	// private Statement stmt;
	private PreparedStatement stmt;
	private ResultSet rs;

	public List<ProductDTO> selectAll() {
		List<ProductDTO> plist = new ArrayList<>();
		conn = JdbcUtil.getConnection();

		try {
			stmt = conn.prepareStatement(SELECT_ALL);
			rs = stmt.executeQuery();
			while (rs.next()) {
				int rno = rs.getInt(1);
				String rtitle = rs.getString(2);
				int rprice = rs.getInt(3);

				plist.add(new ProductDTO(rno, rtitle, rprice));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, stmt, rs);
		}
		return plist;
	}

	public void insert(ProductDTO dto) throws SQLException {
		conn = JdbcUtil.getConnection();

		stmt = conn.prepareStatement(INSERT);
		stmt.setString(1, dto.getRtitle());
		stmt.setInt(2, dto.getRprice());

		int resultCnt = stmt.executeUpdate();
		if (resultCnt > 0) {
			System.out.println("등록 성공");
		} else {
			System.out.println("등록 실패");
		}

		JdbcUtil.close(conn, stmt, rs);
	}
}
