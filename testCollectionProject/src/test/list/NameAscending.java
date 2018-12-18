package test.list;

import java.util.Comparator;

//Person 객체들을 name 필드 기준
//오름차순정렬 처리할 클래스
public class NameAscending implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// 정렬기준이 되는 필드에 대한 조건처리
		int result = 0;
		
		if(o1 instanceof Person && o2 instanceof Person) {
			Person p1 = (Person)o1;
			Person p2 = (Person)o2;
			
			//name 필드값을 비교해서
			//두 이름이 같으면 0
			//앞 객체의 이름이 큰 1
			//뒤 객체의 이름이 크면 -1 리턴처리
			if(p1.getName().compareTo(p2.getName()) > 0) {
				result = 1;
			}else if(p1.getName().compareTo(p2.getName()) < 0) {
				result = -1;
			}
			
		}
		
		return result;
	}
	
}