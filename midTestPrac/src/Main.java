
public class Main {

	public static void main(String[] args) {
	    String[] list = {"0 Adult 0 12.5km", "1 youth 0 9.0km", "2 Child 0 9.0km",
            "3 Transfer 1 13.0km", "4 child 0 14.2km", "5 Transfer 4 55.5km", "6 adult 0 18.0km",
            "7 youth 0 11.2km", "8 transfer 3 20.0km", "9 transfer 4 56.0km", "10 transfer 2 32.3km"};
		
		PassengersList List = new PassengersList(list);
		List.printPassenger();

	}
}


