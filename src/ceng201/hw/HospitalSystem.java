package ceng201.hw;

import java.util.ArrayList;
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
        patientMap.put(p.id, p);
    }

    public void addTreatmentRequest(TreatmentRequest request) {
        if (request.isPriority) {
            priorityQueue.enqueue(request);
        } else {
            normalQueue.enqueue(request);
        }
    }

    public Patient processTreatment() {
        TreatmentRequest request;
        if (priorityQueue.size() > 0) {
            request = priorityQueue.dequeue();

        } else if (normalQueue.size() > 0) {
            request = normalQueue.dequeue();
        } else {
            return null;
        }
        DischargeRecord dischargeRecord = new DischargeRecord(request.patientId);
        dischargeStack.push(dischargeRecord);
        return patientMap.get(request.patientId);
    }

    public void printSystemState() {
        System.out.println("Current patients in system.");
        patientList.printList();

        System.out.println("Priority treatment in queue:");
        priorityQueue.print();

        System.out.println("Normal treatment in queue");
        normalQueue.print();

        System.out.println("Discharge record:");
        dischargeStack.printStack();

    }
    public void printPatientSortedBySeverity(){
        ArrayList<Patient> patientListForSorting =new ArrayList<>(patientMap.values());
    }
}
