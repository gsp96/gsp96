package ch02.ex01;

public class C02Output {

	public static void main(String[] args) {
		
		int score = 100;
		System.out.println(100);
		System.out.println(score);
		System.out.println(100+1);
		System.out.println(Math.random());
		
		System.out.print(200);
		System.out.print(300);
		System.out.print("\n");
		System.out.print(400);
		System.out.println();
		
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15, "hello");
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15, "hello");
		System.out.printf(" %b|%5c|%-5d|%s \n", true, 'a', 10, 1.15, "hello");
		
		String name = "고승표";
		int age = 26;
		System.out.printf("%s %d\n", name, age);
		System.out.printf("%s %d살 입니다.", name, age);
		
	}
	
}