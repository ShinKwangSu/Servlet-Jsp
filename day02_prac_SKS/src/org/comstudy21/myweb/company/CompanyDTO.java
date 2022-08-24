package org.comstudy21.myweb.company;

public class CompanyDTO {
	int no;
	String name;
	String nation;
	
	public CompanyDTO() {
		// TODO Auto-generated constructor stub
	}
	public CompanyDTO(int no, String name, String nation) {
		this.no = no;
		this.name = name;
		this.nation = nation;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
}
