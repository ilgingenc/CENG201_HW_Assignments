package ceng201.hw;

public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    boolean isPriority;

    //constructor
    public TreatmentRequest(int patientId, boolean isPriority) {
        this.arrivalTime= System.currentTimeMillis();
        this.patientId = patientId;
        this.isPriority=isPriority;
    }

    public boolean isPriority() { //Is the patieent a priority or not?
        return isPriority;
    }
}
