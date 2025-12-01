import ceng201.hw.Patient;
import ceng201.hw.PatientList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PatientList patientList=new PatientList();
        Patient patient1=new Patient(1,"arda",2,20) ;
        Patient patient2=new Patient(2,"ılgın",1,20) ;
        Patient patient3=new Patient(3,"buket",1,30) ;
        patientList.addPatient(patient1);
        patientList.addPatient(patient2);
        patientList.addPatient(patient3);


        patientList.removePatient();
    }
}