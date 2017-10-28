package com.atech.logicsolving;

import java.io.*;

public class BufferedReaderSample {

	public static void main(String[] args) {
		BufferedReader br = null;
		char a = 'a';
		try{
			File file = new File("E:\\Supritha\\Dream, Determined\\hp.txt");
			br = new BufferedReader(new FileReader(file));
			while((a = (char) br.read())!=0){
				System.out.println(a);				
			}			
			
			
		}
		catch(Exception ex){
			System.out.println("Caught.");
		}

	}

}
