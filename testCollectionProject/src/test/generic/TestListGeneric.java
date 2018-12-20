package test.generic;

import java.util.*;

public class TestListGeneric {

	public ArrayList<String> makeList(){
		ArrayList<String> list;
		list = new ArrayList<String>();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		list.add("melon");
		list.add("grape");
		
		return list;
	}
	
	public void printList(ArrayList<String> list) {
		/*for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);   //제네릭선언시 형병환이 필요없음....꺼내면 바로 스트링
			System.out.println(str);
		}*/
		for(String s : list) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		// List Generic test
		TestListGeneric test = new TestListGeneric();
		ArrayList<String> list = test.makeList();
		test.printList(list);
	}

}
