package ch05.ex08.case03;

public class Citrus {
	private String name;
	
	public Citrus() {
		this("천혜향");
	}
	
	public Citrus(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
