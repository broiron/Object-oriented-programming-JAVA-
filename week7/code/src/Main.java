
import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("총 횟수: ");
		int N = sc.nextInt();
		Dice dice = new Dice();
		DiceProbability Dp = new DiceProbability(N, dice);

		Dp.calcProbability();
		Dp.printProbability();
	}
}


