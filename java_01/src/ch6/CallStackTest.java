package ch6;

public class CallStackTest {

	public static void main(String[] args) {
		firstmethod();

	}
	static void firstmethod() {
		secondmethod();
	}
	
	static void secondmethod() {
		System.out.println("secondmethod()");
	}

}
