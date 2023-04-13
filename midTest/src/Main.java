
public class Main {
	public static void main(String[] args) {
		DiceProbability Dp = new DiceProbability(1000, "PREMIUM"); // (1), (2) solution
		Dp.calcProbability(); // (3), (4) solution
		Dp.printProbability(); // (3), (4) solution
		// Dp.printWinLoseOfDice(); // (5) solution
		
		YutRolling Yr = new YutRolling(); // (6) solution
		Yr.rolling();

	}
}


