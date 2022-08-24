package org.comstudy21.myweb.controller;

import java.util.HashMap;

import org.comstudy21.myweb.coral.CoralController;
import org.comstudy21.myweb.firebrick.FireBrickController;
import org.comstudy21.myweb.hotpink.HotPinkController;
import org.comstudy21.myweb.lightseagreen.LightSeaGreenController;
import org.comstudy21.myweb.royalblue.RoyalBlueController;

public class HandlerMapping {
private HashMap<String, MyController> map = new HashMap();
	
	public HandlerMapping() {
		map.put("/blue", new RoyalBlueController());
		map.put("/red/firebrick", new FireBrickController());
		map.put("/red/coral", new CoralController());
		map.put("/red/hotpink", new HotPinkController());
		map.put("/green", new LightSeaGreenController());
	}
	
	public MyController getController(String key) {
		return map.get(key);
	}

}
