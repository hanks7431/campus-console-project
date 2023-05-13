package campus_console_project_leader_side2.Jeonheewon;

public class GugudanModel {
	public int[] run(int number) {
        int[] result = new int[9];
        for (int i = 0; i < 9; i++) {
            result[i] = number * (i + 1);
        }
        return result;
    }
}