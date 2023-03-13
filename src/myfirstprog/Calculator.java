package myfirstprog;

public class Calculator {
	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();
		int a = 2, b = 3;
		int sum = m.add(3, 4);
		System.out.println("Sum is " + sum);
		int c = m.add(a, b);
		System.out.println("Second sum is " + c);

		int x = 10, y = 5;
		int c1 = m.subtract(x, y);
		System.out.println("Subtraction result is " + c1);

		int sub = m.subtract(10, 4);
		System.out.println("Subtraction result 2 is " + sub);

		int f = 23;
		int g = 2;
		int h=m.multiply(f, g);
		System.out.println("Multiplied result is "+h);
		int r=m.multiply(89, 3);
		System.out.println("Multiplied result2 is "+r);
		
		int q=45,w=9;
		int div=m.divide(q,w);
		System.out.println("Division result is "+div);
		int u=m.divide(12,4);
		System.out.println("Division result 2 is "+u);
		
	
		
		
		

	}
}
