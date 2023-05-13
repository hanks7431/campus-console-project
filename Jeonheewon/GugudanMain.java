package campus_console_project_leader_side2.Jeonheewon;

import campus_console_project_leader_side2.MultifariousProgram.MultifariousProgramController;
import campus_console_project_leader_side2.MultifariousProgram.MultifariousProgramModel;
import campus_console_project_leader_side2.MultifariousProgram.MultifariousProgramView;

public class GugudanMain {
    
    public static void main(String[] args) {
        GugudanModel model = new GugudanModel();
        GugudanView view = new GugudanView();
        GugudanController controller = new GugudanController(model, view);
       
        controller.gugudan();
    }
}
