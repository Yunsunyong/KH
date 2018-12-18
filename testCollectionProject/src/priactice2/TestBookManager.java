package priactice2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBookManager {

	public static void menu() {
		BookManager bm = new BookManager();
		Scanner sc = new Scanner(System.in);
		
		int num;
		do {
			System.out.println("\n*** 도서 관리 프로그램 ***");
			System.out.println();
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.print("메뉴 선택 :");
			num = sc.nextInt();
			
			switch(num) {
			case 1 : bm.addBook(inputBook()); break;
			case 2 : bm.printBookList(bm.sortedBookList()); break;
			case 3 : bm.deleteBook(bm.searchBook(inputBookTitle())); break;
			case 4 : bm.printBook(bm.searchBook(inputBookTitle())); break;
			case 5 : bm.displayAll(); break;
			case 6 : System.out.println("도서 관리 프로그램 종료합니다."); break;
			default : System.out.println("번호를 잘못 입력하셨습니다.");
						System.out.println("다시 입력하십시오.");		
			}
		}while(num != 6);
	}
	
	public static Book inputBook() {
		Scanner sc = new Scanner(System.in);
		Book b = new Book();	
				
		System.out.print("도서번호 :");
		b.setbNO(sc.nextLine());	
		System.out.print("도서분류코드(1.인문/2.자연과학/3.의료/4.기타) :");
		b.setCategory(sc.nextInt());					
		System.out.print("책 제목 :");
		b.setTitle(sc.next());
		System.out.print("저자명 :");
		b.setAuthor(sc.next());
		
		return b;
	}
	public static String inputBookTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 도서명 : ");
		
		return sc.next();
	}
	
	public static void main(String[] args) {
		// 컬렉션실습문제2
		menu();
	}

}
