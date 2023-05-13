package campus_console_project_leader_side2.MultifariousProgram;


import java.util.Scanner;

public class MultifariousProgramMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MultifariousProgramModel model = new MultifariousProgramModel();
        MultifariousProgramView view = new MultifariousProgramView();
        MultifariousProgramController controller = new MultifariousProgramController(model, view);

        System.out.println("실행가능한 프로그램은 아래와 같습니다.");
        System.out.println("1. 구구단");
        System.out.println("2. 계산기");
        System.out.println("3. 피라미드");
        System.out.print("원하시는 프로그램의 번호를 입력해주세요 : ");

        int choice = scanner.nextInt();

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
            default:
                System.out.println("올바른 선택이 아닙니다.");
        }
    }
}