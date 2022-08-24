package org.comstudy21.myweb.shop;

import java.util.ArrayList;
import java.util.List;

public class ShopDAO {
	private static List<ShopDTO> shopList;
	private static int sequence=1;
	static {
		shopList = new ArrayList<ShopDTO>();
		shopList.add(new ShopDTO(sequence++,"MILK","2022-09-01"));
		shopList.add(new ShopDTO(sequence++,"SNACK","2022-10-01"));
		shopList.add(new ShopDTO(sequence++,"CHOCOLATE","2022-11-01"));
	}

	public List<ShopDTO> selectAll() {
		return shopList;
	}
	
	public void insert(ShopDTO dto) {
		dto.setNo(sequence++);
		shopList.add(dto);
	}
	
	public ShopDTO selectOne(ShopDTO dto) {
		return null;
	}
	
	public void update(ShopDTO dto) {
		
	}
	
	public void delete(ShopDTO dto) {
		
	}
}
