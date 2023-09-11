package ch05.ex05.case03;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public Paper add(Paper paper) {
		paper.setResult(add(paper.getA(), paper.getB()));
		return paper;
	}
}
