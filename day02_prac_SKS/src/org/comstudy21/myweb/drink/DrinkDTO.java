package org.comstudy21.myweb.drink;

public class DrinkDTO {
	int no;
	String name;
	String type;
	public DrinkDTO() {
		// TODO Auto-generated constructor stub
	}
	public DrinkDTO(int no, String name, String type) {
		this.no = no;
		this.name = name;
		this.type = type;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
