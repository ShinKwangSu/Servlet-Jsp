package org.comstudy21.myweb.color;

import java.util.ArrayList;
import java.util.List;

public class ColorDAO {
	private static List<ColorDTO> colorList;
	private static int sequence=1;
	static {
		colorList = new ArrayList<ColorDTO>();
		colorList.add(new ColorDTO(sequence++,"FIREBRICK","RED"));
		colorList.add(new ColorDTO(sequence++,"LIGHTSEAGREEN","GREEN"));
		colorList.add(new ColorDTO(sequence++,"ROYALBLUE","BLUE"));
		
	}

	public List<ColorDTO> selectAll() {
		return colorList;
	}
	
	public void insert(ColorDTO dto) {
		dto.setNo(sequence++);
		colorList.add(dto);
	}
	
	public ColorDTO selectOne(ColorDTO dto) {
		return null;
	}
	
	public void update(ColorDTO dto) {
		
	}
	
	public void delete(ColorDTO dto) {
		
	}
}
