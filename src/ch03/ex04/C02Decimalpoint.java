package ch03.ex04;

public class C02Decimalpoint {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		double shortPi = (int)(pi * 10) / 10.0;
		System.out.println(shortPi);
		
		shortPi = (int)(pi * 1000) / 1000.0;
		System.out.println(shortPi);
		
		shortPi = Math.round((pi * 1000)) / 1000.0;
		System.out.println(shortPi);
	}
}
