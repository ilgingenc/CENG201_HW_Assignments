package ceng201.hw;

public class DischargeRecord {
    int patientId;
    long dischargeTime;

    public DischargeRecord(int patientId){
        this.dischargeTime=System.currentTimeMillis();
        this.patientId=patientId;
}}
