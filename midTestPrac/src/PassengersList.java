
import java.util.Scanner;

public class PassengersList {

	Passenger p0 = new Passenger();
    Passenger p1 = new Passenger();
    Passenger p2 = new Passenger();
    Passenger p3 = new Passenger();
    Passenger p4 = new Passenger();
    Passenger p5 = new Passenger();
    Passenger p6 = new Passenger();
    Passenger p7 = new Passenger();
    Passenger p8 = new Passenger();
    Passenger p9 = new Passenger();
    Passenger p10 = new Passenger();
	
	Passenger[] arr = {p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
	
	PassengersList(String[] list) {
		
		for (int i=0; i<=10; i++) {
			Scanner sc = new Scanner(list[i]);
            String info = sc.next() + " " + sc.next() + " " + sc.next()+ " " + sc.next();
            arr[i].getInput(info);
			System.out.printf("...boarding %d %s transfer %d for %.2f\n", arr[i].getNumber(),
					arr[i].getTypeOfPassenger(), arr[i].getTransfer(), arr[i].getDistance());
		
		}	
	}
	Passenger[] getArr() {
		return this.arr;
	}
    void printPassenger() {
		int sum=0;
        System.out.printf("\nseq     type    n transfer distance travelled    fare\n");
        System.out.printf("----- ---------- ---------- ------------------ ---------\n");
        for (int i=0; i<=10; i++) {
			int fare = this.arr[i].computeFare(arr[i].getNumber(), arr[i].getTypeOfPassenger(), arr[i].getTransfer(), arr[i].getDistance());
            System.out.printf("%5d %10s %10d %18.2f ", this.arr[i].getNumber(), this.arr[i].getTypeOfPassenger(), this.arr[i].getTransfer(),
                   this.arr[i].getDistance());
			if (fare>=1000) {
				String str = Integer.toString(fare);
				String str1 = str.substring(0, 1);
				String str2 = str.substring(1);
				String str3 = str1+","+str2;
				System.out.printf("%4s won\n", str3);
			}
			else System.out.printf("%5d won\n", fare);
			sum+=fare;
        }

		System.out.printf("--------------------------------------------------------\n\n");
		if (sum>=1000) {
                String str = Integer.toString(sum);
                String str1 = str.substring(0, 1);
                String str2 = str.substring(1);
                String str3 = str1+","+str2;
                System.out.printf("%52s won\n", str3);
            }
        else System.out.printf("%53d won\n", sum);
    }
}

