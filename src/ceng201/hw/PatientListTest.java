package ceng201.hw;

public class PatientListTest {
    public static void main(String[] args) {
        PatientList list = new PatientList();

        Patient patient1 = new Patient(1, "Ilgın", 5, 21);
        Patient patient2 = new Patient(2, "Arda", 1, 19);
        Patient patient3 = new Patient(3, "Buket", 8, 30);
        Patient patient4 = new Patient(4, "Bülent", 2, 50);
        Patient patient5 = new Patient(5, "Şenay", 9, 49);
        list.addPatient(patient1);
        list.addPatient(patient2);
        list.addPatient(patient3);
        list.addPatient(patient4);
        list.addPatient(patient5);
        list.removePatient(4);
        list.findPatient(2);
        list.printList();
    }
}
