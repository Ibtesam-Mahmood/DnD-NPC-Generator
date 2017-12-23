package com.dnd.npc.properties;

import com.dnd.reader.ReadJSON;

public class PlayerClass extends PlayerAttribute{
	
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
		
		return null;
		
	}

		
	
}
