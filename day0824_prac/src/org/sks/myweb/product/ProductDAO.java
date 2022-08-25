package org.sks.myweb.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.sks.myweb.dbcp.JdbcUtil;

public class ProductDAO {
	public static final String INSERT = "insert into carProduct(pno, pname, company, price, ea) values(nextval('seq_carproduct'), '쏘나타', 'HYUNDAI', 2000, 10)";
	public static final String SELECT = "SELECT * FROM carProduct";
	public static final String UPDATE = "UPDATE carProduct SET ea=? WHERE pno=?";
	public static final String DELETE = "DELETE FROM carProduct WHERE pno=?";
	public static final String SELECT_ONE = "SELECT * FROM carProduct WHERE pno=?";
	public static final String SELECT_NAME = "SELECT * FROM carProduct WHERE pname=?";

	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public List<ProductDTO> selectAll() throws SQLException {
		List<ProductDTO> list = new ArrayList<>();

		conn = JdbcUtil.getConnection();
		stmt = conn.createStatement();

		rs = stmt.executeQuery(SELECT);
		while (rs.next()) {
			ProductDTO dto = new ProductDTO();
			dto.setPno(rs.getInt("pno"));
			dto.setPname(rs.getString("pname"));
			dto.setCompany(rs.getString("company"));
			dto.setPrice(rs.getInt("price"));
			dto.setEa(rs.getInt("ea"));

			list.add(dto);
		}

		JdbcUtil.close(conn, stmt, rs);

		return list;
	}
}