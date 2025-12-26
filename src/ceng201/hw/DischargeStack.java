package ceng201.hw;

public class DischargeStack {
    private Node top;


    private class Node {

        DischargeRecord x;
        Node next;

        Node(DischargeRecord data) {//constructor
            this.x = data;
        }
    }

    public void push(DischargeRecord r) { //adding elements to top.
        Node node = new Node(r);//the object was created.
        node.next = top;
        top = node;
        System.out.println("Patient " + r.patientId + " added to stack.");
    }

    public DischargeRecord pop() { //returns the element at the top of the stack
        if (top == null) {
            System.out.println("The stack is empty.");
            return null;

        }
        DischargeRecord deleted = top.x;
        top = top.next;
        System.out.println("Patient "+ deleted.patientId+" removed from stack.");
        return deleted;
    }

    public DischargeRecord peek() {//Displays the element at the top of the stack but does not delete it
        if (top == null) { //If the stack is empty runs here
            System.out.println("The stack is empty.");
            return null;
        }
        DischargeRecord first = top.x;
        return first;

    }

    public void printStack() {
        if (top == null) { //If the stack is empty, it gives feedback
            System.out.println("The stack is empty.");
            return;
        }
        System.out.println("Remaining discharge stack:");
        Node temp = top;
        while (temp!= null) { //All elements are printed
            System.out.println("Patient id: " + temp.x.patientId + " Patient Discharge Time: " + temp.x.dischargeTime);

            temp = temp.next;
        }
    }
}


