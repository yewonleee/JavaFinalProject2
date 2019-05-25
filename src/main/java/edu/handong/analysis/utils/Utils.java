package edu.handong.analysis.utils;

import java.io.*;
import java.util.ArrayList;

public class Utils {
	public static ArrayList<String> getLines(String file, boolean removeHeader){
		ArrayList<String> newArray = new ArrayList<String>();
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			
			while ((line = br.readLine()) != null) {
				if (removeHeader == true)
					removeHeader = false;
				else
					newArray.add(line);
			}
			
		} catch (IOException ioe) {
			System.out.println("File doesn't exit! Please check again...\n");
			System.exit(0);
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
			}
		}
		return newArray;
		
	}
	
	
	public static void writeAFile(ArrayList<String> lines, String targetFileName) {
		
		File newfile = new File(targetFileName);
		File directory = new File(newfile.getParentFile().getAbsolutePath());
		directory.mkdirs();
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(newfile, true);
			for (String line : lines) {
				writer.write(line);
				writer.write("\n");
				writer.flush();
			}
		} catch (IOException ioe) {
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (Exception e) {
			}
		}
	}

}
