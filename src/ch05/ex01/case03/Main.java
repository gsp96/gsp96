package ch05.ex01.case03;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		user.setName("고승표");
		user.setAge(26);
		
		System.out.printf("%s %d\n", user.getName(), user.getAge());
	}
}
