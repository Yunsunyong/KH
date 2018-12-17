package test.set;

import java.util.*;

public class TestHashSet {

	public static void main(String[] args) {
		// HashSet test
		HashSet hset = new HashSet();
		System.out.println(hset.isEmpty()); //비어있으면 true
		System.out.println(hset.size()); //객체개수
		
		//객체만 저장할 수 있음. 컬렉션들은
		hset.add(new String("apple"));
		hset.add("banana");  //문자열값 자체가 주소를 발생함 그래서 new안해도됨
		hset.add(new Integer(123));
		//data(값) ---> instance(객체) : Boxing
		//Wrapper 클래스 사용
		hset.add(456);    //Auto Boxing 처리됨 >> hset.add(new Integer(456)); 바꿈
		hset.add(new Double(54.7));  //Boxing 처리
		hset.add(3.15);   //Auto Boxing 처리됨 >> hset.add(new Double(3.15)); 바꿈
		//기본자료형 값에 대해서는
		//컬렉션에 저장시 자동 boxing 처리됨
		
		//부모클래스에 toString() 오버라이딩되어 있음
		System.out.println(hset.toString()); //[자료형,자료형,자료형]
		//저장순서가 유지 안 됨 <<< set의 특징
		//중복 허용 안 함
		hset.add("apple");   //같은 값은 중복 저장 안됨
		hset.add("banana");
		System.out.println(hset);
		System.out.println(hset.size());  
		
		if(hset.contains("apple")) {//contains 객체가 저장되 있는지 확인메소드
			hset.remove("apple"); //remove 객체가 저장되 있으면 삭제하는 메소드
		}
		
		System.out.println(hset.toString());
		System.out.println(hset.size());
	
		/*hset.clear();   // 전부 다 지워버림
		System.out.println(hset.isEmpty());*/
		
		//저장된 객체 정보를 하나씩 꺼내서
		//사용하는 방법 (하나를 꺼내는 방법은 없음)
		//첫번째 : 저장된 객체의 목록만들기
		//목록 : iterator 라고 함
		System.out.println("1--------------");
		Iterator iter = hset.iterator();  //set에 들어있는 객체를 목록(iter)으로 만듬		
		while(iter.hasNext()) {
			Object obj = iter.next();  //리턴타입이 Object임
			System.out.println(obj);
		}
		//두번째 : Object[] 로 바꾸어 꺼내기
		System.out.println("2--------------");
		Object[] objArr = hset.toArray();
		for(int i = 0; i < objArr.length; i++) {
			System.out.println(objArr[i]);
		}
		/*for(Object ob : hset.toArray()) {향상된 for문
			System.out.println(ob);
		}*/
		
		//세번째, toArray(T[] a) 사용하는 방법
		Object[] objArr2 = new Object[hset.size()]; 
		hset.toArray(objArr2);
		System.out.println("3--------------");
		for(Object o : objArr2) {
			System.out.println(o);
		}
	}
}
