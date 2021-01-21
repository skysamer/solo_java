package ch7;

import java.util.Arrays;

public class Exercise7_19 {
	public static void main(String[] args) {
		Buyer2 b=new Buyer2();
		b.buy(new Tv3());
		b.buy(new Computer2());
		b.buy(new Tv3());
		b.buy(new Audio2());
		b.buy(new Computer2());
		b.buy(new Computer2());
		b.buy(new Computer2());
		
		b.summary();

	}
}

class Buyer2{
	int money=1000;
	Product2[] cart=new Product2[3];
	int i=0;
	
	void buy(Product2 p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 더 이상 구매할 수 없습니다.");
			return;
		}
			
		else
			money=money-p.price;
		add(p);
	}
	
	void add(Product2 p) {
		if(i>=cart.length) {
			Product2[] cart2=new Product2[cart.length*2];
			System.arraycopy(cart, 0, cart2, 0, cart.length);
			cart=cart2;
		}
		cart[i++]=p;
	}
	
	void summary() {
		System.out.printf("구입한 물건: %s %n", Arrays.toString(cart));
		System.out.printf("사용한 금액: %d %n", 1000-money);
		System.out.printf("남은 금액: %d %n", money);
	}
	
}

class Product2{
	int price;
	
	Product2(int price){
		this.price=price;
	}
}

class Tv3 extends Product2{
	Tv3(){super(100);}

	@Override
	public String toString() {
		return "Tv3";
	}
}

class Computer2 extends Product2{
	Computer2(){super(200);}

	@Override
	public String toString() {
		return "Computer2";
	}
}

class Audio2 extends Product2{
	Audio2(){super(50);}

	@Override
	public String toString() {
		return "Audio2";
	}
}


