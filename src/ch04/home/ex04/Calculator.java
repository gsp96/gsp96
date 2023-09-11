package ch04.home.ex04;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int a = 0, b = 0;
		char op = 0;
		String go = "";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("a: ");
			a = sc.nextInt();
			System.out.print("op: ");
			op = sc.next().charAt(0);
			System.out.print("b: ");
			b = sc.nextInt();
			
			switch(op) {
			case '+':System.out.printf("%d %c %d = %d\n", a, op, b, a + b); break;
			case '-':System.out.printf("%d %c %d = %d\n", a, op, b, a - b); break;
			case '/':System.out.printf("%d %c %d = %d\n", a, op, b, a / b); break;
			case '*':System.out.printf("%d %c %d = %d\n", a, op, b, a * b); break;
			}
			System.out.print("계속할까요(y/n)?");
			go = sc.next();
		}while(go.equals("y"));
		
		System.out.println("끝.");
	}
}
