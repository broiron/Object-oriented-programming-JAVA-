
public class Yut {

    int YutNum;
	double Percent;
	String P;
	
	Yut() { }

    Yut(String P) {
	this.P = P;
	this.Percent = 1.0;
	}

    void roll() {
		this.YutNum = (int) Math.floor(Math.random()*5)+1;
    }
	
	void setPremium() {
		if (this.P.equals("PREMIUM")) {
			this.Percent = Premium.PREMIUM.getPercent(); 
		}
		else this.Percent = Premium.REGULAR.getPercent();
	}


	int getYutNum() {
		return this.YutNum;
	}

	double getYutPercent() {
		return this.Percent;
	}


}

