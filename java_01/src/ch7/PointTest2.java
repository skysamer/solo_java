package ch7;

public class PointTest2 {

	public static void main(String[] args) {
		Point3D_1 p3=new Point3D_1();
		System.out.printf("p3.x= %d%n", p3.x);
		System.out.printf("p3.y= %d%n", p3.y);
		System.out.printf("p3.z= %d%n", p3.z);

	}

}

class Point2{
	int x=10;
	int y=20;
	
	public Point2(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
}

class Point3D_1 extends Point2{
	int z=30;
	
	Point3D_1(){
		this(100, 200, 300);
	}
	
	Point3D_1(int x, int y, int z){
		super(x, y);
		this.z=z;
	}
	
}
