package munjae1;

public class Increment implements Runnable{
	private int num;
	public Increment() {}
	
	public Increment(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i +"in");
			try {
				Thread.sleep(50L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
