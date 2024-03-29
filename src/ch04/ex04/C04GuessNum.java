package ch04.ex04;

import java.util.Scanner;

public class C04GuessNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = 0;
		int guess = 0;
		int tries = 0;
		String msg = "";
		
		target = (int)(Math.random() * 1000) + 1;
		do {
			System.out.print("찍어봐.: ");
			guess = sc.nextInt();
			tries++;
			
			if(guess > target) msg = "Down.";
			else if(guess < target) msg = "Up.";
			else if(guess == target) msg = "";
			System.out.println(msg);
		}while(guess != target);
		
		System.out.printf("%d번만에 %d를 맞췄습니다.", tries,target);
	}
}
