package ch7;

public class Exercise7_23{
	
	static double sumArea(Shape2[] arr) {
		double sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i].calcArea();
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		Shape2[] arr= {new Circle3(5.0), new Rectangle(3, 4), new Circle3(1)};
		System.out.println(sumArea(arr));
	}
}


abstract class Shape2{
	Point3 p;

	Shape2(Point3 p) {
		this.p = p;
	}

	Shape2() {
		this(new Point3(0, 0));
	}
	
	abstract double calcArea();

	public Point3 getP() {
		return p;
	}

	public void setP(Point3 p) {
		this.p = p;
	}
}

class Circle3 extends Shape2{
	double r;
	

	public Circle3(double r) {
		this(new Point3(0, 0), r);
	}


	public Circle3(Point3 p, double r) {
		super(p);
		this.r = r;
	}


	double calcArea() {
		return (r*r)*Math.PI;
	}
}

class Rectangle extends Shape2{
	double width;
	double height;
	
	

	public Rectangle(double width, double height) {
		this(new Point3(0, 0), width, height);
	}

	public Rectangle(Point3 p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}

	double calcArea() {
		return width*height;
	}
	
	boolean isSquare() {
		if(width==height)
			return true;
		else
			return false;
	}
}

class Point3{
	int x;
	int y;
	
	Point3(){
		this(0, 0);
	}
	
	Point3(int x, int y){
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {
		return "Point3 [x=" + x + ", y=" + y + "]";
	}
	
	
}
