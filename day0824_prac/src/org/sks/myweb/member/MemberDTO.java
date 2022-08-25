package org.sks.myweb.member;

public class MemberDTO {
	private int mno;
	private String mname;
	private String email;
	private String pw;

	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(int mno, String mname, String email, String pw) {
		this.mno = mno;
		this.mname = mname;
		this.email = email;
		this.pw = pw;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "MemberDTO [mno=" + mno + ", mname=" + mname + ", email=" + email + ", pw=" + pw + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mno;
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
		MemberDTO other = (MemberDTO) obj;
		if (mno != other.mno)
			return false;
		return true;
	}

}
