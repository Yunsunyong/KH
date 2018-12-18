package test.map;

import java.util.*;
import java.util.Map.Entry;

public class TestHashMap3 {

	public static void main(String[] args) {
		// HashMap 실습
		/* 
		 * */
		HashMap hmap = new HashMap();
		
		for(int i = 1; i <= 5; i++) {
			//1 ~ 100사이의 임의의 정수가 키
			//0.0 부터 1.0 미만의 임의의 실수값을 값 
			hmap.put(new Random().nextInt(100) + 1, Math.random());
			//Auto Boxing 처리됨
		}
		
		System.out.println(hmap);
		System.out.println("============");
		//맵에 기록된 객체 정보 연속 처리
		//첫번째. 키들을 Set 으로 
		//Set을 목록으로 바꾸어 처리
		Set sKey = hmap.keySet();
		Iterator sIter = sKey.iterator();
		
		while(sIter.hasNext()) {
			Object obj = sIter.next();
			System.out.println(obj);
		}
		System.out.println("============");
		//두번째. 값들을 Collection으로
		//Collection을 목록으로 처리
		Collection cValues = hmap.values();
		Iterator vIter = cValues.iterator();
		while(vIter.hasNext()) {
			System.out.println(vIter.next());
		}
		System.out.println("============");
		
		//세번째. Collection을 객체배열로
		Collection cValues1 = hmap.values();
		Object[] obj = cValues1.toArray();
		
		for(Object o : cValues1) {
			System.out.println(o);
		}
		System.out.println("============");
		//네번째, Map.Entry 들을 Set으로
		//목록으로 바꾸어서 처리
		Set es = hmap.entrySet();
		Iterator sIter1 = es.iterator();
		
		while(sIter1.hasNext()) {
			Map.Entry me = (Map.Entry)sIter1.next();
			System.out.println(me.getKey() + "=" + me.getValue());
		}
		/*while(sIter1.hasNext()) {
			Object obj1 = sIter1.next();
			Map.Entry me = (Map.Entry)obj1;
			System.out.println(me.getKey() + "=" + me.getValue());
		}*/
		
		
	}

}
