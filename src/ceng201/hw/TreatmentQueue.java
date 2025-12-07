package ceng201.hw;

public class TreatmentQueue {
    private Node front;
    private Node rear;
    private int size;


    private class Node {
        TreatmentRequest treatmentRequest;
        Node next;

        Node(TreatmentRequest data) {
            this.treatmentRequest = data;
        }
    }

    public void enqueue(TreatmentRequest request) {
        Node node = new Node(request);

        if (front == null) {
            front = node;
            rear = node;
            System.out.println("First patient added.");
            size++;
        } else { //I added patient at the end.
            node.next = null;
            rear.next = node;
            rear = node;
            size++;
        }
    }

    public TreatmentRequest dequeue() { //delete first patient
        if (front == null) {
            System.out.println("The list is empty.");
            return null;
        } else if (front.next == null) {
            TreatmentRequest current = front.treatmentRequest;
            front = null;
            rear = null;
            System.out.println("The only patient deleted.");
            size--;
            return current;
        } else {
            TreatmentRequest current = front.treatmentRequest;
            front = front.next;
            size--;
            return current;
        }

    }

    public int size() {
        return size;
    }

    public void print() {
        Node temp;
        temp=front;
        while (temp!=null){
            System.out.println(temp.treatmentRequest);
            temp= temp.next;
        }

    }
}
