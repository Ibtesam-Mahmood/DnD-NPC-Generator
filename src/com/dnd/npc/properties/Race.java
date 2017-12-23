package com.dnd.npc.properties;

import java.io.File;

import com.dnd.reader.ReadJSON;

public class Race {

	private int[] attributeBooster; //The attributes that are effected by race
	private String raceName;
	
	public Race() {
		setAttributeBooster();
	}
	
	//Instantiates the attributeBooster array
	private void setAttributeBooster() {
		attributeBooster =  new int[6];
		File file = ReadJSON.randomFile("C:\\Users\\ibtes\\Documents\\WorkSpaces\\DnD WorkSpace\\DnD v1\\resources\\JSON");
		ReadJSON reader =  new ReadJSON( file );
		String[] boosts = reader.readArray("attributes");
		for (int i = 0; i < attributeBooster.length; i++) {
			attributeBooster[i] = Integer.parseInt(boosts[i]);
		}
		raceName = reader.getFileName();
	}

	public int[] getAttributeBooster() {
		return attributeBooster;
	}
	
	public String getRaceName() {
		return raceName;
	}
		
	
}
