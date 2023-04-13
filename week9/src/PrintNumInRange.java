
import java.util.Scanner;

public class PrintNumInRange {
	
	Scanner sc;
	int value;

	PrintNumInRange(Scanner sc) {
		this.sc = sc;
	} 

	void readInt() {
		System.out.print("Enter an integer: ");
		this.value = this.sc.nextInt();
	}
	
	boolean isInRange(int min, int max) {
		return ((value >= min) && (value <=max))?true:false;
	}

	void printInt() { System.out.println(value); }
}

		

