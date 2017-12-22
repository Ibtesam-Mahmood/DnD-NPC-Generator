package com.dnd.npc.properties;

public enum Gender {
	
	Male,
	Female;
	
	//Randomly chooses a gender
	public static Gender randomGender() {
		float r = (float) Math.random();
		
		if(r <= 0.5f)
			return Gender.Male;
		else
			return Gender.Female;
	}

	
}
