package org.comstudy21.myweb.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class SaramDAO {
	public static final String SELECT = "SELECT * FROM SARAM";
	public static final String INSERT = "INSERT INTO SARAM(NAME,PHONE,EMAIL)VALUES(?,?,?)";
	public static final String UPDATE = "UPDATE SARAM SET NAME=?, PHONE=?, EMAIL=? WHERE ID=?";
	public static final String SELECT_ONE = "SELECT * FROM SARAM WHERE ID=?";
	public static final String SELECT_NAME = "SELECT * FROM SARAM WHERE NAME=?";
	public static final String DELETE = "DELETE FROM SARAM WHERE ID=?";
	
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public List<SaramDTO> selectAll() {
		return null;
	}
	
	public SaramDTO selectOne(SaramDTO dto) {
		return null;
	}
	
	public SaramDTO findByName(SaramDTO dto) {
		return null;
	}
	
	public void update(SaramDTO dto) {
		
	}
	
	public void delete(SaramDTO dto) {
		
	}
	
	public void insert(SaramDTO dto) {
		
	}
}
