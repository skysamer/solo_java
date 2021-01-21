package ch7;

public class CastingTest1 {
	public static void main(String[] args) {
		
		Car car=null;
		FireEngine fe=new FireEngine();
		FireEngine fe2=null;
		
		fe.water();
		car=fe; // 형변환 생략 (오른쪽의 자식을 조상으로)
		//car.water();  // 조상클래스의 참조변수로 자식클래스의 매서드를 참조할수 없음
		fe2=(FireEngine)car;
		fe2.water();

	}

}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, brrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}
