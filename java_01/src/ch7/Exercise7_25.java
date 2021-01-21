package ch7;

class Outer2{
	int value=10;
	class Inner2{
		int value=20;
		void method() {
			int value=30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer2.this.value);
		}
	}
}

public class Exercise7_25 {

	public static void main(String[] args) {
		Outer2 o=new Outer2();
		Outer2.Inner2 inner=o.new Inner2();
		
		inner.method();

	}

}
