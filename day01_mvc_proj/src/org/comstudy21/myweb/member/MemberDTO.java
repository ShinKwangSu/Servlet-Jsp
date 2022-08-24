package org.comstudy21.myweb.member;

public class MemberDTO {
   int no;
   String name;
   String phone;
   public MemberDTO() {
      // TODO Auto-generated constructor stub
   }
   public MemberDTO(int no, String name, String phone) {
      this.no = no;
      this.name = name;
      this.phone = phone;
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
   public String getPhone() {
      return phone;
   }
   public void setPhone(String phone) {
      this.phone = phone;
   }
   @Override
   public String toString() {
      return "MemberDTO [no=" + no + ", name=" + name + ", phone=" + phone + "]";
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
		MemberDTO other = (MemberDTO) obj;
		if (no != other.no)
			return false;
		return true;
	}
   
   
}