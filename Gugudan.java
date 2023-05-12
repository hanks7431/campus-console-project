import java.util.Scanner;

public class Gugudan {
	private int sum;
	private int a;
			
		public void gugudan() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("구구단을 계산할 단을 선택하세요");
			a = scanner.nextInt();
				
				try {
					while(a <= 0 || a >= 1000) {
						System.out.println("1 이상 999 이하의 자연수만 입력해주세요");
						a = scanner.nextInt();}
				} catch(NullPointerException e) {
					System.out.println("아무것도 입력되지 않았습니다");
				}
			for(int i=1; i<=9; i++) {
				sum = a*i;
				System.out.println(a+"*"+i+"="+sum);
				}
			scanner.close();
		}
		
		public static void main(String[] args) {
			Gugudan gu = new Gugudan();
			gu.gugudan();
			
	}
}
