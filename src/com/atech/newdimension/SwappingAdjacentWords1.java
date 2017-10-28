package com.atech.newdimension;

import java.util.Scanner;

public class SwappingAdjacentWords1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string = new String();
		System.out.println("Enter a string: ");
		string = scan.nextLine();
		adjacentWordsSwap(string);
	}
	
	public static void adjacentWordsSwap(String string){
		StringBuffer stringBuffer = new StringBuffer(string);
		StringBuffer stringToBeMerged = new StringBuffer();
		String[] splitString = string.split(" ");
		int i=0;
		for(i=0;i<(splitString.length);i=i+2){
			//stringBuffer = swap(splitString[i], splitString[i+1], string, i, (i+1), stringToBeMerged);
			stringToBeMerged.append(splitString[i+1]+" "+splitString[i]+ " ");
			}
		System.out.println("Swapped string : "+stringToBeMerged);
	}
	
	public static StringBuffer swap(String string1, String string2, String string, int position1, int position2, StringBuffer stringToBeMerged){
		int i=0;
		String[] splitString = string.split(" ");
		for(i=0;i<splitString.length;i++){
			if(i==position1){
				splitString[position1]=string2;
				stringToBeMerged.append(splitString[position1]);
				stringToBeMerged.append(" ");
			}
			else if(i==position2){
				splitString[position2]=string1;
				stringToBeMerged.append(splitString[position2]);
				stringToBeMerged.append(" ");
			}
			
		}
		return stringToBeMerged;		
		
	}

}