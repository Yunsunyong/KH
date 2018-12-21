package munjae1;

public class TestThread1 {
	public static void main(String[] args) {
		Thread in = new Thread(new Increment(50));
		Thread de = new Thread(new Decrement(12,45));
		
		in.start();
		de.start();
	}
}
