package com.dnd.main;

import com.dnd.npc.properties.Gender;
import com.dnd.npc.properties.PlayerClass;
import com.dnd.npc.properties.Race;
import com.dnd.npc.properties.Traits;
import com.dnd.npc.properties.Wallet;
import com.dnd.reader.ReadTextFile;

public class NPC {

	private Traits traits; //hold the attributes and skills of the NPC
	private Gender gender;
	private Race race; //The race of the NPC
	private PlayerClass npcClass; //the class of the npc
	private String name; //The NPCs name
	private int age; //The NPCs age
	private Wallet wallet;
	
	public NPC() {
		traits = new Traits();
		gender =  Gender.randomGender();
		race =  new Race();
		traits.applyAttributeEffects(race);
		generateName();
		generateAge();
		npcClass =  new PlayerClass(age);
		traits.applyAttributeEffects(npcClass);
		randomGold();
	}


	//Returns a string with a list of the NPC's attributes
	public String npcDescription() {
		String des = "";
		
		des += "Name: " + name + "\n";
		des += "Gender: " + gender + "\n";
		des += "Age: " + age + "\n";
		des += "Race: " + race.getName() + "\n";
		des += "Class: " + npcClass.getName() + "\n";
		des += "Gold: " + wallet.coins() + "\n";
		des += "\n";
		des += "Str: " + traits.strength() + ", ";
		des += "Dex: " + traits.dexterity() + ", ";
		des += "Con: " + traits.constitution() + "\n";
		des += "Int: " + traits.intelligence() + ", ";
		des += "Wis: " + traits.wisdom() + ", ";
		des += "Cha: " + traits.charisma() + "\n";
		
		return des;
	}
	
	private void generateAge() {
		age = (int) (race.getAge() * (Math.random() + 0.1));
	}
	
	private void generateName() {
		String dir = "C:\\Users\\ibtes\\Documents\\WorkSpaces\\DnD WorkSpace\\DnD v1\\resources\\names"; //Change this later to relative directory
		dir += "\\" + race.getName() + " " + gender + ".txt";
		
		ReadTextFile reader =  new ReadTextFile(dir);
		
		this.name = reader.randomLine();
		
	}

	private void randomGold() {
		float gold = (float) (npcClass.getGold() * (Math.random() + 0.5));
		this.wallet =  new Wallet(gold);
	}
	
	
}
