package ch6;

public class TvTest4 {

	public static void main(String[] args) {
		Tv[] tvArr=new Tv[3];  //객체 배열 생성
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i]=new Tv();
			tvArr[i].channel=i+10;
		}
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].ChannelUp();
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}
		

	}

}
