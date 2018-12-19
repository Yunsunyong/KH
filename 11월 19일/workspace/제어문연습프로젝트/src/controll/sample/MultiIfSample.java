package controll.sample;

import java.util.Scanner;

public class MultiIfSample {
		//다중 if문 테스트용
	/*문자 하나를 입력받아
	 * 영어 대문자이면 "upper" 출력하고
	 * 대문자 아니고 영어 소문자이면 "lower" 출력
	 * 영문자가 아니고 숫자문자이면 "number" 출력
	 * 모두 아니면 "other" 출력 
	 * 
	 */
	public void testMulti1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력 : ");
		char ch  = sc.next().charAt(0);
		
		if(Character.isUpperCase(ch)) //영어 대문자인지
			System.out.println("upper");
		else if(Character.isLowerCase(ch)) //영어 소문자인지
			System.out.println("lower");
		else if(Character.isDigit(ch)) // 숫자인지
			System.out.println("number");
		else
			System.out.println("other");
	}
	
	/* 점수(정수)를 입력받아
	 * 점수에 따라 학점을 문자열변수에 기록
	 * 점수가 90점 이상이면 "A학점"
	 * 점수가 80이상 90미만이면 "B학점"
	 * 점수가 70이상 80미만이면 "C학점"
	 * 점수가 60이상 70미만이면 "D학점"
	 * 점수가 60미만이면 "F학점"
	 * 처리 후 점수와 학점을 출력
	 * 
	 */
	public void testMulti2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		String grade = "";
		if(score>=90)
			grade = "A학점";
		else if(score>=80)
			grade = "B학점";
		else if(score>=70)
			grade = "C학점";
		else if(score>=60)
			grade = "D학점";
		else
			grade = "F학점";
		
		System.out.println("점수 : "+score);
		System.out.println("학점 : "+grade);
		
	}
	
	public void testMulti3() {
		String s1 = "java"; //주소만 들어감
		//String s1 = new String("java"); heap메모리 안에 기록된 주소 값임
		String s2 = "apple";
		
		int n1 = 10, n2 = 20;
		System.out.println("s1-> " +s1.hashCode());
		System.out.println("s2-> " +s2.hashCode());
		System.out.println(s1 == s2); // 주소만 비교하기 떄문에 equals를 사용
		System.out.println(s1.equals("java"));
		System.out.println(s1.equals(s2));
	}
	
	/* 색이름을 입력받아 (예 : red)
	 * 입력된 색이름에 따라 문자열 출력 처리
	 * "red"이면 "빨강"
	 * "yellow" 이면 "노랑"
	 * "green 이면 "초록"
	 *	"blue"이면 "파랑"
	 * 그 외 다른 값이면 "기타" 출력
	 */
	public void testMulti4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("색 입력: ");
		String str  = sc.next();
		if(str.equals("red"))
				System.out.println("빨강");
		else if(str.equals("yellow"))
				System.out.println("노랑");
		else if(str.equals("green"))
				System.out.println("초록");
		else if(str.equals("blue"))
				System.out.println("파랑");
		else
			System.out.println("기타");
			
		
	}
}
