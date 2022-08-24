package org.comstudy21.myweb.color;

public class ColorDTO {
	int no;
	String name;
	String type;
	
	public ColorDTO(int no, String name, String type) {
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
