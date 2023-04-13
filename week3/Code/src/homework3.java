
import java.util.Scanner;

class homework3{
	public static void main(String[] args) {
		int[] arr = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 다섯 개를 한줄에 한개씩 입력하세요");
		for (int i=0; i<5; i++){
			char ch = sc.next().charAt(0);
			arr[i] = ch;
		}
		
		double sum =0;

		for (int i=0; i<arr.length; i++){
			sum +=arr[i]*Math.pow(31, 4-i);
		}

		System.out.printf("문자열 %c%c%c%c%c의 해시값은 %.2f입니다.\n", arr[0], arr[1], arr[2], arr[3], arr[4], sum);

	}
}

