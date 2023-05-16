package campus_console_project_leader_side.hankyungsoo.MultifariousProgram;

import java.util.Scanner;

public class MultifariousProgramView {
    double number = 0;
    private Scanner scanner;
    String changeNumber;

    public MultifariousProgramView() {
        scanner = new Scanner(System.in);
    }

    // 구구단 출력
    public void showResult(int[] result) {
        for (int i = 0; i < 9; i++) {
            System.out.println(result[0] + " x " + (i + 1) + " = " + result[i]);
        }
    }

	// 계산기 - 계산값 및 연산자 입력 및 결과출력
    public double getNumber() {
        scanner = new Scanner(System.in);
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

    // 결과값 산출
    public void showResult(double result) {
        if (result != 0) {
            System.out.println("결과: " + result);
            result = 0;
        } else {
            System.out.println("재입력이 필요합니다!");
        }

    }


    // 피라미드 메시지 출력 및 피라미드 출력
    public void displayMessage(String message) {
        System.out.print(message);
    }

    public void displayPyramid(int floor) {
        for (int i = 0; i < floor; i++) {
            for (int j = 0; j + i < floor; j++) { // 공백입력
                System.out.print(" ");
            }
            for (int k = 1; k / 2 <= i; k++) { // *입력
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
