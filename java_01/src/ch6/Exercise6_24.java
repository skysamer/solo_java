package ch6;

public class Exercise6_24 
{
	static int abs(int a)
	{
		return a>0 ? a: -a;
	}
	
	
	
	
	

	public static void main(String[] args) 
	{
		int value=5;
		int test=-10+(-10);
		System.out.println(test);
		System.out.printf("%d의 절댓값: %d%n", value, abs(value));
		value=-10;
		System.out.printf("%d의 절댓값: %d%n", value, abs(value));
	}

}
