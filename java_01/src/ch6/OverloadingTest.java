package ch6;

public class OverloadingTest {
	public static void main(String[] args) {
		MyMath3 mm=new MyMath3();
		System.out.printf("mm.add(3, 3): %d%n", mm.add(3, 3));
		System.out.printf("mm.add(3l, 3): %d%n", mm.add(3l, 3));
		System.out.printf("mm.add(3, 3l): %d%n", mm.add(3, 3l));
		System.out.printf("mm.add(3l, 3l): %d%n", mm.add(3l, 3l));
		
		int[] a= {100, 200, 300};
		System.out.printf("mm.add(a): %d", mm.add(a));

	}

}

class MyMath3{
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("int add(int a, long b) - ");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.print("int add(long a, int b) - ");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.print("int add(int a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result=0;
		for(int i=0; i<a.length; i++) {
			result+=a[i];
		}
		return result;
	}
}