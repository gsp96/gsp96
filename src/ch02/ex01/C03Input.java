package ch02.ex01;

import java.util.Scanner;

public class C03Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("문자를 입력하세요. \n>");
		char c = sc.nextLine().charAt(0);
		System.out.println(c+"를 입력했습니다.");
	}

}