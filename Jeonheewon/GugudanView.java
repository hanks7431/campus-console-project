package campus_console_project_leader_side2.Jeonheewon;

public class GugudanView {
   
    public void showResult(int[] result) {
    	for (int i = 0; i < 9; i++) {
            System.out.println(result[0] + " x " + (i+1) + " = " + result[i]);
        }
    }
}