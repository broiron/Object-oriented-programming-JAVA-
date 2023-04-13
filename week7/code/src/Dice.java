
public class Dice {

	int diceNum;

	Dice() { };
	
	public int roll() {
		this.diceNum = (int) Math.floor(Math.random()*6)+1;
		if ((this.diceNum>0)&&(this.diceNum<7)){
			return this.diceNum;
		}
		else return -1;
	}
}

