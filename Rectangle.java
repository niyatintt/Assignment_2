package assignment2;

public class Rectangle {

	int length;
	int breadth;
	
	
	
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	
	public void areaofRectangle() {
		
		int area=length*breadth;
		System.out.println("tha area of rectangle is "+area);
		
	}
	public void peremeterofRectangle() {
		int peremeter=2*(length+breadth);
		System.out.println("the peremter of rectangle is "+peremeter);
	}
	
}
