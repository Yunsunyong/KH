package home.menu;
import java.util.*;


public class CashBurgerKing {
	public void selectMenu() {
		int no=0;
		int d=0;
		int d1 = 0; // 추가메뉴
		int sum1 = 0; // 추가주문 계산값
		String c2="";
		do {
							
			System.out.printf("*** 메뉴를 선택하세요 ***\r\n" + 
				"\r\n" + 
				"	햄버거 ***************\r\n" + 
				"	1. 불고기버거	3500원\r\n" + 
				"	2. 치킨버거	3200원\r\n" + 
				"	추가 ****************\r\n" + 
				"	3. 감자튀김	1000원\r\n" + 
				"	4. 치즈스틱	400원\r\n" + 
				"	5. 샐러드		2000원\r\n" + 
				"	음료수 ***************\r\n" + 
				"	6. 콜라		700원\r\n" + 
				"	7. 에이드		1200원\r\n" + 
				"	8. 커피		1000원\r\n" + 
				"	********************\r\n" + 
				"	메뉴 선택 :");
			
			Scanner sc = new Scanner(System.in);
			no = sc.nextInt(); //메뉴
			int b = 0; //가격
			String c=""; //메뉴 이름
			switch(no) {
					case 1:
						b=3500;
						c="불고기버거";
						
						break;
					case 2:
						b= 3200;
						c="치킨버거";
						break;
					case 3:
						b=1000;
						c="감자튀김";
						break;
					case 4:
						b=400;
						c="치즈스틱";
						break;
					case 5:
						b=2000;
						c="샐러드";
						break;
					case 6:
						b=700;
						c="콜라";
						break;
					case 7:
						b=1200;
						c="에이드";
						break;
					case 8:
						b=1000;
						c="커피";
						break;
										
			}
			System.out.println(c+"를(을) 선택하셨습니다.");
		
			
			System.out.print("수량은 ? ");
			d = sc.nextInt(); //갯수
			System.out.println(d+"개 주문하셨습니다.");
			
			int sum = b*d; //주문 값
			
			
			d1 = d+d1; //추가 메뉴 더하기
			sum1 = sum1+sum; //추가주문 값
			String c1 = c+" : "+ d1+"개 - "+ sum1+"원 \n";
			c2 = c1+ c2;
			
			System.out.print("추가 주문하시겠습니까?(y/n): ");
			char e=sc.next().charAt(0);
			if(e=='n') {
				System.out.print("* 주문하신 정보는 다음과 같습니다. *\r\n" + 
						"	-----------------------------------------------\r\n"); 
				
				System.out.println(c2);
				
				System.out.print("	------------------------------------------------\r\n" + 
						"	총 가격 : "+sum1);
				System.exit(0);
			}
			
		}while(no!=8);
		//추가주문은 dowhile문 쓰면될듯
	
	
	}
}
