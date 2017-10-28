package com.atech.newdimension;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsData1 {

	public static void main(String[] args) {
		List A = new ArrayList();
		List B = new ArrayList();
		List a1 = new ArrayList();
		List a2 = new ArrayList();
		List b1 = new ArrayList();
		
		a1.add("String 1");
		a1.add(1);
		a1.add("String 1.1");
		
		A.add(a1);
		
		a2.add("String 2");
		a2.add(2);
		a1.add("String 2.1");
		
		A.add(a2);
		
		b1.add("String 1");
		b1.add(1);
		b1.add("String 1.1");
		
		B.add(b1);
				
		Iterator itr = A.iterator();
		while(itr.hasNext()){
			ArrayList x1 = (ArrayList) itr.next();
			if(x1.containsAll(b1)){
			System.out.println("The list b1 is present in A");
		}
		}
		
	}

}
