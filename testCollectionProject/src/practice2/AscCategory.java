package practice2;

public class AscCategory implements java.util.Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		
		if(o1 instanceof Book && o2 instanceof Book) {
			Book b1 = (Book)o1;
			Book b2 = (Book)o2;
			
			if(b1.getCategory() > b2.getCategory()) {
				result = 1;
			}
			if(b1.getCategory() < b2.getCategory()) {
				result = -1;
			}
			if(b1.getCategory() == b2.getCategory()) {
				result = 0;
			}
			/*result = (b1.getCategory() > b2.getCategory())? 1 : 
				((b1.getCategory() == b2.getCategory())? 0 : -1);*/
			//삼항연사자
		}		
		return result;
	}
}
