
class CardDeck {
	String[] deck = new String[3];
	String shape;
	int length;
	int start;
	CardDeck() {
		int num, i;
		for (i=0; i<3; i++){
			num	= (int) Math.floor(Math.random()*9) + 2;
			deck[i] = Integer.toString(num);
		}
		this.length = 3;
		this.start = 0;
		this.shape = "Diamond";
		System.out.println("Card Deck Created");
	}

	public void deal() {
		String str;
		str = deck[this.start];
		deck[this.start] = null;
		this.length--;
		System.out.printf("Shape: %s, Number = %s\n", this.shape, str);
		this.start = this.start+1;
	}
}

class card {
	public static void main(String[] args) {
		CardDeck cd1 = new CardDeck();
		System.out.printf("%d Card left\n", cd1.length);
		cd1.deal();
		System.out.printf("%d Card left\n", cd1.length);
		cd1.deal();
		System.out.printf("%d Card left\n", cd1.length);
	}
}

