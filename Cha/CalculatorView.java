package Cal;

import java.util.Scanner;

//22:05
public class CalculatorView {
	private Scanner scanner;
	double number = 0;

	String changeNumber;

	public CalculatorView() {
		scanner = new Scanner(System.in);
	}

	// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	// 값 산출
	public double getNumber() {
		scanner = new Scanner(System.in);
		boolean numberCon = true;
		while (true) {
			try {
				System.out.print("값을 입력해주세요: ");
				changeNumber = scanner.nextLine();
				String restr = changeNumber.replaceAll("[^0-9]", "");
				number = Double.parseDouble(restr);
				return number;

			} catch (NumberFormatException e) {
				System.out.println("입력값이 잘못되었습니다 다시 입력해주세요");

			}
		}
	}

	// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	// 연산자 산출
	public char getOperator() {
		System.out.print("수식을 입력해주세요 (+, -, *, /): ");

		char operator = scanner.next().charAt(0);
		while (true) {
			if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
				return operator;
			} else {
				return 0;
			}
		}
	}

	// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	// 결과값 산출
	public void showResult(double result) {
		if (result != 0) {
			System.out.println("결과: " + result);
			result = 0;
		} else {
			System.out.println("재입력이 필요합니다!");
		}

	}
}