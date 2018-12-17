package test.list;

import java.util.*;

public class TestPersonArrayList {

	public static void main(String[] args) {
		// Person 저장용 ArrayList 사용
		ArrayList alist = new ArrayList();
		
		alist.add(new Person("홍길동" , 25, 1537.5));
		alist.add(new Person("이순신", 49, 15789.0));
		alist.add(new Person("신사임당", 55, 34567.4));
		
		System.out.println(alist);
		
		for(Object o : alist) {
			System.out.println(o);
		}
		
		//각 객체가 가진 포인트 값의 합계를 구함
		double totalPoint = 0;
		for(int i = 0; i < alist.size(); i++) {
			Person p = (Person)(alist.get(i));
			totalPoint += p.getPoint();
		}
		
		System.out.println("포인트 총합 : " + totalPoint);
	}

}
