
public class DiceProbability {

	Dice dice = new Dice();
	Yut yut;
	int n;
	int diceSum=0;
	int yutSum=0;
	int[] diceCnt;
	int[] yutCnt;
	double[] diceProb;
	double[] yutProb;
	int result[];
	double yutSum_ = 0;
	String P;

	DiceProbability(int N, String P) {
		this.P = P;
		this.n = N;
		this.result = new int[this.n];
		this.yut = new Yut(P);
		this.yut.setPremium();
		this.diceCnt = new int[7];
		this.yutCnt = new int [6];

		for (int i=0; i<this.n; i++) {
			//System.out.printf("Entered %d rounds with %s\n", i+1, P); // (1).solution
			for (int j=0; j<10; j++) {
				dice.roll();
				yut.roll();
				diceSum += dice.getDiceNum();
				diceCnt[dice.getDiceNum()]++;
				yutSum += yut.getYutNum();
				yutCnt[yut.getYutNum()]++;
				//System.out.printf("[_%d]...rolled dice: %d yut: %d\n", j, dice.getDiceNum(), yut.getYutNum()); // (2).solution
			}
			if (yut.getYutPercent() > 1.0) yutSum_ = yutSum * yut.getYutPercent(); 
			else yutSum_ = yutSum;
			if (diceSum > yutSum_) result[i] = 0;
			else if (diceSum < yutSum_) result [i] = 2;
			else result[i] = 1;

			//System.out.printf("[_%d][SUM]...dice: %d yut: %d -> %.2f\n",  i, diceSum, yutSum, yutSum_); // (2).solution
			diceSum=0; yutSum=0; yutSum_=0;			
		}
	}

	void calcProbability() {
		if ((diceCnt == null) || (yutCnt == null)) return;
		this.diceProb = new double [7];
		this.yutProb = new double[6];

		for (int i=1; i<diceCnt.length; i++) {
			diceProb[i] = (double) diceCnt[i] / this.n;
		}
		for (int i=1; i<yutCnt.length; i++) {
			yutProb[i] = (double) yutCnt[i] / this.n;
		}
	}

	
	void printProbability() {
		for (int i=1; i<7; i++) {
			System.out.printf("Dice %d: %d Probability: %.3f\n", i, diceCnt[i], diceProb[i]); //(3). solution
		}

		for (int i=1; i<6; i++) {
			System.out.printf("Yut %d: %d Probability: %.3f\n", i, yutCnt[i], yutProb[i]); //(4). solution
		}
	}
	
	void printWinLoseOfDice() { // (5). solution
		int diceWin = 0; int yutWin = 0; int draw=0;
		System.out.printf("Total round: %d applying %s %.2f\n", this.n, this.P, yut.getYutPercent());
		for (int i=0; i<this.n; i++) {
			if (result[i] == 0) diceWin++;
			else if (result[i] == 1) draw++;
			else yutWin++;
		}
		System.out.printf("[WINLOSE] feqWin1: %d freqDraw: %d freqLose1: %d\n", diceWin, draw, yutWin); 
	}


	
}


