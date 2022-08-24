package org.comstudy21.myweb.bbs;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	private static List<BoardDTO> boardList;
	private static int sequence=1;
	static {
		boardList = new ArrayList<BoardDTO>();
		boardList.add(new BoardDTO(sequence++,"WELCOME","welcome"));
		boardList.add(new BoardDTO(sequence++,"HI","hi"));
		boardList.add(new BoardDTO(sequence++,"NOTICE","notice"));
	}

	public List<BoardDTO> selectAll() {
		return boardList;
	}
	
	public void insert(BoardDTO dto) {
		dto.setNo(sequence++);
		boardList.add(dto);
	}
	
	public BoardDTO selectOne(BoardDTO dto) {
		return null;
	}
	
	public void update(BoardDTO dto) {
		
	}
	
	public void delete(BoardDTO dto) {
		
	}
}
