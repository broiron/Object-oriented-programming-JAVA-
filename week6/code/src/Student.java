
public class Student {
	String name;
	double gpa;
	int incomeLevel;

	Student(String name, double gpa, int incomeLevel) {
		this.name = name;
		this.gpa = gpa;
		this.incomeLevel = incomeLevel;
	}

	String getName() {
		return this.name;
	}

	double getGpa() {
		return this.gpa;
	}

	 int getIncomeLevel() {
		 return this.incomeLevel;
	 }

}

