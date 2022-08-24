package org.comstudy21.myweb.company;

import java.util.ArrayList;
import java.util.List;

public class CompanyDAO {
	private static List<CompanyDTO> companyList;
	private static int sequence=1;
	static {
		companyList = new ArrayList<CompanyDTO>();
		companyList.add(new CompanyDTO(sequence++,"SAMSUNG","KOREA"));
		companyList.add(new CompanyDTO(sequence++,"GOOGLE","USA"));
		companyList.add(new CompanyDTO(sequence++,"XIAOMI","CHINA"));
	}

	public List<CompanyDTO> selectAll() {
		return companyList;
	}
	
	public void insert(CompanyDTO dto) {
		dto.setNo(sequence++);
		companyList.add(dto);
	}
	
	public CompanyDTO selectOne(CompanyDTO dto) {
		return null;
	}
	
	public void update(CompanyDTO dto) {
		
	}
	
	public void delete(CompanyDTO dto) {
		
	}
}
