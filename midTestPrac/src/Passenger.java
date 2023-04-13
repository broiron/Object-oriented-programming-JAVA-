
public class Passenger {
	
	int number;
	String typeOfPassenger;
	int transfer;
	float distance;
	
	Passenger() { }
	Passenger(int number, String typeOfPassenger, int transfer, float distance) {
		this.number = number;
		this.typeOfPassenger = typeOfPassenger;
		this.transfer = transfer;
		this.distance = distance;
	}
	void getInput(String P) {
		String[] arr = P.split(" ",4);
		this.number = Integer.parseInt(arr[0]);
		this.typeOfPassenger = arr[1].toUpperCase();
		this.transfer = Integer.parseInt(arr[2]);
		String dis = arr[3].substring(0,arr[3].indexOf("km"));
		this.distance = Float.parseFloat(dis);
	}


	int getNumber() {return this.number;}
	String getTypeOfPassenger() {return this.typeOfPassenger;}
	int getTransfer() {return this.transfer;}
	float getDistance() {return this.distance;}
    
	int computeFare(int seq, String type, int nTransfer, float distanceTraveled) {

		Charge adult = Charge.ADULT;
        Charge student = Charge.STUDENT;
        Charge child = Charge.CHILD;
        int charge=0;

        if (nTransfer == 0) {
            if (type.equals(adult.getType())) charge = adult.charge;
            else if (type.equals(student.getType())) charge = student.charge;
            else charge = child.charge;
        }

        else if ((nTransfer < 5)&&(nTransfer > 0)) {
            if (distanceTraveled > 10.0) {
                charge += (int) ((distanceTraveled - 10.0) / 5)*100;
            }
        }
        else {
            if (type.equals(adult.getType())) charge = adult.charge;
            else if (type.equals(student.getType())) charge = student.charge;
            else charge = child.charge;
        }

        return charge;
    }
}


