
public class YutRolling {
	
	Yut y1 = new Yut();
	Yut y2 = new Yut();
	Yut y3 = new Yut();
	Yut y4 = new Yut();
	Yut y5 = new Yut();
	Yut y6 = new Yut();
	Yut y7 = new Yut();
	Yut y8 = new Yut();
	Yut y9 = new Yut();
	Yut y10 = new Yut();

	Yut[] arr = {y1, y2, y3, y4, y5, y6, y7, y8, y9, y10};

	void rolling() {
		
		for (int i=0; i<10; i++) {
			while(true) {
				arr[i].roll();
				if ((arr[i].getYutNum()==4)) {
					System.out.printf("You got 4... Yut. Roll once again!!\n");
				}
				else if ((arr[i].getYutNum()==5)) {
					System.out.printf("You got 5... Mo. Roll once again!!\n");
				}
				else {
					System.out.printf("You got %d...", arr[i].getYutNum());
					break;
				}
			}
		}
		System.out.printf("\n");
	}
}

