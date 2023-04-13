
public class FindString {
	public static void main(String[] args) {

		String[] arr = {"New York", "Beijing", "Seoul"};
		
		boolean found = false;
		int cnt = 0;		
		for (String city : arr) {
			if (city.equals("Seoul")) {
				found = true;
				System.out.printf("arr[%d]: %s\n", cnt, city);
				break;
			}
			cnt++;
		}
		if(found==false) System.out.printf("Can't Find Seoul!\n");
	}
}


