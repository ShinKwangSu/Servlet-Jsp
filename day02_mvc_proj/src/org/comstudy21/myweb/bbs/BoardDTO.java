package org.comstudy21.myweb.bbs;

public class BoardDTO {
	int no;
	String title;
	String post;
	public BoardDTO() {
		// TODO Auto-generated constructor stub
	}
	public BoardDTO(int no, String title, String post) {
		this.no = no;
		this.title = title;
		this.post = post;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	@Override
	public String toString() {
		return "BoardDTO [no=" + no + ", title=" + title + ", post=" + post + "]";
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
		BoardDTO other = (BoardDTO) obj;
		if (no != other.no)
			return false;
		return true;
	}
	
	
}
