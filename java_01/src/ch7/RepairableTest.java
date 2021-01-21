package ch7;

public class RepairableTest {

	public static void main(String[] args) {
		Tank tank=new Tank();
		Dropship dropship=new Dropship();
		
		Marine marine=new Marine();
		SCV scv=new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);

	}

}

interface Repairable{}

class Unit2{
	int hitpoint;
	final int MAX_HP;
	Unit2(int hp){
		MAX_HP=hp;
	}
}

class GroundUnit extends Unit2{
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit2{
	AirUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitpoint=MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable{
	Dropship(){
		super(125);
		hitpoint=MAX_HP;
	}

	@Override
	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit {
	Marine(){
		super(40);
		hitpoint=MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitpoint=MAX_HP;
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit2) {
			Unit2 u=(Unit2)r;
			while(u.hitpoint!=u.MAX_HP) {
				u.hitpoint++;
			}
			System.out.println(u.toString()+"의 수리가 끝났습니다.");
		}
	}
}


	




