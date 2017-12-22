package com.dnd.main;

import com.dnd.npc.properties.Gender;
import com.dnd.npc.properties.Race;

public class NPC {

	private Gender gender;
	private Race race;
	private int age;
	private int height;
	private int weight;
	private String name;
	private int gold;
	
	public NPC() {
		this.gender =  Gender.randomGender(); // Gives the NPC a random gender
		this.race = new Race();
		this.age = randAge();
		this.height =  randHeight();
	}
	

	// Print out all qualities of the NPC
	public String npcDescription() {
		String description = "";
		
		
		description +=  "Race: " + this.race.getRace() + "\n";
		description +=  "Gender: " + this.gender + "\n";
		description +=  "Age: " + this.age + "\n";
		description +=  "Height: " + this.height + " cm\n";
		
		
		return description;
	}
	
	public int randAge() {
		double r =  Math.random() + 0.1;
		return (int)( r * Integer.parseInt(Race.raceList[race.getRaceIndex()][1]) );
	}
	
	private int randHeight() {
		int h = 0;
		double a = 1;
		double gen = 1;
		
		int maxA = Integer.parseInt(Race.raceList[race.getRaceIndex()][1])/4;
		int avHieght = Integer.parseInt(Race.raceList[race.getRaceIndex()][2]);
		
		if(this.age < maxA) {
			a = age/(maxA) + 0.2;
		} 
		if(gender == Gender.Female) {
			gen = 0.8;
		}
		
		h = avHieght/2 + (int)(avHieght*a*gen*(Math.random() ));
		
		return h;
		
	}
	
}
