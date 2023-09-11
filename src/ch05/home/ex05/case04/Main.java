package ch05.home.ex05.case04;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Man man = new Man();
		
		man.setName("최한석");
		man.setAge(33);
		man.setBirthDay(LocalDate.of(2025,6,7));
		
		man.sing();
		man.eat();
		man.run();
	}
}
