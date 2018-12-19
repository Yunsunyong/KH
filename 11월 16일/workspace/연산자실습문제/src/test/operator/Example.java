package test.operator;
import java.util.*;

public class Example {
	public void sample1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		int sum = kor+eng+math;
		double avg = sum/3.0;
		
		String result = (kor>=40 && eng>=40&& math >=40&& avg>=60)? "합격":"불합격";
		System.out.println(result);
			
	}
	
	public void sample2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년 : ");
		int year = sc.nextInt();
		System.out.print("반 : ");
		int cla = sc.nextInt();
		System.out.print("번호 : ");
		int num = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적 : (소수 둘째자리까지) ");
		double grade = (sc.nextDouble() * 100)/100.0;
		//grade = (int)(grade*100)/100.0   ->int계산이후 100.0을 나눠 실수 값이 나오게 소수둘쨰자리
		
		String gender2 = (gender=='M') ? "남학생":"여학생";
		System.out.println(year+"학년 "+cla+"반 "+num+"번 "+gender2+" "+name+"은 "
							+"성적이 "+grade+"이다");
		/*((gender == 'M'? "남학생":"여학생"))*/
		/*System.out.printf("%d 학년 %d반 %d번 %s %s 은 성적이 %.2f 이다", year,cla,num,gender2,name,grade);*/
		
				
	}
	
	public void sample3() {
		System.out.print("정수 입력 : ");
		int num = new Scanner(System.in).nextInt();
		String result = (num>0)? "양수다": "양수가 아니다";
		System.out.println(result);
//		System.out.println((num>0)?"양수다" : "양수가 아니다");
	}
	
	public void sample4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		String result = (num%2==0) ? "짝수다": "홀수다";
		System.out.println(result);
	}
		
	
	
}
