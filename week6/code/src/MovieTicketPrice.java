
import java.util.Scanner;

public class MovieTicketPrice {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Select 1 from prime, standard, economy: ");
			String zone = sc.next();
			if (zone.compareTo("prime")==0) {
				System.out.println("Price of prime zone is 11000WON");
				break;
			}
			else if (zone.compareTo("standard")==0) {
				System.out.println("Price of standard zone is 10000");
				break;
					}
			else if (zone.compareTo("economy") == 0 ) {
				System.out.println("Price of economy zone is 9000");
				break;
					}
			else {
				System.out.println("Wrong Input! Please type again!");
			}

		}	
	}	
}



		
