package com.dnd.npc.properties;

import com.dnd.reader.ReadJSON;

public class PlayerClass extends PlayerAttribute{
	
	public PlayerClass(int age) {
		initFromJSON(age);
	}
	
	//Instantiates the attributeBooster array
	protected ReadJSON initFromJSON(int age) {
		
		ReadJSON reader = super.initFromJSON("Class");
		
		//Do something special
		
		return null;
		
	}

		
	
}
