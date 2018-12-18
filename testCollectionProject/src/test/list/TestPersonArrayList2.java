package test.list;

import java.util.*;

public class TestPersonArrayList2 {

	public static void main(String[] args) {
		// Generic 사용 테스트
		ArrayList<Person> alist;  //Person만 저장할수 있다.
		
		alist = addMethod();
		printList(alist);
		System.out.println("---------------------");
		alist.sort(new NameAscending());
		printList(alist);
		System.out.println("---------------------");
		alist.sort(new NameDescending());
		printList(alist);
		
		System.out.println("---------------------");
		alist.sort(new PointAscending());
		printList(alist);
		
		System.out.println("---------------------");
		alist.sort(new PointDescending());
		printList(alist);
	}
	public static ArrayList<Person> addMethod() {
		ArrayList<Person> alist = new ArrayList<Person>();
		alist.add(new Person("홍길동" , 25, 1537.5));
		alist.add(new Person("이순신", 49, 15789.0));
		alist.add(new Person("신사임당", 55, 34567.4));
		//alist.add(new String("test")); //에러
		return alist;
	}

	public static void printList(ArrayList<Person> alist) {
		double totalPoint = 0;
		for(Person p : alist) {			
			System.out.println(p);
			totalPoint += p.getPoint();
		}
		System.out.println("포인트 총합 : " + totalPoint);
		
		
	}
}
