package ceng201.hw;

public class DischargeStack {
    private Node top;


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
        System.out.println("Patient " + r.patientId + "added to stack.");
    }

    public DischargeRecord pop() {
        if (top == null) {
            System.out.println("The stack is empty.");
            return null;

        }
        DischargeRecord deleted = top.x;
        top = top.next;
        return deleted;
    }

    public DischargeRecord peek() {
        if (top == null) {
            System.out.println("The stack is empty.");
            return null;
        }
        DischargeRecord first = top.x;
        return first;

    }

    public void printStack() {
        if (top == null) {
            System.out.println("The stack is empty.");
            return;
        }
        Node temp = top;
        while (temp!= null) {
            System.out.println("Patient id: " + temp.x.patientId + " Patient Discharge Time: " + temp.x.dischargeTime);

            temp = temp.next;
        }
    }
}


