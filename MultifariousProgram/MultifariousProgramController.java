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
		boolean isValidInput = false; // 유효입력값확인조건 변수선언

		while (!isValidInput) { // 유효한 입력값인지 확인
			try {
				System.out.print("구구단을 출력할 숫자를 입력하세요 (1~999): ");
				int number = sc.nextInt();

				if (number >= 1 && number <= 999) {
					int[] result = model.run(number); // 입력값에 따라 계산 후 배열에 담음
					view.showResult(result); // 배열을 VIEW단의 출력메소드를 통해 출력
					isValidInput = true; // while문 탈출
				} else {
					throw new IllegalArgumentException("입력값이 유효한 범위를 벗어났습니다.");
				}
			} catch (InputMismatchException e) { // 숫자 이외 입력 시 재입력 받기
				System.out.println("숫자를 입력해주세요");
				sc.nextLine();
			} catch (IllegalArgumentException e) { // 입력범위를 벗어났을 때 처리
				System.out.println(e.getMessage());
			}
		}
	}

	// 계산기 출력
	public void calculate() {
		double num1 = view.getNumber(); // 첫번째 숫자를 입력받음
		double num2 = view.getNumber(); // 두번째 숫자를 입력받음
		char operator = view.getOperator(); // 연산자 입력받음
		switch (operator) { // 연산자에 따라 연산실행
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
		view.showResult(model.getResult()); // 결과 출력 메소드 실행
		model.setResult();
	}

	// 피라미드 입력 및 예외처리
	public void printPyramid() {
		Scanner sc = new Scanner(System.in);

		view.displayMessage("원하는 피라미드 층수를 입력해주세요 (2~10층) : ");

		while (true) {
			String input = sc.nextLine(); // 층수 입력

			if (input.isEmpty()) { // 값 입력안했을 시 재입력받기
				view.displayMessage("값을 입력해야 합니다.");
				continue;
			}
			try {
				int floor = Integer.parseInt(input); // 입력값 형변환

				if (floor < 2 || floor > 10) {
					view.displayMessage("입력 범위를 초과하였습니다. 다시 입력해주세요 : ");
				} else {
					model.setFloor(floor); // 층수설정
					view.displayPyramid(model.getFloor()); //피라미드 출력
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
