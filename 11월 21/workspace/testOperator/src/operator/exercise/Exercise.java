package operator.exercise;
import java.util.*;

public class Exercise {
	public void example1() {
		//연습1
		//키보드로 문자하나를 입력받아
		//입력받은 문자가 영어소문자인지
		//물어보고 소문자이면 대문자로 바꾸고
		//출력 확인
		//소문자가 아니면 그대로 출력
		//삼항연산자 사용
		System.out.print("문자 하나 입력 : ");
		char ch = new Scanner(System.in).next().charAt(0);
		/*int a = ch;
		char result = (a>=97 && a<=129) ? (char)(a-32) : ch;
		System.out.println(result);*/
		char result = (ch>= 'a' && ch <= 'z')? (char)(ch-32):ch;
		System.out.println(ch + " =>" + result);
				
	}
	public void example2() {
		//연습2
		//키보드로 정수를 하나 입력받아
		//짝수인지 확인해서 
		//짝수이면 "짝수다"
		//아니면 "홀수다"
		//문자열을 문자열 변수에 기록하고
		//정수와 문자열값 출력 확인
		
		System.out.print("정수 하나 입력 : ");
		int num = new Scanner(System.in).nextInt();
		String result = (num%2==0) ? "짝수다" :"홀수다";
		System.out.println(result);
		
	}

	public void example3() {
		//연습3
		//성별을 문자 하나로 입력 받아
		//남자이면 'M' 또는 'm' 입력하고
		//여자면 'F' 또는 'f' 입력하고
		//'M'|'m'이면 "남자다." 출력하고
		//아니면 "여자다." 출력되게 함
		
		System.out.print("성별 입력(남:M/여:F) : ");
		char gender = new Scanner(System.in).next().toUpperCase().charAt(0);
													//입력 받은 영문소문자일 때 대문자로 변환
		
		/*String result = (gender=='m'|| gender=='M')? "남자다": "여자다";*/
		
		//System.out.println((gender == 'M')? "남자다.": "여자다");
		String result = (gender == 'M')? "남자다." : (gender == 'F'? "여자다": "잘못입력하셨습니다.");
												//트루        m이 아닐 때                    m도 f도 아닐 때
		System.out.println(result);
	}
	
}

