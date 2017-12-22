package com.dnd.npc.properties;

public class NewRace {

	private int[] attributeBooster;
	
	public NewRace() {
		attributeBooster =  new int[6];
		attributeBooster[0] = 1;
		attributeBooster[1] = 3;
		attributeBooster[2] = -5;
		attributeBooster[3] = 0;
		attributeBooster[4] = -3;
		attributeBooster[5] = 2;
	}

	public int[] getAttributeBooster() {
		return attributeBooster;
	}
		
	
}
