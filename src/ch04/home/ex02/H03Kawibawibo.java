package ch04.home.ex02;

import java.util.Scanner;

public class H03Kawibawibo {
	public static void main(String[] args) {
		int youSelect = 0, meSelect = 0, result = 0;
		String you = "";
		String me = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1.가위, 2.바위, 3.보\n");
		youSelect = sc.nextInt();
		meSelect = (int)(Math.random() * 3) + 1;
		
		switch(youSelect) {
		case 1: you = "가위"; break;
		case 2: you = "바위"; break;
		case 3: you = "보"; break;
		}
		
		switch(meSelect) {
		case 1: me = "가위"; break;
		case 2: me = "바위"; break;
		case 3: me = "보"; break;
		}
		
		System.out.println("You: "+you);
		System.out.println("Me: "+me);
		
		if((youSelect == 1&& meSelect == 3) || (youSelect == 2 && meSelect == 1) || (youSelect == 3 && meSelect == 2))
			System.out.println("You Win.");
		else if((youSelect == 1 && meSelect == 2) || (youSelect == 2 && meSelect == 3) || (youSelect == 3 && meSelect == 1))
			System.out.println("You lose.");
		else System.out.println("Fair");
	}
}
