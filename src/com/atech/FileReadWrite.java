package com.atech.NewDimension;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {

	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		String word = "Harry";
		String line = null;		
		File file = new File("E:/NewFile.txt");	
		StringBuffer writtenText = null;
		String text = null;
		int count=1;
		
		try{
			if(!file.exists())
				file.createNewFile();
			FileWriter fw = new FileWriter(file);
			writtenText= new StringBuffer();	
			bw = new BufferedWriter(fw);
			br = new BufferedReader(new FileReader("E:/Sample.txt"));
			bw.write("");
			while((line=br.readLine())!=null){
				if(line.contains(word)){		
					bw.append("Line number "+count+ " : ");
					bw.append(line);
					bw.append("\r\n");
					count++;
				}
				
			}
			bw.close();		
		}
		catch(Exception ex){
			
			ex.printStackTrace();
			System.out.println("Exception caught.");
		}

	}

}
