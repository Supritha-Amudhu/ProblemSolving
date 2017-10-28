package com.atech.trial1;

import java.util.*;
import java.util.Map.Entry;

public class CollectionsHashMap {

	
	public static void main(String[] args)
	{
		HashMap hm = new HashMap();
		hm.put("One", 1);
		hm.put("Two", new Double(2.00));
		hm.put("Three", new Double(3.00));
		hm.put("Four", new Double(4.00));
		hm.put("Five", new Double(5.00));
		hm.put("Five", new Double(6.00));
		System.out.println(hm);
		//Adding keys and values from a map to a list.
		System.out.println("Values : "+hm.values());
		System.out.println("Keys : "+hm.keySet());
		List<String> list = new ArrayList();
		list.addAll(hm.keySet());
		list.addAll(hm.values());
		System.out.println("List : "+list);
		System.out.println(list.get(0));
		System.out.println(hm.get("Three"));
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Map.Entry me = (Map.Entry) itr.next();
			System.out.print("The Key is : " +me.getKey());
			System.out.println(" The value is : " +me.getValue());		
		
		}
		double change = ((Double)hm.get("Four")).intValue();
		hm.put("Four", new Double(change + 1000));
		System.out.println("Four's new value is : " +(hm.get("Four")));

	}

}
