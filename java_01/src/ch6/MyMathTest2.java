package ch6;

class MyMath2{
	long a, b;
	
	// 인스턴스 변수 a, b만을 이용해서 작업(매개변수 x)
	long add() {return a+b;}
	long subtract() {return a-b;}
	long multiply() {return a*b;}
	double divide() {return a/b;}
	
	// 매개변수만을 이용해 작업
	static long add(long a, long b) {return a+b;}
	static long subtract(long a, long b) {return a-b;}
	static long multiply(long a, long b) {return a*b;}
	static double divide(double a, double b) {return a/b;}
}
public class MyMathTest2 {
	public static void main(String[] args) {
		// 클래스메서드 호출
		System.out.println(MyMath2.add(200l, 100l));
		System.out.println(MyMath2.subtract(200l, 100l));
		System.out.println(MyMath2.multiply(200l, 100l));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		System.out.println("================================================");
		
		MyMath2 mm=new MyMath2();  
		mm.a=200l;
		mm.b=100l;
		// 인스턴스메서드는 객체생성 후에만 호출 가능
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());

	}

}
