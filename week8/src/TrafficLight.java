

public class TrafficLight {
	/*
	enum Lights {
		RED(30, "RED"), GREEN(30, "GREEN"), AMBER(10, "AMBER");

		int time;
		String name;

		Lights(int time, String name) {
			this.time = time;
			this.name = name;
		}
		
		int getTime() {
			return this.time;
		}

		String getName() {
			return this.name;
		}
	}
	*/

	public static void main(String[] args) {
		for (Lights light : Lights.values()) {
			System.out.printf("%s duration: %d\n", light.getName(), light.getTime());
		}
	}
}


