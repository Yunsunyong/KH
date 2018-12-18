package test.map;

import java.util.*;


import priactice2.Book;

public class TestMapGeneric {

	public static void main(String[] args) {
		// Map 계열의 제네릭 기능 사용
		//<k,v> <--- 이 표시는 계속 따라 붙음	
		HashMap<String, Book> hmap = getInstance();
		//printMap(hmap);
		//printMap2(hmap);
		printMap3(hmap);
		
	}

	public static HashMap<String, Book> getInstance(){
		HashMap<String, Book> hmap = new HashMap<String, Book>();
		
		hmap.put("12", new Book("12", 1, "자바정복","홍길동"));
		hmap.put("23", new Book("23", 2, "홍길동전","허난설헌"));
		hmap.put("37", new Book("37", 3, "취미생활","금성출판"));
		//hmap.put(77, "77"); 선언된 타입이 아니면 error;
		return hmap;
	}
	public static void printMap(HashMap<String, Book> hmap) {
		//첫번째, key를 Set으로 바꾸는 방법
		Set<String> keys = hmap.keySet();
		//목록만들기
		Iterator<String> keyIter = keys.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			Book b = hmap.get(key);
			System.out.println(key +"=" + b);
		}
	}
	public static void printMap2(HashMap<String, Book> hmap) {
		//두번째, 값객체들을 Collection으로 바꿈
		Collection<Book> values = hmap.values(); 
		//목록만들기
		Iterator<Book> valueIter = values.iterator();
		while(valueIter.hasNext()) {
			Book b = valueIter.next();
			System.out.println(b);
			//제네릭을 선언하면 형변환이 필요가 없음
		}
		System.out.println("=============");
		//배열로 바꾸기
		Book[] bar = new Book[values.size()];
		values.toArray(bar);
		for(Book b : bar) {
			System.out.println(b);
		}
		System.out.println("=============");		
	}
	public static void printMap3(HashMap<String, Book> hmap) {
		//네번째, 키와 값을 묶은 엔트리들을 Set으로 바꿈
		Set<Map.Entry<String, Book>> entries = hmap.entrySet();
		//목록만들기
		Iterator<Map.Entry<String, Book>> entryIter = entries.iterator(); 
		while(entryIter.hasNext()) {
			Map.Entry<String, Book> entry = entryIter.next();
			String key = entry.getKey();
			Book b = entry.getValue();
			System.out.println(key + " = " + b);
		}
	}
	//public static interface Map.Entry<K,V>
	//클래스 인터페이스에 static을 쓸수 있는 이유는
	//내부클래스여서 멤버로 침
}
