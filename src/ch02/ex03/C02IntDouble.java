package ch02.ex03;

public class C02IntDouble {
	public static void main(String[] args) {
		double d = 1.92;
		int i = (int)d;
		System.out.printf("%d, %f\n", i,d);
		
		double f = Math.floor(d);
		double r = Math.round(d);
		
		System.out.printf("%f, %f",f ,r);
	}
}
