package com.dnd.npc.properties;

import java.io.File;

import com.dnd.reader.ReadJSON;

public abstract class PlayerAttribute {

	protected int[] attributeBooster; //The attributes that are effected by race
	protected String name;
	
	public int[] getAttributeBooster() {
		return attributeBooster;
	}
	
	protected ReadJSON initFromJSON(String dir) {
		attributeBooster =  new int[6];
		File file = ReadJSON.randomFile("C:\\Users\\ibtes\\Documents\\WorkSpaces\\DnD WorkSpace\\DnD v1\\resources\\JSON\\" + dir);
		ReadJSON reader =  new ReadJSON( file );
		String[] boosts = reader.readArray("attributes");
		
		for (int i = 0; i < attributeBooster.length; i++) {
			attributeBooster[i] = Integer.parseInt(boosts[i]);
		}
		
		name = reader.getFileName();
		
		return reader;
	}
	
	public String getName() {
		return name;
	}
	
	public int[] getBooster() {
		return attributeBooster;
	}
	
}
