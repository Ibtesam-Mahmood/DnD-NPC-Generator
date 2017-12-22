package com.dnd.main;

import com.dnd.enums.Gender;

public class NPC {

	private Gender gender;
	
	public NPC() {
		this.gender =  Gender.randomGender(); // Gives the NPC a random gender
	}
	
	// Print out all qualities of the NPC
	public String npcDescription() {
		String description = "";
		
		description +=  "Gender: " + Gender.printGender(this.gender) + "\n";
		
		return description;
	}
	
}
