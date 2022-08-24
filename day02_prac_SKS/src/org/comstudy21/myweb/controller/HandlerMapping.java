package org.comstudy21.myweb.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.comstudy21.myweb.color.ColorController;
import org.comstudy21.myweb.company.CompanyController;
import org.comstudy21.myweb.drink.DrinkController;

public class HandlerMapping {
	private static final Map<String, MyController> ctrlMap = new HashMap<String, MyController>();
	static {
		// 생성자 보다 먼저 실행된다.
		ctrlMap.put("", new HomeController());
		ctrlMap.put("/drink", new DrinkController());
		ctrlMap.put("/color", new ColorController());
		ctrlMap.put("/company", new CompanyController());
	}
	
	public HandlerMapping() {
		// TODO Auto-generated constructor stub
	}
	
	public HandlerMapping(Map<String, MyController> ctrlMap) {
		if(ctrlMap != null) {
			Iterator<String> iter = ctrlMap.keySet().iterator();
			this.ctrlMap.clear();
			while(iter.hasNext()) {
				String key = iter.next();
				this.ctrlMap.put(key, ctrlMap.get(key));
			}
			//this.ctrlMap.putAll(ctrlMap);
		}
	}
	
	public MyController getController(String key) {
		return ctrlMap.get(key);
	}
}
