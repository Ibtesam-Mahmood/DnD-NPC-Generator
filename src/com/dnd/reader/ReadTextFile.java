package com.dnd.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadTextFile {

	//Reads a JSON file
	
	private File file;
	
	public ReadTextFile(String inputFile) {
		setFileTo(inputFile);
	}
	
	public ReadTextFile(File file) {
		setFileTo(file);
	}
	
	//Sets the file to the given directory
	public void setFileTo(String dir) {
		file = new File(dir);
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
	
	public String randomLine() {
		
		String string = "";
		
	    Random rand = new Random();
	    int n = 0;
	    
	    try(Scanner sc = new Scanner(file)){
	    	
		    while(sc.hasNext() )
		    {
		       ++n;
		       String line = sc.nextLine();
		       if(rand.nextInt(n) == 0)
		          string = line;  
		    }
	    } catch (FileNotFoundException e) { e.printStackTrace(); return null; }
	    
	    return string;
		
	}
	
	public String getFileName() {
		return file.getName().substring(0, file.getName().indexOf("."));
	}
	
	
}
