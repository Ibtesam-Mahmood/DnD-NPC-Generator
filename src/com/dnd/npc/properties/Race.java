package com.dnd.npc.properties;

import com.dnd.reader.ReadJSON;

public class Race {

	private int[] attributeBooster; //The attributes that are effected by race
	
	public Race() {
		setAttributeBooster();
	}
	
	//Instantiates the attributeBooster array
	private void setAttributeBooster() {
		attributeBooster =  new int[6];
		ReadJSON reader =  new ReadJSON("C:\\Users\\ibtes\\Documents\\WorkSpaces\\DnD WorkSpace\\DnD v1\\resources\\JSON\\Human.JSON");
		String[] boosts = reader.readArray("attributes");
		for (int i = 0; i < attributeBooster.length; i++) {
			attributeBooster[i] = Integer.parseInt(boosts[i]);
		}
		
	}

	public int[] getAttributeBooster() {
		return attributeBooster;
	}
		
	
}
