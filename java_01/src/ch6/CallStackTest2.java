package ch6;

public class CallStackTest2 {
	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음.");
		firstmethod();
		System.out.println("main(String[] args)이 끝났음.");
	}
	
	static void firstmethod() {
		System.out.println("firstmethod()이 시작되었음.");
		secondmethod();
		System.out.println("firstmethod()이 끝났음.");
	}
	
	static void secondmethod() {
		System.out.println("secondmethod()이 시작되었음.");
		System.out.println("secondmethod()이 끝났음.");
	}

}
