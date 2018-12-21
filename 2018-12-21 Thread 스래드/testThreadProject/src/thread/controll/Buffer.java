package thread.controll;

public class Buffer {
	private int number;
	private boolean empty = true;
	
	public synchronized int get() {//이 메소드는 동기화 처리됨 (synchronized) 한쪽이 쓰면 한쪽은 못씀
		while(empty) {
			System.out.println("값이 없어요. 공급될 때까지 기다려 주세요.....");
			try {
				wait();//스래드를 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//값이 있을 때 empty 가 false 임
		empty = true;
		notifyAll();  //스래드를 다시 실행상태로 바꿈
		return number;
		
	}
	public synchronized void put(int number) {
		while(!empty) {
			System.out.println("값이 소비될 때까지 기다리세요....");
			try {
				 wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//값이 없다면, empty 가true 이면
		empty = false;
		this.number = number;
		notifyAll();
	}
}
