package ch7;

class Outer{
	int value=10;
	
	class Inner{
		int value=20;
		
		void Method1() {
			int value=30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer.this.value);
		}
	}
}

public class InnerEx4 {

	public static void main(String[] args) {
		//인스턴스클래스의 인스턴스를 생성하려면 외부클래스의 인스턴스를 먼저 생성해야한다
		Outer oc=new Outer();
		Outer.Inner inner=oc.new Inner();
		inner.Method1();
		

	}

}
