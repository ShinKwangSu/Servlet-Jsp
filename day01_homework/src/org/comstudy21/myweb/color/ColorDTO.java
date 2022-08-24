package org.comstudy21.myweb.color;

public class ColorDTO {
	int no;
	   String name;
	   String type;
	   public ColorDTO() {
	      // TODO Auto-generated constructor stub
	   }
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
	   @Override
	   public String toString() {
	      return "ColorDTO [no=" + no + ", name=" + name + ", type=" + type + "]";
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
			ColorDTO other = (ColorDTO) obj;
			if (no != other.no)
				return false;
			return true;
		}
}
