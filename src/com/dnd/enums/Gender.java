package com.dnd.enums;

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
	
	/* Returns a string of the gender inputed
	 * @param gender - the gender to print out
	 */
	public static String printGender(Gender gender) {
		if(gender == Gender.Male)
			return "Male";
		else
			return "Female";
	}
	
}
