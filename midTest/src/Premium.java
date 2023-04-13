

enum Premium {
	
	PREMIUM("PREMIUM", 1.2), REGULAR("REGULAR", 1.0);
	
	double percent;
	String type;

	Premium(String type, double percent) {
		this.type = type;
		this.percent = percent;
	}

	double getPercent() { return this.percent; }
	String getType() { return this.type; }

}

