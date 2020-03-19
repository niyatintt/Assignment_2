package assignment2;

public class Square extends Rectangle{
	
	int side=super.length;
	
	public Square(int side){
		super(side,side);
		
	}
	
public void areaofRectangle() {
		
		int area=(side*side);
		System.out.println("tha area of square is "+area);
		
	}
	public void peremeterofRectangle() {
		int peremeter=side*side;
		System.out.println("the peremter of square is "+peremeter);
	}

}
