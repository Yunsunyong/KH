package logic.home.model;

import java.util.Scanner;

public class VariableSample {
	private Scanner sc = new Scanner(System.in);
	public void myProfile() {
		System.out.print("이름 입력 : ");
		String name =sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력 : ");
		double height = (int)(sc.nextDouble()*10)/10.0;
		System.out.print("핸드폰 번호 입력 : ");
		String phone = sc.next();
		
		System.out.println();
	}
	public void emplnformation() {}
	public void defaultValue() {}
	
}
