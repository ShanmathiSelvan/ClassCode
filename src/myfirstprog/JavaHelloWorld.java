package myfirstprog;

public class JavaHelloWorld {
	public int num = 10;
	public String name ="Pappu";
	public float num1=0.7f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World ---Shanmathi");
		JavaHelloWorld n = new JavaHelloWorld();
		System.out.println(n.num);
		n.test();
		System.out.println(n.num1);
		System.out.println(n.name);
	}

	public void test() {
		System.out.println("Hi All-- i like this training.I learnt about Intellisense ");
	}
}
