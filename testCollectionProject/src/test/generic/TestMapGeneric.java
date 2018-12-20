package test.generic;

import java.util.*;

public class TestMapGeneric {

	public HashMap<Integer, String> makeMap(){
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(new Integer(3), new String("java"));
		hmap.put(5, "Servlet");  //Auto Boxing
		hmap.put(12, "JSP");
	
		return hmap;
	}
	
	public void printMap(HashMap<Integer, String> hm) {
		Set<Integer> keys = hm.keySet();
		Iterator<Integer> sIter = keys.iterator();
		while(sIter.hasNext()) {
			Integer i = sIter.next();
			String value = hm.get(i);
			System.out.println(i + "=" + value);
		}
	}
	
	public void printMap2(HashMap<Integer, String> hm) {
		Set<Map.Entry<Integer, String>> entries = hm.entrySet();
		Iterator<Map.Entry<Integer, String>> entryIter = entries.iterator();
		while(entryIter.hasNext()) {
			Map.Entry<Integer, String> me = entryIter.next();
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println(key +"=" + value);
		}
		
	}
	
	public static void main(String[] args) {
		// Map Generic test
		TestMapGeneric test = new TestMapGeneric();
		HashMap<Integer, String> hmap = test.makeMap();
		//test.printMap(hmap);
		test.printMap2(hmap);
	}

}
