package make.generic;

import java.util.*;

public class MyArray<T> {
	//T : type (자료형)
	private T[] array;   //자료형이 정해지지않은 배열
	
	public MyArray(T[] array) {
		this.array = array;   //외부에서 new 해서 전달받겠다
	}
	
	public void setArray(T[] array) {
		this.array = array;
	}
	public T[] getArray() {
		return this.array;
	}
	
	public void displayAll() {
		for(T obj : array) {
			System.out.println(obj);
			//T 타입은 toString()  오버라이딩해야 함
		}
	}
}
