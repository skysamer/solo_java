package ch5;

public class ArrayEx12 {

	public static void main(String[] args) {
		String[] names= {"Kim", "Park", "Yi"};
		
		for(int i=0; i<names.length; i++) {
			System.out.printf("names[%d]: %s%n", i, names[i]);
		}
		
		String tmp=names[2];
		System.out.printf("tmp: %s%n", tmp);
		names[0]="Yu";
		
		for(String str: names)
			System.out.println(str);

	}

}
