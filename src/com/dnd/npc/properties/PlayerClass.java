package com.dnd.npc.properties;

import com.dnd.reader.ReadJSON;

public class PlayerClass extends PlayerAttribute{
	
	private int gold;
	
	public PlayerClass(int age) {
		initFromJSON(age);
	}
	
	//Instantiates the attributeBooster array
	protected ReadJSON initFromJSON(int age) {
		
		ReadJSON reader = super.initFromJSON("Class");
		
		int minAge = Integer.parseInt( reader.readValue("minAge") );
		int maxAge = Integer.parseInt( reader.readValue("maxAge") );
		
		while(age < minAge || age > maxAge ) {
			
			reader = super.initFromJSON("Class");
			
			minAge = Integer.parseInt( reader.readValue("minAge") );
			
			maxAge = Integer.parseInt( reader.readValue("maxAge") );
		}
		
		this.gold = Integer.parseInt( reader.readValue("gold") );
		
		return null;
		
	}

	public int getGold() {
		return gold;
	}
		
	
}
