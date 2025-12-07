package ceng201.hw;

public class TestTreatmentQueue {
    public static void main(String[] args) {
        TreatmentQueue q = new TreatmentQueue();
        TreatmentRequest request1 = new TreatmentRequest(1);
        TreatmentRequest request2 = new TreatmentRequest(2);
        TreatmentRequest request3 = new TreatmentRequest(3);
        TreatmentRequest request4 = new TreatmentRequest(4);
        TreatmentRequest request5 = new TreatmentRequest(5);
        TreatmentRequest request6 = new TreatmentRequest(6);
        TreatmentRequest request7 = new TreatmentRequest(7);
        TreatmentRequest request8 = new TreatmentRequest(8);

        q.enqueue(request1);
        q.enqueue(request2);
        q.enqueue(request3);
        q.enqueue(request4);
        q.enqueue(request5);
        q.enqueue(request6);
        q.enqueue(request7);
        q.enqueue(request8);

        q.dequeue();
        q.dequeue();
        q.dequeue();

        q.print();

    }
}
