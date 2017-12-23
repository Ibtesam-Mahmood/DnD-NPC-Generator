package com.dnd.npc.properties;

public class Traits {

	// A class that holds are numerical traits of the NPC
	
	private int[] attributes; //The basic attributes of the character, range from 1-30
	
	public Traits() {
		setAttributes();
	}
	
	
	//Sets the basic attributes values for this trait
	private void setAttributes() {
		attributes =  new int[6];
		/* List of indexes to attribute
		 * 1 - Strength
		 * 2 - Dexterity
		 * 3 - Constitution
		 * 4 - Intelligence
		 * 5 - Wisdom
		 * 6 - Charisma
		 */
		for (int i = 0; i < attributes.length; i++) {
			attributes[i] = 8;
		}
	}
	
	//Converts an attribute score to a modifier
	//@param val - the value that is converted into a modifier
	public static int toModifier(int val) {
		int mod = (int) (0.5*val - 5.3); //uses a function to get approximate modifier value
		return mod;
	}
	
	//applies the effects of race onto the traits
	//@param race - the race which effects this trait
	public void applyAttributeEffects(PlayerAttribute attribute) {
		int[] attributeBooster = attribute.getAttributeBooster();
		for (int i = 0; i < attributeBooster.length; i++) {
			attributes[i] += attributeBooster[i];
		}
	}
	
	//Calls the toModifier method for a specific attribute
	//@param mod - the attribute to get the modifier for
	public int getModifier(String mod) {
		mod.toLowerCase();
		if(mod == "str")
			return toModifier(strength());
		else if (mod == "dex")
			return toModifier(dexterity());
		else if (mod == "con")
			return toModifier(constitution());
		else if (mod == "int")
			return toModifier(intelligence());
		else if (mod == "wis")
			return toModifier(wisdom());
		else if (mod == "cha")
			return toModifier(charisma());
		else
			return 0;
	}
	
	public int strength() {
		return attributes[0];
	}
	
	public int dexterity() {
		return attributes[1];
	}
	
	public int constitution() {
		return attributes[2];
	}
	
	public int intelligence() {
		return attributes[3];
	}
	
	public int wisdom() {
		return attributes[4];
	}
	
	public int charisma() {
		return attributes[5];
	}
	
}
