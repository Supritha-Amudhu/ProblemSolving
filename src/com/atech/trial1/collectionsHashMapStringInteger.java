package com.atech.trial1;

import java.util.*;
import java.util.Map.Entry;

public class collectionsHashMapStringInteger 
{
	public static void main(String[] args)
	{
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Harry", 1);
		hm.put("Ron", 2);
		hm.put("Hermione", 3);
		hm.put("Supritha", 4);
		hm.put("2", 2);
		hm.put("Harry", 2);
		hm.put("Harry", 5);
		hm.put("Harry", 4);
		hm.put("Harry", 8);
		hm.put("Harry", 22);
		hm.put("Harry", 19);
		
		System.out.println(hm.keySet());
		System.out.println(hm);
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> me = (Map.Entry<String, Integer>) itr.next(); 
			System.out.print(me.getKey()+ " : ");
			System.out.println(me.getValue());
		}
		Integer c = (hm.get("Ron")).intValue();
		hm.put("Ron", c + 2000);		
		System.out.println("Ron's new value : " +hm.get("Ron"));
		Map<String,Map<String,Integer>> map = new TreeMap<>();
		map.put("Map1", hm);
		System.out.println(map);
		System.out.println("Entry Set : " +map.get("Map1").entrySet());
		System.out.println("Key Set : " +map.get("Map1").keySet());
		

	}

}
