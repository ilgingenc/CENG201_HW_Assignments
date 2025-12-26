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

    public void addNewPatient(Patient p) {//Adds new patients to the system
        patientList.addPatient(p);
        patientMap.put(p.id, p);
    }

    public void addTreatmentRequest(TreatmentRequest request) { //Adds to the order according to the patient's priority
        if (request.isPriority) { //Priority patients
            priorityQueue.enqueue(request);
        } else {
            normalQueue.enqueue(request);//Normal patients
        }
    }

    public Patient processTreatment() throws InterruptedException { //first, the priority takes the patient,then the normal patient
        TreatmentRequest request;
        if (priorityQueue.size() > 0) {
            request = priorityQueue.dequeue();
            System.out.println("Patient "+request.patientId+" removed from priority queue.");

        } else if (normalQueue.size() > 0) {
            request = normalQueue.dequeue();
            System.out.println("Patient "+request.patientId+ " removed from normal queue.");
        } else {
            return null;
        }
        Thread.sleep(200l);
        DischargeRecord dischargeRecord = new DischargeRecord(request.patientId, System.currentTimeMillis());
        dischargeStack.push(dischargeRecord);
        return patientMap.get(request.patientId);
    }

    public void printSystemState() { //Prints the current state of the system
        System.out.println("Current patients in system:");
        patientList.printList();


        System.out.println("Priority treatment in queue:");
        priorityQueue.print();
        System.out.println();

        System.out.println("Normal treatment in queue:");
        normalQueue.print();
        System.out.println();


        dischargeStack.printStack();

    }
    public void printPatientSortedBySeverity(){ //Bubble sort algorithm is used
        ArrayList<Patient> patientListForSorting =new ArrayList<>(patientMap.values());
        for (int i=0; i<patientListForSorting.size(); i++){ //bubble sort algorithm
            for (int j= 0 ;j<patientListForSorting.size()-1-i ;j++){
                if (patientListForSorting.get(j).severity<patientListForSorting.get(j+1).severity){
                    Patient temp = patientListForSorting.get(j);
                    patientListForSorting.set(j,patientListForSorting.get(j+1));
                    patientListForSorting.set(j+1,temp);
                }
            }
        }
        System.out.println("Patients sorted by severity:");
        for (Patient p: patientListForSorting){
            System.out.println(p);
        }
    }
}
