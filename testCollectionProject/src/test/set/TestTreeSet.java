package test.set;

import java.util.*;

public class TestTreeSet {

	public static void main(String[] args) {
		// TreeSet test
		// 중복 허용 안 함
		// 객체를 자동 오름차순정렬하면서 저장함
		TreeSet tset = new TreeSet();
		//Set tset = new TreeSet();
		//같은 클래스끼리만 오름차순됨
		
		tset.add("orange");
		tset.add("banana");
		tset.add("apple");
		tset.add("grape");
		
		System.out.println(tset);
		System.out.println("1-----------------");
		//1. iterator()
		Iterator iter = tset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("2-----------------");
		//2. toArray()
		Object[] objArr = tset.toArray();
		for(Object o : tset.toArray()) {
			System.out.println(o);
		}
		System.out.println("3------------------");
		//3. 내림차순정렬된 목록 만들기
		//decendingIterator()
		Iterator iter1 = tset.descendingIterator();
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		
		System.out.println("4------------------");
		//4. descendingSet()
		// 내림차순정렬 된 Set 만들기
		Set nset = tset.descendingSet();
		System.out.println(nset);
	}

}
