package com.craft.knowledges.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> m = new HashMap<>();
		//Map m1 = new HashMap<>();
		m.put("1", "Soresa");
		m.put("2", "John");
		//m.put("1", "weirdo");
	//	m.put("3", "Soresa");
	/*
	 * Set<String> keys = m.keySet();
	 * 
	 * for(String key : keys) { System.out.println(key + m.get(key));
	 * 
	 * }
	 */
		Set s = m.entrySet();
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey() + " " + me.getValue());
		}
		
	}

}
