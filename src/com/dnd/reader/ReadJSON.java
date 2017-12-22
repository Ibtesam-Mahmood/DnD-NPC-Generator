package com.dnd.reader;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadJSON {

	
	private String inputFile;
	private Sheet sheet;
	
	public ReadJSON(String inputFile) {
		setFileTo(inputFile);
	}
	
	//Sets the file to the given directory
	public void setFileTo(String inputFile) {
		this.inputFile =  inputFile;
		setUp();
	}
	
	//Sets up the excel sheet to read
	private void setUp() {
		File inputWorkBook =  new File(inputFile);
		try {
			Workbook w = Workbook.getWorkbook(inputWorkBook);
			this.sheet = w.getSheet(0);	
		} catch (BiffException | IOException e) {
			e.printStackTrace();
		}
	}
	
		
	/*
	 * Skips the first row of a uniform excel sheet
	 * Iterates through an excel sheet and copies them into an m x n array
	 */
	public String[][] read() {
		
		String[][] list = new String[sheet.getRows() - 1][sheet.getColumns()];
		
		for(int i =  0; i < sheet.getColumns(); i++) {
			for (int j = 1; j < sheet.getRows(); j++) {
				
				Cell t = sheet.getCell(i, j);
				list[j-1][i] = t.getContents();
				
			}
		}
		
		return list;

	}
	

	
	
}
