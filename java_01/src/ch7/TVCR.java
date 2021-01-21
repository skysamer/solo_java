package ch7;

class Tv1{
	boolean power;
	int channel;
	
	void power() {power=!power;}
	void channelUp(){++channel;}
	void channelDown() {--channel;}
}

class VCR{
	boolean power;
	int counter=0;
	void power() {power=!power;}
	void play() {}
	void stop() {}
	void rew() {}
	void ff() {}
}

public class TVCR extends Tv1 { // tv1클래스는 상속
	VCR vcr=new VCR();         // vcr 클래스는 포함
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}



}
