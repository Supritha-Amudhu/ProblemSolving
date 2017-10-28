package com.atech.trial1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import java.util.TreeMap;

//Automatically sorts based on Key value
public class CollectionsTreeMap {

	
	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		hm.put("Hello", new Integer(3));
		hm.put("Two", new Integer(4));
		hm.put("dsfsdg", new Integer(8));
		hm.put("sdfsdfds", new Integer(9));
		TreeMap tm = new TreeMap();
		tm.put("Three", new Integer(3));
		tm.putAll(hm);
		System.out.println("The map is : " +tm);
		//Returns a keyset
		System.out.println("The Keyset is : " +tm.keySet());
		//Returns null
		System.out.println(hm.get(4));
		Set set = tm.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Map.Entry me = (Map.Entry)itr.next();
			System.out.print("The key is : " +me.getKey());
			System.out.println("The value is : " +me.getValue());			
		}		
		int change = ((Integer)tm.get("Hello")).intValue();
		tm.put("Hello", new Integer(change + 12));
		System.out.println("The changed value is : " +tm.get("Hello"));
		System.out.println("First entry : " +tm.lastEntry());
		System.out.println("Last Entry : " +tm.firstEntry());
		HashMap submap = (HashMap) tm.subMap(1, 4);
		System.out.println(submap);
	}

}
