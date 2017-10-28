package com.atech.newdimension;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StringPatternRepeat {

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
		System.out.println("i array : ");
		printArray(iArray);
		System.out.println("j array : ");
		printArray(jArray);
		iResultArray = checkLoop(iArray);
		jResultArray = checkLoop(jArray);
		System.out.println("i result array : ");
		printArray(iResultArray);
		System.out.println("j result array : ");
		printArray(jResultArray); 		
		checkConsecutive(iResultArray);
	}
	
	public static void checkConsecutive(int[] array){
		int i=0,j=0,check=0;
		int[] consecutiveArray = new int[array.length];
		for(i=0;i<array.length;j++){
			check=2;
			for(j=0;j<array.length;j++){
				if(array[j+1]==(array[j]+1) ){
					check=1;
				}
				else{
					check=0;
					continue;
				}
			}
			
		}
	}
		
	public static void printArray(int[] array){
		int i=0;
		for(i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	
	public static int[] checkLoop(int[] array){
		int check=array[0],x=0, increment=0;
		Integer integer;
		Set treeSet = new TreeSet();		
		for(x=0;x<array.length;x++){
			treeSet.add(array[x]);
		}
		int[] resultArray = new int[array.length];
		Iterator itr = treeSet.iterator();
		while(itr.hasNext()){
			integer = (Integer) itr.next();
			resultArray[increment]=integer;
			increment++;
		}				
		return resultArray;
			
	}	

}