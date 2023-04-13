
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.printf("카드 이름을 입력하세요: ");
		
		String Card = sc.nextLine();
		
		CreditCard C = new CreditCard(Card);
		C.printCard();
	}
}

