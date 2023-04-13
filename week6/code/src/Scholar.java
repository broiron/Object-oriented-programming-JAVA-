
class Scholar {

	public static void main (String[] args) {
		Student s1 = new Student("김규상", 4.1, 3);
		Student s2 = new Student("김민재", 3.71, 5);
		Student s3 = new Student("김용하", 3.93, 7);

		Student [] students = {s1, s2, s3};
		for (int i=0; i<3; i++) {
			Student pwd = students[i];
			if ((pwd.getGpa() >= 3.5)&&(pwd.getIncomeLevel() <= 5)) {
				System.out.printf("Scholar Student # %d\n", i+1);
				System.out.printf("Name: %s, GPA: %.2f, IncomeLevel: %d\n", pwd.getName(), pwd.getGpa(), pwd.getIncomeLevel());
			}
		}
	}
}

