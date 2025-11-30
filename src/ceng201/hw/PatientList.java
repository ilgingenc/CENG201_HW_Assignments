package ceng201.hw;

public class PatientList {
    private Node head;
    private Node tail;

    private class Node {
        Patient data;
        Node next;

        Node(Patient data) {
            this.data = data;
        }
    }

    //I added a variable to the end.
    void addPatient(Patient p) {
        Node variable = new Node(p);
        if (head == null) {  //If the list empty runs here.
            head = variable;
            tail = variable;
            head.next = null;
            System.out.println("First variable added.");

        } else {
            tail.next = variable;
            tail = variable;
            variable.next = null;
        }
    }

    void removePatient(Patient p) {
        //delete the first variable
        if (head == null) {
            System.out.println("The list is empty.");
        } else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("I deleted the only variable on the list.");
        } else {
            head.next = head;
            System.out.println("I deleted first variable.");
        }

        //delete the middle
        //delete the end
        if (head == null) {
            System.out.println("The list is empty.");
        } else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("I deleted the only variable on the list.");
        } else {
            Node temp = head;
            while(temp.next!=tail){
                temp=temp.next;


            }

        }
    }
}


