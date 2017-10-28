package com.atech.newdimension;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSort {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		TreeMap<Object, Object> tm = new TreeMap<Object, Object>();
		
		hm.put(2, "Harry");
		hm.put(48, "Ron");
		hm.put(-92, "Hermione");
		hm.put(0, "Katniss");
		hm.put(-986, "Peeta");
		hm.put(37, "Sherlock");
		System.out.println(hm);
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry m = (Map.Entry) (itr.next());
			tm.put(m.getKey(), m.getValue());
		}
		System.out.println(tm);
				
	}

}
