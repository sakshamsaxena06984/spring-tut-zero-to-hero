package basic;

public class Main {
	public static int func(int n) {
		if(n<=1) return 1;
		System.out.println("-- it is the recursive process!");
		return func(n-1)+func(n-2);
	}
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("fib no of 5 : "+func(10));
		
	}

}
