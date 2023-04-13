
import java.util.Scanner;

class homework4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = "Let's meet in my office at 10";
	
		System.out.println("다음 문장에서 문자열을 바꾸는 프로그램입니다.");
		System.out.printf("원본문장: %s\n", str);
		System.out.println("문장에서 바꾸고 싶은 문자열을 입력하세요 :");
		
		String fromStr = sc.nextLine();
		System.out.println("새로운 문자열을 입력하세요:");
		String ToStr = sc.nextLine();

		String str1 = str.substring(0, str.indexOf(fromStr));
		String str2 = str.substring(str.indexOf(fromStr)+fromStr.length(), str.length());

		String result = str1+ToStr+str2;

		System.out.printf("새로운 문장: %s\n", result);
	}
}

