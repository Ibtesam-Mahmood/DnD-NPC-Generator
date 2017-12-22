package com.dnd.npc.properties;

public class Traits {

	private int[] attributes;
	
	public Traits() {
		setAttributes();
	}
	
	private void setAttributes() {
		attributes =  new int[6];
		/*
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
	
	private int toModifier(int val) {
		int mod = (int) (0.5*val - 5.3);
		return mod;
	}
	
	public void applyRaceEffects(NewRace race) {
		int[] attributeBooster = race.getAttributeBooster();
		for (int i = 0; i < attributeBooster.length; i++) {
			attributes[i] += attributeBooster[i];
		}
	}
	
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
