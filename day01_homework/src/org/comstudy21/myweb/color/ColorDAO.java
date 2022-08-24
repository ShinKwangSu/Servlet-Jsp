package org.comstudy21.myweb.color;

import java.util.Arrays;
import java.util.List;

public class ColorDAO {
	private static List<ColorDTO> colorList;
	   static {
		   colorList = Arrays.asList(
	            new ColorDTO(1,"FIREBRICK","red"),
	            new ColorDTO(2,"ROYALBLUE","blue"),
	            new ColorDTO(3,"LIGHTSEAGREEN","green"));
	   }
	   
	   public List<ColorDTO> selectAll() {
	      return colorList;
	   }
	   
	   public void insert(ColorDTO dto) {
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
