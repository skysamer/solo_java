package ch7;

public class BindingTest {

	public static void main(String[] args) {
		Parent2 p=new Child2();
		Child2 c=new Child2();   // 왼쪽이 참조변수의 타입
		
		System.out.println("p.x= "+p.x);
		p.method();
		System.out.println();
		System.out.println("c.x= "+c.x);
		c.method();

	}

}

class Parent2{
	int x=100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child2 extends Parent2{
	int x=200;
	
	void method() {
		System.out.println("x= "+x);
		System.out.println("super.x= "+super.x);
		System.out.println("this.x= "+this.x);
	}
}
