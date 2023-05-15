package campus_console_project_leader_side.hankyungsoo.MultifariousProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultifariousProgramMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MultifariousProgramModel model = new MultifariousProgramModel();
        MultifariousProgramView view = new MultifariousProgramView();
        MultifariousProgramController controller = new MultifariousProgramController(model, view);

        System.out.println("실행 가능한 프로그램은 아래와 같습니다.");

        int choice = 0;
        while (choice != 4) {
            System.out.println("1. 구구단");
            System.out.println("2. 계산기");
            System.out.println("3. 피라미드");
            System.out.println("4. 프로그램 종료");
            System.out.print("원하시는 프로그램의 번호를 입력해주세요: ");
            try {
            choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        controller.gugudan();
                        break;
                    case 2:
                        controller.calculate();
                        break;
                    case 3:
                        controller.printPyramid();
                        break;
                    case 4:
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    default:
                        System.out.println("올바른 선택이 아닙니다. ");
                }
                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println("올바른 값이 아닙니다. ");
                sc.nextLine();
                System.out.println();
            }
        }
    }
}