package com.dnd.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJSON {

	//Reads a JSON file
	
	private File file;
	

	public ReadJSON(File file) {
		setFileTo(file);
	}
	
	public ReadJSON(String file) {
		setFileTo(file);
	}
	
	//Sets the file to the given directory
	public void setFileTo(String file) {
		String path = Paths.get(file).toAbsolutePath().toString();
		
		this.file = new File(path);
	}
	
	public void setFileTo(File file) {
		this.file = file;
	}
	
	//Chooses a random file from a directory
	//@param dir - the directory from which the files are located
	public static File randomFile(String dir) {
		File[] files =  (new File(dir)).listFiles();
		Random r =  new Random();
		File fileDir = files[r.nextInt(files.length)];

		return fileDir;
	}
	

	//Parses a simple JSON file with a single array into a string array
	//@param key - the array index within the JSON
	public String[] readArray(String key) {
		
		String[] array;
		
		JSONParser parser = new JSONParser();
		
		try {
			
			JSONObject jObj =  (JSONObject) parser.parse(new FileReader(file));
			JSONArray jArray = (JSONArray) jObj.get(key);

			array = new String[jArray.size()];
			
			for (int i = 0; i < array.length; i++) {
				array[i] =  (String) jArray.get(i);
			}
			
		}
		catch (FileNotFoundException e) { e.printStackTrace(); return null; }
		catch (IOException e) { e.printStackTrace(); return null;}
		catch (Exception e) { e.printStackTrace(); return null;}
	
		return array;

	}
	
	public String readValue(String key) {
		
		String val;
		
		JSONParser parser = new JSONParser();
		
		try {
			
			JSONObject jObj =  (JSONObject) parser.parse(new FileReader(file));
			val = (String) jObj.get(key);

			
		}
		catch (FileNotFoundException e) { e.printStackTrace(); return null; }
		catch (IOException e) { e.printStackTrace(); return null;}
		catch (Exception e) { e.printStackTrace(); return null;}
	
		return val;

	}
	
	public String getFileName() {
		return file.getName().substring(0, file.getName().indexOf("."));
	}
	
	
}
