package com.dnd.npc.properties;

public class Traits {

	private int[] Attributes;
	
	public Traits() {
		setAttributes();
	}
	
	private void setAttributes() {
		Attributes =  new int[6];
		/*
		 * 1 - Strength
		 * 2 - Dexterity
		 * 3 - Constitution
		 * 4 - Intelligence
		 * 5 - Wisdom
		 * 6 - Charisma
		 */
		for (int i = 0; i < Attributes.length; i++) {
			Attributes[i] = 8;
		}
	}
	
	private int toModifier(int val) {
		int mod = (int) (0.5*val - 5.3);
		return mod;
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
		return Attributes[0];
	}
	
	public int dexterity() {
		return Attributes[1];
	}
	
	public int constitution() {
		return Attributes[2];
	}
	
	public int intelligence() {
		return Attributes[3];
	}
	
	public int wisdom() {
		return Attributes[4];
	}
	
	public int charisma() {
		return Attributes[5];
	}
	
}
