package ceng201.hw;

public class TreatmentQueue {
    private Node head;
    private Node tail;

    private class Node {
        TreatmentRequest data;
        Node next;

        Node(TreatmentRequest data) {
            this.data = data;
        }
    }

    public void enqueue(TreatmentRequest request) {
        Node node = new Node(request);

        if (head==null){
            head=node;
            tail=node;
            System.out.println("First patient added.");
        }
        else{

        }
    }
}
