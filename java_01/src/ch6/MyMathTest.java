package ch6;

public class MyMathTest {

	public static void main(String[] args) {
		MyMath mm=new MyMath();
		long result1=mm.add(5l, 3l);
		long result2=mm.subtract(5l, 3l);
		long result3=mm.multiply(5l, 3l);
		double result4=mm.divide(5l, 3l);
		
		System.out.printf("add(5l, 3l)=%d%n", result1);
		System.out.printf("subtract(5l, 3l)=%d%n", result2);
		System.out.printf("multiply(5l, 3l)=%d%n", result3);
		System.out.printf("divide(5l, 3l)=%f%n", result4);

	}

}


class MyMath{
	long add(long a, long b) {
		long result=a+b;
		return result;
	}
	
	long subtract(long a, long b) {return a-b;}
	long multiply(long a, long b) {return a*b;}
	double divide(double a, double b) {
		return a/b;
	}
}