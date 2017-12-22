package com.dnd.main;

import com.dnd.npc.properties.Gender;
import com.dnd.npc.properties.Race;

public class NPC {

	private Gender gender;
	private Race race;
	private int age;
	
	public NPC() {
		this.gender =  Gender.randomGender(); // Gives the NPC a random gender
		this.race = new Race();
		this.age = randAge();
	}
	
	// Print out all qualities of the NPC
	public String npcDescription() {
		String description = "";
		
		
		description +=  "Race: " + this.race.getRace() + "\n";
		description +=  "Age: " + this.age + "\n";
		description +=  "Gender: " + this.gender + "\n";
		
		
		return description;
	}
	
	public int randAge() {
		double r =  Math.random() + 0.1;
		return (int)( r * Integer.parseInt(Race.raceList[race.getRaceIndex()][1]) );
	}
	
}
