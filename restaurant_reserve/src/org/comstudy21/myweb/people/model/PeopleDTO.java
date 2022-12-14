package org.comstudy21.myweb.people.model;

import org.comstudy21.myweb.product.model.ProductDTO;

public class PeopleDTO {
	private int pno;
	private String name;
	private String phone;
	private String rpay;
	
	//private ProductDTO pdtp;
	private int rno;
	private String rtitle;
	private int rprice;
	
	
	public PeopleDTO() {
		
	}
	public PeopleDTO(int pno, String name, String phone, String rpay, int rno) {
		super();
		this.pno = pno;
		this.name = name;
		this.phone = phone;
		this.rpay = rpay;
		this.rno = rno;
	}
	public PeopleDTO(int pno, String name, String phone, String rpay, int rno, String rtitle, int rprice) {
		super();
		this.pno = pno;
		this.name = name;
		this.phone = phone;
		this.rpay = rpay;
		this.rno = rno;
		this.rtitle = rtitle;
		this.rprice = rprice;
	}
	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRpay() {
		return rpay;
	}
	public void setRpay(String rpay) {
		this.rpay = rpay;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getRtitle() {
		return rtitle;
	}
	public void setRtitle(String rtitle) {
		this.rtitle = rtitle;
	}
	public int getRprice() {
		return rprice;
	}
	public void setRprice(int rprice) {
		this.rprice = rprice;
	}
	
	@Override
	public String toString() {
		return "PeopleDTO [pno=" + pno + ", name=" + name + ", phone=" + phone + ", rpay=" + rpay + ", rno=" + rno + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + pno;
		result = prime * result + rno;
		result = prime * result + ((rpay == null) ? 0 : rpay.hashCode());
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
		PeopleDTO other = (PeopleDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (pno != other.pno)
			return false;
		if (rno != other.rno)
			return false;
		if (rpay == null) {
			if (other.rpay != null)
				return false;
		} else if (!rpay.equals(other.rpay))
			return false;
		return true;
	}
	
	
}