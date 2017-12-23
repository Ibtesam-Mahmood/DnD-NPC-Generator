package com.dnd.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import jxl.Sheet;

public class ReadJSON {

	//Reads a JSON file
	
	private File file;
	
	public ReadJSON(String inputFile) {
		setFileTo(inputFile);
	}
	
	public ReadJSON(File file) {
		setFileTo(file);
	}
	
	//Sets the file to the given directory
	public void setFileTo(String dir) {
		file = new File(dir);
	}
	
	public void setFileTo(File file) {
		this.file = file;
	}
	

	public void readArray() {
		
		String[] property;
		
		JSONParser parser = new JSONParser();
		
		try {
			
			JSONObject jObj =  (JSONObject) parser.parse(new FileReader(file));
			
			JSONArray jArray = (JSONArray) jObj.get("attributes");
			
			property = new String[jArray.size()];
			
			for (int i = 0; i < property.length; i++) {
				property[i] =  (String) jArray.get(i);
			}
			
			
			System.out.println(Arrays.toString(property));
			
		}
		catch (FileNotFoundException e) { e.printStackTrace(); }
		catch (IOException e) { e.printStackTrace(); }
		//catch (ParseException e) { e.printStackTrace(); }
		catch (Exception e) { e.printStackTrace(); }

	}
	

	
	
}
