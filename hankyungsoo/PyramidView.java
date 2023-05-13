/*
PyramidView는 메시지를 표시하고 피라미드를 출력하는 클래스입니다.
displayMessage 메서드는 메시지를 출력합니다.
displayPyramid 메서드는 주어진 층수에 맞게 피라미드를 출력합니다.
 */

package campus_console_project_leader_side2.hankyungsoo;

public class PyramidView {
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
