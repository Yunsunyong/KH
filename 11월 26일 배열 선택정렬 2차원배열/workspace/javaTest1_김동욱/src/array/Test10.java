package array;

public class Test10 {

	public static void main(String[] args) {
		int[][] array = new int[][] {{12, 41, 36, 56}, 
										{82, 10, 12, 61}, 
										{14, 16, 18, 78}, 
										{45, 26, 72, 23}};
		int[]copyAr=new int[array.length*4];
		int l=0;
		System.out.print("copyAr : ");
		for(int i=0; i<array.length;i++) {
			for(int j=0; j< array[i].length;j++) {
				for(int k=0; k<copyAr.length;k++) {
					if(copyAr[k]==array[i][j])
						break;
					copyAr[l+j]=array[i][j];
				}
			}
			l+=array[i].length;
		}
		for(int i=0;i<copyAr.length;i++) {
			
			if(copyAr[i]%3==0&&copyAr[i]!=0)
				System.out.print(copyAr[i]+" ");
		}
	}
	
}
