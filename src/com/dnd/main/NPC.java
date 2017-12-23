package com.dnd.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import com.dnd.npc.properties.Gender;
import com.dnd.npc.properties.PlayerClass;
import com.dnd.npc.properties.Race;
import com.dnd.npc.properties.Traits;

public class NPC {

	private Traits traits; //hold the attributes and skills of the NPC
	private Gender gender;
	private Race race; //The race of the NPC
	private PlayerClass npcClass; //the class of the npc
	private String name; //The NPCs name
	private int age; //The NPCs age
	
	public NPC() {
		traits = new Traits();
		gender =  Gender.randomGender();
		race =  new Race();
		traits.applyAttributeEffects(race);
		generateName();
		generateAge();
		npcClass =  new PlayerClass(age);
		traits.applyAttributeEffects(npcClass);
	}


	//Returns a string with a list of the NPC's attributes
	public String npcDescription() {
		String des = "";
		
		des += "Name: " + name + "\n";
		des += "Gender: " + gender + "\n";
		des += "Age: " + age + "\n";
		des += "Race: " + race.getName() + "\n";
		des += "Class: " + npcClass.getName() + "\n";
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
		File f =  new File(dir);

	    Random rand = new Random();
	    int n = 0;
	    
	    try(Scanner sc = new Scanner(f)){
	    	
		    while(sc.hasNext() )
		    {
		       ++n;
		       String line = sc.nextLine();
		       if(rand.nextInt(n) == 0)
		          this.name = line;  
		    }
	    } catch (FileNotFoundException e) { e.printStackTrace(); }

		
	}
	
	
}
