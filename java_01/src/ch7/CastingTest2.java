package ch7;

public class CastingTest2 {

	public static void main(String[] args) {
		Car car=new Car();
		Car car2=null;
		FireEngine fe=null;
		
		car.drive();
		fe=(FireEngine)car;   //자식클래스 참조변수=조상타입 인스턴스(new Car())  ==>> 不可
		fe.drive();
		car2=fe;
		car2.drive();

	}

}
