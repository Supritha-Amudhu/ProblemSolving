package com.atech.newdimension;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Given two arrays, combine them into a single array by alternating entries from each array without duplicates.
public class CombineTwoArrays {

	public static void main(String[] args) {
		int[] a = {0,3,1,2,4,5};
		int[] b= {8,4,9,6};
		Set<Integer> result = new LinkedHashSet<Integer>();
		int i=0, j=0, aLength=a.length, bLength=b.length;
		for(i=0,j=0;(i<aLength) || (j<bLength);i++,j++){
			if(i<aLength)
			result.add(a[i]);
			if(j<bLength)
			result.add(b[j]);
		}
		Iterator<Integer> itr = result.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
			
	}

}
