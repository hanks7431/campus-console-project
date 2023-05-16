package campus_console_project_leader_side.hankyungsoo.MultifariousProgram;

public class MultifariousProgramModel {

	private double result;
	private int floor;

	// 구구단 연산 메소드
	public int[] run(int number) { // 구구단을 연산하여 배열에 담음
		int[] result = new int[9];
		for (int i = 0; i < 9; i++) {
			result[i] = number * (i + 1);
		}
		return result;
	}


	// 계산기 연산 메소드
	public void add(double num1, double num2) {
		result = num1 + num2;
	}

	public void subtract(double num1, double num2) {
		result = num1 - num2;
	}

	public void multiply(double num1, double num2) {
		result = num1 * num2;
	}

	public void divide(double num1, double num2) {
		if (num2 != 0) {
			result = num1 / num2;
		} else {
			result = 0;
		}
	}

	public double getResult() {
		return result;
	}

	public void setResult() {
		result = 0;
	}


	// 피라미드 층수 리턴
	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getFloor() {
		return floor;
	}

}
