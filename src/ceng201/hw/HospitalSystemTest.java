package ceng201.hw;

public class HospitalSystemTest {
    public static void main(String[] args) throws InterruptedException {
        HospitalSystem test = new HospitalSystem();
        Patient patient1 = new Patient(1, "Arda", 3, 20);
        Patient patient2 = new Patient(2, "Ilgın", 5, 21);
        Patient patient3 = new Patient(3, "Şenay", 7, 50);
        Patient patient4 = new Patient(4, "Bülent", 8, 49);
        Patient patient5 = new Patient(5, "Buket", 9, 28);
        Patient patient6 = new Patient(6, "Hakan", 2, 45);
        Patient patient7 = new Patient(7, "Azra", 6, 19);
        Patient patient8 = new Patient(8, "Ali", 1, 13);
        Patient patient9 = new Patient(9, "Ahmet", 4, 80);
        Patient patient10 = new Patient(10, "Eren", 10, 16);

        test.addNewPatient(patient1);
        test.addNewPatient(patient2);
        test.addNewPatient(patient3);
        test.addNewPatient(patient4);
        test.addNewPatient(patient5);
        test.addNewPatient(patient6);
        test.addNewPatient(patient7);
        test.addNewPatient(patient8);
        test.addNewPatient(patient9);
        test.addNewPatient(patient10);

        test.addTreatmentRequest(new TreatmentRequest(1, false));
        test.addTreatmentRequest(new TreatmentRequest(2, false));
        test.addTreatmentRequest(new TreatmentRequest(3, false));
        test.addTreatmentRequest(new TreatmentRequest(4, false));
        test.addTreatmentRequest(new TreatmentRequest(5, false));

        test.addTreatmentRequest(new TreatmentRequest(6, true));
        test.addTreatmentRequest(new TreatmentRequest(7, true));
        test.addTreatmentRequest(new TreatmentRequest(8, true));
        Thread.sleep(200l);
        test.dischargeStack.push(new DischargeRecord(9, System.currentTimeMillis()));
        Thread.sleep(200l);
        test.dischargeStack.push(new DischargeRecord(10, System.currentTimeMillis()));

        test.processTreatment();

        System.out.println("Final state");
        test.printSystemState();
    }
}
