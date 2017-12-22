package com.dnd.npc.properties;

import java.util.Random;

import com.dnd.reader.ReadExcel;

public class Race {

	public static final String[][] raceList = initList();
	
	private String race;
	
	public Race() {
		this.race = randomRace();
	}
		
	public String getRace() {
		return race;
	}

	private String randomRace() {
		Random r =  new Random();
		int n =  r.nextInt(3);
		return raceList[n][0];
	}
	
	private static String[][] initList() {
		ReadExcel reader =  new ReadExcel("C:\\Users\\ibtes\\Documents\\WorkSpaces\\DnD WorkSpace\\DnD v1\\excel\\Race.xls");
		return reader.read();
	}
	
}
