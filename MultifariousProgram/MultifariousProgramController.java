package campus_console_project_leader_side.hankyungsoo.MultifariousProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultifariousProgramController {

	private final MultifariousProgramModel model;
	private final MultifariousProgramView view;

	public MultifariousProgramController(MultifariousProgramModel model, MultifariousProgramView view) {
		this.model = model;
		this.view = view;
	}

	// 구구단 입력 및 예외처리
	public void gugudan() {
		Scanner sc = new Scanner(System.in);
		boolean isValidInput = false;

		while (!isValidInput) {
			try {
				System.out.print("구구단을 출력할 숫자를 입력하세요 (1~999): ");
				int number = sc.nextInt();

				if (number >= 1 && number <= 999) {
					int[] result = model.run(number);
					view.showResult(result);
					isValidInput = true;
				} else {
					throw new IllegalArgumentException("입력값이 유효한 범위를 벗어났습니다.");
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요");
				sc.nextLine();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	// 계산기 출력
	public void calculate() {
		double num1 = view.getNumber();
		double num2 = view.getNumber();
		char operator = view.getOperator();
		switch (operator) {
		case '+':
			model.add(num1, num2);
			break;
		case '-':
			model.subtract(num1, num2);
			break;
		case '*':
			model.multiply(num1, num2);
			break;
		case '/':
			model.divide(num1, num2);
			break;
		default:
			System.out.println("계산방식선택");
			return;
		}
		view.showResult(model.getResult());
		model.setResult();
	}

	// 피라미드 입력 및 예외처리
	public void printPyramid() {
		Scanner sc = new Scanner(System.in);

		view.displayMessage("원하는 피라미드 층수를 입력해주세요 (2~10층) : ");

		while (true) {
			String input = sc.nextLine();

			if (input.isEmpty()) {
				view.displayMessage("값을 입력해야 합니다.");
				continue;
			}
			try {
				int floor = Integer.parseInt(input);

				if (floor < 2 || floor > 10) {
					view.displayMessage("입력 범위를 초과하였습니다. 다시 입력해주세요 : ");
				} else {
					model.setFloor(floor);
					view.displayPyramid(model.getFloor());
					break;
				}
			} catch (InputMismatchException e) {
				view.displayMessage("숫자를 입력해야 합니다.");
			} catch (IllegalArgumentException e) {
				view.displayMessage("올바른 값이 아닙니다. 다시 입력해주세요 : ");
			}
		}
	}
}
