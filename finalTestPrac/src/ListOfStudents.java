import java.util.Collections;
import java.util.List;

public class ListOfStudents {
    private Student[] studentList = new Student[5];

    public ListOfStudents() {
        studentList[0] = new Student(201411111, "lim js", "출석", 100);
        studentList[1] = new Student(201811111, "kim js", "출석", 89);
        studentList[2] = new Student(201211111, "lee js", "출석", 65);
        studentList[3] = new Student(201511111, "choi js", "결석", 66);
        studentList[4] = new Student(201311111, "park js", "결석", 80);
    }

    public void printAttendedStudents() {
        for (Student student : studentList) {
            if(student.getAttend().equals("출석")) {
                System.out.println(student);
            }
        }
    }
    /*
    public void swap(Student s1, Student s2) {
        Student pwd = s1;
        s1 = s2;
        s2 = pwd;
    }
     */
    public void printSortedStudents() {
        for (int i=0; i<4; i++) {
            for (int j=i+1; j<5; j++) {
                if(studentList[i].getId() > studentList[j].getId()) {
                    Collections.swap(studentList[i], studentList[j]);
                }
            }
        }

        for (Student student : studentList) {
            System.out.println(student);
        }
    }

}