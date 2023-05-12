/*

PyramidController는 PyramidModel과 PyramidView를 관리하는 클래스입니다.
run 메서드는 사용자 입력을 받고 처리하는 역할을 합니다.
입력값을 검증하고 적절한 층수인지 확인합니다.
유효한 층수일 경우 모델에 설정하고, 그렇지 않을 경우 에러 메시지를 출력합니다.
마지막으로 PyramidView를 사용하여 피라미드를 출력합니다.

 */

package campus_console_project_leader_side.한경수;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PyramidController {
    private PyramidModel model;
    private PyramidView view;

    public PyramidController(PyramidModel model, PyramidView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        view.displayMessage("원하는 피라미드 층수를 입력해주세요 (2~10층) : ");

        try {
            while (true) {
                String input = sc.nextLine();

                if (input.isEmpty()) {
                    throw new IllegalArgumentException("값을 입력해야 합니다.");
                }

                int floor = Integer.parseInt(input);

                if (floor < 2 || floor > 10) {
                    view.displayMessage("입력 범위를 초과하였습니다. 다시 입력해주세요 : ");
                } else {
                    model.setFloor(floor);
                    break;
                }
            }

            view.displayPyramid(model.getFloor());

        } catch (InputMismatchException e) {
            view.displayMessage("숫자를 입력해야 합니다.");
        } catch (IllegalArgumentException e) {
            view.displayMessage("값을 입력해야 합니다.");
        }
    }
}
