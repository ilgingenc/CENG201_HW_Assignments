package ceng201.hw;

import java.util.HashMap;


public class HospitalSystem {
    public PatientList patientList;
    public TreatmentQueue priorityQueue;
    public TreatmentQueue normalQueue;
    public DischargeStack dischargeStack;
    public HashMap<Integer, Patient> patientMap;

    public HospitalSystem() {
        this.patientList = new PatientList();
        this.dischargeStack = new DischargeStack();
        this.normalQueue = new TreatmentQueue();
        this.priorityQueue = new TreatmentQueue();
        this.patientMap = new HashMap<>();
    }

    public void addNewPatient(Patient p) {
        patientList.addPatient(p);
        patientMap.put(p.id,p);
    }
    public void addTreatmentRequest(TreatmentRequest request){

    }
}
