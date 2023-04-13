
public class DiceProbability {
	int n;
	int[] cnt;
	int[] nums;
	double[] probs;
	Dice dice = new Dice();

	DiceProbability(int N, Dice d) {
		this.n = N;
		this.dice = d;
		int num;
		nums = new int[this.n];
		cnt = new int[7];
		for (int i=0; i<this.n; i++) {
			num = dice.roll();
			cnt[num]++;
			nums[i] = num;
		}
	}

	void calcProbability() {

		if (nums==null) return;
		this.probs = new double[7];
		for (int i=1; i<cnt.length; i++) {
			probs[i] = (double) cnt[i] / this.n;
		}
	}

	void printProbability() {

		if (this.probs==null) return;
		for (int i=1; i<probs.length; i++) {
			System.out.printf("주사위 %d: %d 비율: %.3f\n", i, cnt[i], probs[i]);
		}
	}

	void init() {
		this.n = 0;
		for (int i=0; i<cnt.length; i++) cnt[i] = 0;
		for (int i=0; i<probs.length; i++) probs[i] = 0.0;
	}
}






	
