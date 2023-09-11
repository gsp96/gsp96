package ch04.ex04;

import java.util.Scanner;

public class C03InOneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		String errMsg = "ERROR] 한자리 자연수를 입력하세요.";
		boolean isGood = false;
		
		do {
			System.out.print("입력: ");
			input = sc.nextLine();
			if((input.length() < 2) && 
					('0' < input.charAt(0) && input.charAt(0) <= '9'))
				isGood = true;
			else System.out.println(errMsg);
		}while(!isGood);
		
		System.out.println("끝.");
	}
}
