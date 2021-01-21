package ch7;

class SutdaDeck {
	final int CARD_NUM=20;
	SutdaCard[] cards=new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			int num=(i%10)+1;
			boolean isKwang=(i<10)&&(num==1||num==3||num==8);
			
			cards[i]=new SutdaCard(num, isKwang);
		}
	}
	
	void shuffle(){
		for(int i=0; i<cards.length; i++) {
			int j=(int)(Math.random()*cards.length);
			SutdaCard temp=cards[i];
			cards[i]=cards[j];
			cards[j]=temp;
		}
	}
	
	SutdaCard pick(int index) {
		if(index<0||index>CARD_NUM)
			return null;
		return cards[index];
	}
	
	SutdaCard pick() {
		int pick=(int)(Math.random()*cards.length);
		return pick(pick);
	}
}

class SutdaCard{
	int num;
	boolean isKwang;
	final int NUM;
	final boolean ISKWANG;
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.NUM=num;
		this.ISKWANG=isKwang;
	}

	@Override
	public String toString() {
		return NUM+(ISKWANG?"k":"");
	}
	
	
}

public class Exercise7_1 {
	public static void main(String[] args) {
		SutdaDeck deck=new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i]+", ");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));

	}

}
