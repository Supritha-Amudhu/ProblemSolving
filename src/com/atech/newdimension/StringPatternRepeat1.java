package com.atech.newdimension;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StringPatternRepeat1 {

	public static void main(String[] args) {
		StringBuffer string = new StringBuffer("HarryHarryPotter");
		int i=0, length = string.length();
		char[] charArray = new char[length];
		for(i=0;i<length;i++){
		charArray[i] = string.charAt(i);
		System.out.println(charArray[i]);
		}		
		checkForRepeatedWord(charArray);

	}
	public static void checkForRepeatedWord(char[] charArray){
		int i=0,j=0,iCount=0,jCount=0;
		int[] iArray = new int[charArray.length];
		int[] jArray = new int[charArray.length];
		for(i=0;i<charArray.length;i++){
			for(j=i;j<charArray.length;j++){
				if(charArray[i] == charArray[j]){
					if(i==j)
						continue;
					iArray[iCount]=i;
					iCount++;
					jArray[jCount]=j;
					jCount++;
					System.out.println("i : "+charArray[i]);
					System.out.println("j : "+charArray[j]);
					System.out.println("i count : "+iArray[iCount]);
					System.out.println("j count : "+jArray[jCount]);
				}
			}
		}
		int[] iResultArray = new int[iArray.length];
		int[] jResultArray = new int[jArray.length];
		printArray(iArray);
		printArray(jArray);
		iResultArray = checkLoop(iArray);
		jResultArray = checkLoop(jArray);
		System.out.println("i result array : ");
		printArray(iResultArray);
		System.out.println("j result array : ");
		printArray(jResultArray);		
	}
		
	public static void printArray(ArrayList array){
		Integer integerObject = null;
		Iterator itr = array.iterator();
		while(itr.hasNext()){
			integerObject = (Integer) itr.next();
			System.out.println(integerObject);
		}
	}
	
	public static int[] checkLoop(int[] array){
		int check=array[0],x=0, increment=0;
		Integer integer;
		System.out.println("First element : "+check);
		Set treeSet = new TreeSet();		
		for(x=0;x<array.length;x++){
			treeSet.add(array[x]);
		}
		int[] resultArray = new int[array.length];
		Iterator itr = treeSet.iterator();
		while(itr.hasNext()){
			integer = (Integer) itr.next();			
			if(check==integer){
				resultArray[increment]=integer;
				System.out.println("This is what gets filled : "+resultArray[increment]);
				increment++;			
				}
			check++;
		}				
		return resultArray;
			
	}
	
	
	
	
	
	

}