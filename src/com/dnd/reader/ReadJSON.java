package com.dnd.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
	

	public void read() {
		
		JSONParser parser = new JSONParser();
		
		try {
			
			JSONObject jObj =  (JSONObject) parser.parse(new FileReader(file));
			String property =  (String) jObj.get("PROPERTY");
			
			JSONArray jArray = (JSONArray) jObj.get("LIST PROPERTY");
			Iterator<String> iterator = jArray.iterator();
			
			while(iterator.hasNext()) {
				//do something with the array
			}
			
		}
		catch (FileNotFoundException e) { e.printStackTrace(); }
		catch (IOException e) { e.printStackTrace(); }
		//catch (ParseException e) { e.printStackTrace(); }
		catch (Exception e) { e.printStackTrace(); }

	}
	

	
	
}
