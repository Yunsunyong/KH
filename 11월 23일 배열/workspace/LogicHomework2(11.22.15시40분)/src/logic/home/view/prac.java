package logic.home.view;
import java.util.*;

public class prac {
	public static void main(String[] args) {
		char ch;
		int num;
		do {
			char ch1;
			num = new Scanner(System.in).nextInt();
			switch(num) {
			case 1:
				ch = new Scanner(System.in).next().charAt(0);
				System.out.println(ch);
				 break;
			}
			
			System.out.println(num);
		}while(num==1);
	}
}
