package logic.home.model;

public class ContinueSample {
	public void sumJumpThree() {
		int sum = 0;
		for(int i=1;i<=100;i++) {
			if(i%3==0)
				continue;
			sum+=i;
		}
		System.out.println("1~100까지 정수 중 3의 배수를 뺸 정수들의 합 : "+ sum);
		
	}
	public void rowColJump() {
		for(int line=1;line<=5;line++) {
			for(int row=1;row<=3;row++) {
				if(row==3)
					if(line==3&&line==4&&line==5)
						continue;
				System.out.print("("+line+", "+row+")");
			}
			System.out.println();
		}
		
	}
	
}
