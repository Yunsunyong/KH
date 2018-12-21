package munjae1;

public class Decrement implements Runnable{
	private int num1;
	private int num2;
	
	public Decrement() {}
	
	public Decrement(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	@Override
	public void run() {
		for(int i = num2; num1 <= i; i--) {
			System.out.println(i+"de");
			try {
				Thread.sleep(100L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
