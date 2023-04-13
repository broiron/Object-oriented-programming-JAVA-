
enum Charge {
	
	ADULT("ADULT", 1200), STUDENT("YOUTH", 720), CHILD("CHILD", 450);

	int charge;
	String type;

	Charge(String type, int charge) {
		this.type = type;
		this.charge = charge;
	}

	int getCharge() { return this.charge; }
	String getType() { return this.type; }

}
