
public class CreditCard {
	
	public enum Card {
		CJONE_SAMSUNG(30, 1, "CJONE_SAMSUNG"), CJONE_SHINHAN(30, 1, "CJONE_SHINHAN"), 
		THE_CJ(20, 2, "THE_CJ"), SAMSUNG_6_V4(20, 0, "SAMSUNG_6_V4"), 
		SHINHAN_LADY(20, 0, "SHINHAN_LADY"), KB_STAR(20, 0, "KB_STAR"), EMART_KB(15, 0, "EMART_KB");

		int discount, accumulate;
		String name;

		Card(int discount, int accumulate, String name) {
			this.discount = discount;
			this.accumulate = accumulate;
			this.name = name;
		}

		int getDiscount() { return this.discount; }
		int getAccumulate() { return this.accumulate; }
		String getName() { return this.name; }

	}

	int discount, accumulate;
	String Name;

	CreditCard(String name) {

		String[] Words = name.split(" ");
		
		switch(Words[0]) {
			case "The" :
				this.discount = Card.THE_CJ.getDiscount();
				this.accumulate = Card.THE_CJ.getAccumulate();
				this.Name = Card.THE_CJ.getName();
				break;
			case "삼성" :
				this.discount = Card.SAMSUNG_6_V4.getDiscount();
				this.accumulate = Card.SAMSUNG_6_V4.getAccumulate();
				this.Name = Card.SAMSUNG_6_V4.getName();
				break;
			case "신한" :
				this.discount = Card.SHINHAN_LADY.getDiscount();
				this.accumulate = Card.SHINHAN_LADY.getAccumulate();
				this.Name = Card.SHINHAN_LADY.getName();
				break;
			case "KB" :
				this.discount = Card.KB_STAR.getDiscount();
				this.accumulate = Card.KB_STAR.getAccumulate();
				this.Name = Card.KB_STAR.getName();
				break;
			case "이마트" :
				this.discount = Card.EMART_KB.getDiscount();
				this.accumulate = Card.EMART_KB.getAccumulate();
				this.Name = Card.EMART_KB.getName();
				break;
			default :
				 if (Words[2].equals("삼성")) {
					this.discount = Card.CJONE_SAMSUNG.getDiscount();
					this.accumulate = Card.CJONE_SAMSUNG.getAccumulate();
					this.Name = Card.CJONE_SAMSUNG.getName();
				 }
				else {
					this.discount = Card.CJONE_SHINHAN.getDiscount();
					this.accumulate = Card.CJONE_SHINHAN.getAccumulate();
					this.Name = Card.CJONE_SHINHAN.getName();
				}
				break;
		}	
	}

	int getDiscount() { return this.discount; }
	int getAccumulate() { return this.accumulate; }
	String getName() { return this.Name; }
	void printCard() {
		System.out.printf("할인률: %d, 적립률: %d\n", getDiscount(), getAccumulate());
	}
}














