package practice1;

import java.util.*;

public class Lotto {

	public static void lottoDisplay() {
		TreeSet tset = new TreeSet();
		boolean lottoNuber;
		for(int i = 0; i < 6; i++) {
			tset.add((int)(Math.random() * 45)+1);
		}
		System.out.println(tset);
		Object[] obj = tset.toArray();	
		int[] iar = new int[tset.size()];
		
		for(int i = 0; i < iar.length; i++) {
			iar[i] = (Integer)obj[i];
			//Auto UnBoxing
			System.out.print(iar[i] + "  ");
		}
		System.out.println();	
	
	/*Random r = new Random();
	TreeSet tset = new TreeSet();
	
	while(true) {
		tset.add(r.nextInt(45) +1);
		if(tset.size() == 6) {
			break;
		}
	}
	Object[] obj = tset.toArray();
	int[] iar = new int[tset.size()];
	
	for(int i = 0; i < iar.length; i++) {
		iar[i] = (Integer)obj[i];
		System.out.print(iar[i] + " ");
	}
	
*/	
	}	
	public static void main(String[] args) {
		// 컬렉션실습문제 문제1
		lottoDisplay();
	}

}
