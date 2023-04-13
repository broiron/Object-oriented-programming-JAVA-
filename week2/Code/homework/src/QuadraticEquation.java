
import java.util.Scanner;
class QuadraticEquation{
	public static void main(String[] args) {
		
		// Scanner를 통해 입력 받기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double pwd;
		System.out.printf("a:%d, b:%d, c:%d\n", a, b, c);

		// Math.pow(), Math.sqrt() 이용

		double result1, result2;
		result1 = -b+Math.sqrt(Math.pow(b, 2)-4*a*c);
		result1 = result1/2*a;

		result2 = -b-Math.sqrt(Math.pow(b, 2)-4*a*c);
		result2 = result2/2*a;

		if ((Math.pow(b, 2)-4*a*c)==0){
			System.out.printf("Multiple root, Result: %.1f\n", result1);
		}
		else{
			System.out.printf("result1: %.1f, result2: %.1f\n", result1, result2);
		}
	}
}

