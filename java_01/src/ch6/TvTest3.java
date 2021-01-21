package ch6;

public class TvTest3 {

	public static void main(String[] args) {
		Tv t1=new Tv();
		Tv t2=new Tv();
		System.out.printf("t1의 채널값은 %d입니다.%n", t1.channel);
		System.out.printf("t2의 채널값은 %d입니다.%n", t2.channel);
		
		t2=t1;
		t1.channel=7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.printf("t1 의 channel값은 %d입니다.%n", t1.channel);
		System.out.printf("t2 의 channel값은 %d입니다.%n", t2.channel);
		

	}

}
