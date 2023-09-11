package ch05.ex05.case07;

public class main {
	public static void main(String[] args) {
		Farmmer farmmer = new Farmmer();
		Retailer retailer = new Retailer();
		
		System.out.println(retailer.sell(farmmer.sell(1000)).getPrice());
	}
}
