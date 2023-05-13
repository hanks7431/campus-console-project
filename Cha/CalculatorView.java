package campus_console_project_leader_side2.Cha;

import java.util.Scanner;

public class CalculatorView {
	private Scanner scanner;

	public CalculatorView() {
		scanner = new Scanner(System.in);
	}

	public double getNumber() {
		System.out.print("값을 입력해주세요: ");
		return scanner.nextDouble();
	}

	public char getOperator() {
		System.out.print("수식을 입력해주세요 (+, -, *, /): ");
		return scanner.next().charAt(0);
	}

	public void showResult(double result) {
		System.out.println("결과: " + result);
	}
}