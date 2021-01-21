package ch6;

class Data{int x;}

public class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d=new Data();
		d.x=10;
		System.out.printf("main(): x= %d%n", d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.printf("main(): x= %d%n", d.x);

	}
	
	static void change(int x) {
		x=1000;
		System.out.printf("change(): x= %d%n", x);
	}

}
