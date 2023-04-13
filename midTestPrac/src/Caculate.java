
import java.util.Calendar;

public class Caculate {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH);
        int date = today.get(Calendar.DATE);

		Calendar target = Calendar.getInstance();
		target.set(2038, 1, 1);
		
		long diffSec = (target.getTimeInMillis() - today.getTimeInMillis()) / 1000;
		long diffDays = diffSec / (24*60*60);
		// Consider leap year!
		int y = (int) (diffDays / 365);
		int d = (int) (diffDays%365);
		//System.out.println(diffSec);
		//System.out.println(diffDays);

		System.out.printf("%d years %d days left\n", y, d);


	}
}

