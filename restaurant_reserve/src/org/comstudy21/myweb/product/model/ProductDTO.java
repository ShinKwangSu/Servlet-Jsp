package org.comstudy21.myweb.product.model;

public class ProductDTO {
	private int rno;
	private String rtitle;
	private int rprice;
	
	public ProductDTO() {
		
	}
	public ProductDTO(int rno, String rtitle, int rprice) {
		this.rno = rno;
		this.rtitle = rtitle;
		this.rprice = rprice;
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
		return rno + " - " + rtitle + " - " + rprice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rno;
		result = prime * result + rprice;
		result = prime * result + ((rtitle == null) ? 0 : rtitle.hashCode());
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
		ProductDTO other = (ProductDTO) obj;
		if (rno != other.rno)
			return false;
		if (rprice != other.rprice)
			return false;
		if (rtitle == null) {
			if (other.rtitle != null)
				return false;
		} else if (!rtitle.equals(other.rtitle))
			return false;
		return true;
	}
	
}