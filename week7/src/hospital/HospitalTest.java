package hospital;

//Driver class
public class HospitalTest {
 public static void main(String[] args) {
     Doctor doc = new Doctor(1, "Dr. Aman");
     Nurse nurse = new Nurse(2, "Aman");
     Receptionist receptionist = new Receptionist(3, "digant");
     Cleaner cleaner = new Cleaner(4, "biswas");

     doc.diagnose();
     nurse.assist();
     receptionist.answerCalls();
     cleaner.clean();
 }
}


