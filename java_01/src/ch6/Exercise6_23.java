package ch6;

import java.util.Arrays;

public class Exercise6_23 {
	
	static int max(int[] arr) {
		
		if(arr==null||arr.length==0)
			return -999999;
		int maxer=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>maxer)
			{
				maxer=arr[i];
			}
		}
		
		
		
		return maxer;
	}

	public static void main(String[] args) {
		int[] data= {3, 2, 9, 4, 7};
		
		System.out.println(Arrays.toString(data));
		
		System.out.printf("최댓값: %d%n", max(data));
		System.out.printf("최댓값: %d%n", max(null));
		System.out.printf("최댓값: %d", max(new int[] {}));

	}

}
