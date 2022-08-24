package org.comstudy21.myweb.drink;

import java.util.ArrayList;
import java.util.List;

public class DrinkDAO {
	private static List<DrinkDTO> drinkList;
	private static int sequence=1;
	static {
		drinkList = new ArrayList<DrinkDTO>();
		drinkList.add(new DrinkDTO(sequence++,"SOJU","ALCOHOL"));
		drinkList.add(new DrinkDTO(sequence++,"COLA","SODA"));
		drinkList.add(new DrinkDTO(sequence++,"APPLEJUICE","JUICE"));
	}

	public List<DrinkDTO> selectAll() {
		return drinkList;
	}
	
	public void insert(DrinkDTO dto) {
		dto.setNo(sequence++);
		drinkList.add(dto);
	}
	
	public DrinkDTO selectOne(DrinkDTO dto) {
		return null;
	}
	
	public void update(DrinkDTO dto) {
		
	}
	
	public void delete(DrinkDTO dto) {
		
	}
}
