import java.util.InputMismatchException;
import java.util.Scanner;

public class GugudanController {
    private GugudanModel model;
    private GugudanView view;
    

    public GugudanController(GugudanModel model, GugudanView view) {
        this.model = model;
        this.view = view;
        
    }

    public void gugudan() {
    	Scanner scanner = new Scanner(System.in);
        boolean isValidInput = false;
         
        while (!isValidInput) {
            try {
                System.out.print("구구단을 출력할 숫자를 입력하세요 (1~999): ");
                int number = scanner.nextInt();

                if (number >= 1 && number <= 999) {
                    int[] result = model.run(number);
                    view.showResult(result);
                    isValidInput = true;
                } else {
                    throw new IllegalArgumentException("입력값이 유효한 범위를 벗어났습니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요");
                scanner.nextLine(); 
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }scanner.close();
    }
}
