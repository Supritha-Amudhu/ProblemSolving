package com.atech.newdimension;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfArrays {

	public static void main(String[] args) {

		int[] array1 = { 1, 3, 5, 5, 4, 6, 7, 8, 9 };
		int[] array2 = { 2, 3, 5, 10, 5 };
		
		Set<Integer> unique = new HashSet<Integer>();
		List<Integer> intersect = new ArrayList<Integer>();
		
		for( int element : array1 )
			unique.add(element);
		
		for( int element: array2 ) {
			if( ! unique.add(element) ) {
				if( ! intersect.contains(element) )
					intersect.add(element);
			}
				
		}
		
		System.out.println( "Contents : " + intersect);
			
	}

}