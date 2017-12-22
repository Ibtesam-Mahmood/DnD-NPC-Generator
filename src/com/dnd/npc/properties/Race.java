package com.dnd.npc.properties;

import java.util.Random;

import com.dnd.reader.ReadExcel;

public class Race {

	public static final String[][] raceList = initList();
	
	private int race;
	
	public Race() {
		this.race = randomRace();
	}
		
	public String getRace() {
		return raceList[race][0];
	}
	
	public int getRaceIndex() {
		return race;
	}

	private int randomRace() {
		Random r =  new Random();
		return r.nextInt(3);
	}
	
	private static String[][] initList() {
		ReadExcel reader =  new ReadExcel("C:\\Users\\ibtes\\Documents\\WorkSpaces\\DnD WorkSpace\\DnD v1\\excel\\Race.xls");
		return reader.read();
	}
	
}
