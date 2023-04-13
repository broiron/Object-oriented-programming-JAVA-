import java.util.Scanner;

public class TestPrintNumInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintNumInRange pn = new PrintNumInRange(sc);
		
		pn.readInt();
		if(pn.isInRange(1, 100) == true) {
			pn.printInt();
		}
		else {
			System.out.printf("1~100 범위 밖 정수가 입력되었습니다\n");
		}
	}
}



