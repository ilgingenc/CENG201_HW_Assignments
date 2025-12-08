package ceng201.hw;

public class DischargeStack {
    private Node top;
    private int size;

    private class Node {

        DischargeRecord x;
        Node next;

        Node(DischargeRecord data) {
            this.x = data;
        }
    }
    public void push(DischargeRecord r) { //adding elements to top.
        Node node = new Node(r);//the object was created.
        node.next = top;
        top = node;
        System.out.println("Patient "+ r.patientId +"added to stack.");
    }
    }

