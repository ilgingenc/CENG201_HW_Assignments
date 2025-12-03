package ceng201.hw;

import java.sql.SQLOutput;

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
    public void addPatient(Patient p) {
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

    public void removePatient(int id) {

        if (head == null) { //If the list empty.
            System.out.println("The list is empty.");
            return;
        }

        if (head.next == null && head.data.id == id) { //If there is a just one variable.
            head = null;
            tail = null;
            System.out.println("The only element on the list has been deleted.");
            return;
        }
        if (head.next != null && head.data.id == id) {
            head = head.next;
            System.out.println("The element at the beginning has been deleted.");
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data.id != id) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Searched id not found.");
            return;
        }
        temp.next=temp.next.next;

       if( temp.next == null) {
           tail = temp;
           System.out.println("The element at the end has been deleted.");
       }
    }
}



