package ceng201.hw;

public class TreatmentRequest {
    int patientId;
    long arrivalTime;

    //constructor
    public TreatmentRequest(int patientId) {
        this.arrivalTime= System.currentTimeMillis();
        this.patientId = patientId;
    }
}
