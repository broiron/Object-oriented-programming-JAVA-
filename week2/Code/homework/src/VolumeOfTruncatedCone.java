
import java.util.Scanner;

class VolumeOfTruncatedCone{
	final static double PI = 3.14;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double r1, r2, height;
		r1 = sc.nextDouble();
		r2 = sc.nextDouble();
		height = sc.nextDouble();

		double volume;
		volume = Math.pow(r1, 2) + r1*r2 + Math.pow(r2, 2);
		volume = volume*height*PI/3;

		System.out.printf("Volume of TruncatedCone is: %.1f\n", volume);
	}
}


			
