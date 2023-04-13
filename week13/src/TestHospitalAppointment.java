import java.time.LocalDateTime;

import com.oop._2022.Doctor;
import com.oop._2022.HospitalAppointment;
import com.oop._2022.Patient;

public class TestHospitalAppointment {
    public static void main(String[] args) {
        Doctor d = new Doctor(10, "Dr, Lim");
        Patient p = new Patient("cho");

        LocalDateTime d1 = LocalDateTime.of(2022, 5, 20, 13, 30, 0);
        LocalDateTime d2 = LocalDateTime.of(2020, 6, 20, 13, 30, 0);
        LocalDateTime d3 = LocalDateTime.of(2020, 7, 20, 13, 30, 0);

        HospitalAppointment[] has = new HospitalAppointment[3];

        has[0] = new HospitalAppointment(d, p, d1);
        has[1] = new HospitalAppointment(d, p, d2);
        has[2] = new HospitalAppointment(d, p, d3);

        for (HospitalAppointment apnt : has) {
            System.out.println(apnt);
        }

    }
}