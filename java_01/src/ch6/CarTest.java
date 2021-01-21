package ch6;

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white", "auto", 4);
	}
	
	Car(Car c){
		color=c.color;
		gearType=c.gearType;
		door=c.door;
	}
	
	Car(String color, String gearType, int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.color="white";
		c1.gearType="auto";
		c1.door=4;
		
		
		System.out.printf("color: %s, gearType: %s, door: %d %n", c1.color, c1.gearType, c1.door);

	}

}
