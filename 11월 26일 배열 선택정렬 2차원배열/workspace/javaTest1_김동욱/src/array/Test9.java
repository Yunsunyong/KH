package array;

public class Test9 {

	public static void main(String[] args) {
		int [][]array=new int[][] {{12, 41, 36, 56}, 
										{82, 10, 12, 61}, 
										{14, 16, 18, 78}, 
										{45, 26, 72, 23}};
		int max,min;
		max=array[0][0];
		min=array[0][0];
		for(int i=0; i<array.length;i++) { //원래 0번째 배열과 1번째 배열로 비교해야되는데
											//2차원 배열로 하니 비교 시작점 헤깔려서 
											//[0][0]으로 시작
			for(int j=0; j<array[i].length;j++) {
				if(max<array[i][j])
					max=array[i][j];
				if(min>array[i][j])
					min=array[i][j];
							
			}
		}
		System.out.println("가장 큰 값 : "+max);
		System.out.println("가장 작은 값 : "+min);
	}

}
