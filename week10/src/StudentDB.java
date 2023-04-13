public class StudentDB {
    public enum FindGPAParam { LOWER_THAN, HIGHER_THAN; }
    Student[] StudentList;
    int cnt=0;
    StudentDB() {
        StudentList = new Student[3];
    }
    void add(Student s) {
        if (cnt < StudentList.length) {
            StudentList[cnt] = s;
            cnt++;
        }
        else {
            System.out.printf("학생 리스트에 자리가 없습니다.\n");
            return;
        }
    }
    void add(String name, int number, double GPA) {
        if (cnt < StudentList.length) {
            Student s = new Student(name, number, GPA);
            StudentList[cnt] = s;
            cnt++;
        }
        else {
            System.out.printf("학생 리스트에 자리가 없습니다.\n");
            return;
        }
    }
    Student findBy(String name) {
        for (int i=0; i < StudentList.length; i++) {
            if (StudentList[i].getName().equals(name)) return StudentList[i];
        }
        return null;
    }
    Student findBy(int number) {
        for (int i=0; i < StudentList.length; i++) {
            if (StudentList[i].getNumber() == number) return StudentList[i];
        }
        return null;
    }
    Student findBy(double GPA) {
        for (int i=0; i < StudentList.length; i++) {
            if (StudentList[i].getGPA() == GPA) return StudentList[i];
        }
        return null;
    }
    Student findBy(FindGPAParam param, double gpa) {
        if(param == FindGPAParam.LOWER_THAN) {
            for (int i=0; i < StudentList.length; i++) {
                if (StudentList[i].getGPA() < gpa) return StudentList[i];
            }
        }
        else {
            for (int i=0; i < StudentList.length; i++) {
                if (StudentList[i].getGPA() > gpa) return StudentList[i];
            }
        }
        return null;
    }
}