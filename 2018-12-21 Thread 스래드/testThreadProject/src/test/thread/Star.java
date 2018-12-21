package test.thread;

public class Star /*extends Thread*/implements Runnable {
	//스래드를 상속 못받으면 러너블을 상속 받으면 실행가능
	public Star() {}
	
	@Override
	public void run() {
		for(int k = 1; k < 501; k++) {
			System.out.println("★");
			/*try {
				Thread.sleep(10L);
				//1000이 1초 
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //멈추는 메소드
*/		}
	}
}
