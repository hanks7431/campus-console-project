package campus_console_project_leader_side2.MultifariousProgram;

import java.util.Scanner;

public class MultifariousProgramView {

    private final Scanner scanner;

    // 구구단 출력
    public void showResult(int[] result) {
        for (int i = 0; i < 9; i++) {
            System.out.println(result[0] + " x " + (i + 1) + " = " + result[i]);
        }
    }

    // 계산기 - 계산값 및 연산자 입력 및 결과출력
    public MultifariousProgramView() {
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

    // 피라미드 메시지 출력 및 피라미드 출력
    public void displayMessage(String message) {
        System.out.print(message);
    }

    public void displayPyramid(int floor) {
        for (int i = 0; i < floor; i++) {
            for (int j = 0; j + i < floor; j++) { // 공백
                System.out.print(" ");
            }
            for (int k = 1; k / 2 <= i; k++) { // *
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
