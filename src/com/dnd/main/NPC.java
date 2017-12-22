package com.dnd.main;

import com.dnd.npc.properties.Gender;
import com.dnd.npc.properties.NewRace;
import com.dnd.npc.properties.Traits;

public class NPC {

	private Traits traits;
	private Gender gender;
	private NewRace race;
	
	public NPC() {
		traits = new Traits();
		gender =  Gender.randomGender();
		race =  new NewRace();
		traits.applyRaceEffects(race);
	}
	
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
