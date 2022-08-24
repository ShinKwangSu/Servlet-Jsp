package org.comstudy21.myweb.shop;

public class ShopDTO {
	int no;
	String name;
	String date;
	public ShopDTO() {
		// TODO Auto-generated constructor stub
	}
	public ShopDTO(int no, String name, String date) {
		this.no = no;
		this.name = name;
		this.date = date;
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
	public void setpName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void seteDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "ShopDTO [no=" + no + ", name=" + name + ", date=" + date + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + no;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShopDTO other = (ShopDTO) obj;
		if (no != other.no)
			return false;
		return true;
	}
}
