package com.dnd.npc.properties;

import com.dnd.reader.ReadJSON;

public class Race extends PlayerAttribute{

	private int maxAge;
	
	public Race() {
		initFromJSON();
	}
	
	//Instantiates the attributeBooster array
	protected ReadJSON initFromJSON() {
		
		ReadJSON reader = super.initFromJSON("Race");
		
		this.maxAge = Integer.parseInt( reader.readValue("age") );
		
		return null;
	}
	
	public int getAge() {
		return maxAge;
	}
		
	
}
