
import java.util.Scanner;

public class InputInt1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;	
		while(true) {
			i = sc.nextInt();
			if (i==0) break;
			System.out.printf("%d\n", i);
		} 
	}
}


