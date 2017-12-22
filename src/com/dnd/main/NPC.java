package com.dnd.main;

import com.dnd.npc.properties.Gender;
import com.dnd.npc.properties.Race;

public class NPC {

	private Gender gender;
	private Race race;
	
	public NPC() {
		this.gender =  Gender.randomGender(); // Gives the NPC a random gender
		this.race = new Race();
	}
	
	// Print out all qualities of the NPC
	public String npcDescription() {
		String description = "";
		
		
		description +=  "Race: " + this.race.getRace() + "\n";
		description +=  "Gender: " + this.gender + "\n";
		
		
		return description;
	}
	
}
