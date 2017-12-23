package com.dnd.main;

import com.dnd.npc.properties.Gender;
import com.dnd.npc.properties.Race;
import com.dnd.npc.properties.Traits;

public class NPC {

	private Traits traits; //hold the attributes and skills of the NPC
	private Gender gender;
	private Race race; //The race of the NPC
	
	public NPC() {
		traits = new Traits();
		gender =  Gender.randomGender();
		race =  new Race();
		traits.applyRaceEffects(race);
	}
	
	
	//Returns a string with a list of the NPC's attributes
	public String npcDescription() {
		String des = "";
		
		des += "Gender: " + gender + "\n";
		des += "Str: " + traits.strength() + ", ";
		des += "Dex: " + traits.dexterity() + ", ";
		des += "Con: " + traits.constitution() + "\n";
		des += "Int: " + traits.intelligence() + ", ";
		des += "Wis: " + traits.wisdom() + ", ";
		des += "Cha: " + traits.charisma() + "\n";
		
		return des;
	}
	
}
