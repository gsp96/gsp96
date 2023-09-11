package ch05.home.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		Phone phone = new Phone();
		
		phone.setMakerName("samsung");
		phone.setPrice(1_000_000);
		
		person.setName("최한석");
		
		person.setPhone(phone);
		
		person.sendMsg();
		person.call();
		person.playGame();
	}
}
