package test.array.premitive;
import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class ArraySample {
	public void test1() {
		int[] ar = new int[10];
		Random ref = new Random();
		int sum = 0;
		
		for(int i =0; i<10;i++) {
			ar[i] = (int)(ref.nextInt(100))+1;
			if(i==9) {
				System.out.print(ar[i]+"=");
			}
			else
				System.out.print(ar[i]+"+");
			sum+=ar[i];			
		}
		
		
		System.out.println(sum);
	}
	
	public void test2() {
		int[]ar = new int[10];
		
		
		for(int i =0;i<10;i++) {
			ar[i]=(int)(Math.random()*100)+1;
			System.out.print(ar[i]+"  ");
		}
		int max = ar[0];
		int min = ar[0];
		System.out.println();
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>max)
				max=ar[i];
			if(ar[i]<min)
				min=ar[i];
		}
		System.out.println(max);
		System.out.println(min);
	}
	
	public void test3() {
		byte[]ar = new  byte[10];
		
		for(int i=0;i<ar.length;i++) {
			ar[i]= (byte) ((int)(Math.random()*Byte.SIZE)+1);
					
			if(ar[i]%2==0)
				System.out.println(ar[i]);
		}
	
		
	}
	
	public void test4() {
		Scanner sc= new Scanner(System.in);
		String[] name = new String[1];
		name[0] = sc.nextLine();
			
		/*for(i=0;i<name[0].length();i++) {
			System.out.println(name[0].substring(0, 5));
		}*/
		int a=0;
		for(int i=0;i<name[0].length();i++) {
			a+=Integer.parseInt((name[0].substring(i, i+1)));
				
		}
		System.out.println("합: "+a);
	}
	public void test5() {
		Scanner sc=new Scanner(System.in);
		String[] num = new String[1];
		num[0]=sc.nextLine();
		int sum=0;
		for(int i=0;i<num[0].length();i++) {
			sum+=num[0].charAt(i)-48;
		}
		System.out.println(sum);
	}
	
	public void test6() {
		String[] personID = new String[1];
		personID[0] = "881225-1234567";
		int year = Integer.parseInt(personID[0].substring(0,2))+1900;
		int month = Integer.parseInt(personID[0].substring(2,4))-1;
		int day = Integer.parseInt(personID[0].substring(4, 6));
		int gender = Integer.parseInt(personID[0].substring(7,8));
		
		/*Date da = new Date();
		
		da.setYear(year);
		da.setMonth(month);
		da.setDate(day);
		System.out.println(da);*/
		Calendar ca = Calendar.getInstance();
		ca.set(year, month, day);
		System.out.println(ca.getTime());
		int sun = ca.get(Calendar.DAY_OF_WEEK);
		String[] str = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		System.out.println(str[sun-1]);
	}
}

