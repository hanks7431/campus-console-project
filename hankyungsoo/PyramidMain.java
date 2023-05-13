/*
PyramidMain은 프로그램의 시작점입니다.
PyramidModel, PyramidView, PyramidController를 생성하고,
컨트롤러의 run메서드를 호출하여 프로그램을 실행합니다.
 */
package campus_console_project_leader_side2.hankyungsoo;
public class PyramidMain {
    public static void main(String[] args) {
        PyramidModel model = new PyramidModel();
        PyramidView view = new PyramidView();
        PyramidController controller = new PyramidController(model, view);

        controller.run();
    }
}
