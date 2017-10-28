package com.atech.newdimension;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.atech.linkedlist.LinkedList;

public class SameNumbersEvenOrOddArray {

	public static void main(String[] args) {
		
		int[] input = {0,0,2,3,4,0,4,3,2};
		Map map = new HashMap();
		int i=0, count=0;
		for(i=0;i<input.length;i++){
			if(map.containsKey(input[i])){
				count = (int) map.get(input[i]);
				count++;
				map.put(input[i], count);
			}
			else{
				map.put(input[i], 1);
			}
		}
		Set set = map.entrySet();
		Integer value = 0;
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry me = (Map.Entry) itr.next();
			value= (int)me.getValue();
			if((value%2)==0){
				System.out.println((int)me.getKey()+" : even");
			}
			else{
				System.out.println((int)me.getKey()+" : odd");
			}
		}

	}

}
