package com.dnd.npc.properties;

public class Race {

	private int[] attributeBooster; //The attributes that are effected by race
	
	public Race() {
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
