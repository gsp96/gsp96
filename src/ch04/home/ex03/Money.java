package ch04.home.ex03;

public class Money {
	public static void main(String[] args) {
		int money = 0;
		int totMoney = 0;
		
		while(totMoney < 30) {
			money = (int)(Math.random() * 10) + 1;
			totMoney += money;
			
			if(totMoney ==30 || totMoney < 30) {
			System.out.println(money + ",000");
			}
			else{
				totMoney -= money;
			}
			
			
		}
		System.out.println(totMoney + ",000원을 꺼냈습니다.");
	}
}
