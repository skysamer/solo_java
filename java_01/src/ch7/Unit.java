package ch7;

class Marine2 extends Unit{
	void move(int x, int y) {}
	
	void stimPack() {}
}

class Tank2 extends Unit{
	void move(int x, int y) {}
	void changeMode() {}
}

class Dropship2 extends Unit{
	void move(int x, int y) {}
	void load() {}
	void unload() {}
}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y); 
	void stop() {}
	

}
