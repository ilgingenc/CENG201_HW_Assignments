package ceng201.hw;

public class TreatmentQueue {
    private Node front;
    private Node rear;
    private int size;


    private class Node {
        TreatmentRequest treatmentRequest;
        Node next;

        Node(TreatmentRequest data) { //constructor
            this.treatmentRequest = data;
        }
    }

    public void enqueue(TreatmentRequest request) {
        Node node = new Node(request);

        if (front == null) { //If queue is empty.
            front = node;
            rear = node;
            System.out.println("First patient added. \nAdded pattient:"+ request.patientId);
            size++;
        } else { //I added patient at the end.
            node.next = null;
            rear.next = node;
            rear = node;
            size++;
            System.out.println("Added patient: " + request.patientId);
        }
    }

    public TreatmentRequest dequeue() { //delete first patient
        if (front == null) { //If the list is empty.
            System.out.println("The list is empty.");
            return null;
        } else if (front.next == null) { //If there is just one patient.
            TreatmentRequest current = front.treatmentRequest;
            front = null;
            rear = null;
            System.out.println("The only patient deleted.");
            size--;
            return current;
        } else { // If there are more than one element
            TreatmentRequest current = front.treatmentRequest;
            front = front.next;
            size--;
            System.out.println("Patient removed from queue: " + current.patientId);

            return current;

        }

    }

    public int size() {
        return size;
    }

    public void print() { //Prints all patient IDs in the queue.
        System.out.println("Queue:");
        Node temp;
        temp=front;
        while (temp!=null){
            System.out.print(temp.treatmentRequest.patientId + " ");
            temp= temp.next;
        }

    }
}
