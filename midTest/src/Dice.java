
public class Dice {

    int diceNum;

    Dice() { };

	void roll() {
        this.diceNum = (int) Math.floor(Math.random()*6)+1;
        }
    
	int getDiceNum() {
		return this.diceNum;
	}

}
