package ceng201.hw;

public class PatientList {
    private Node head;
    private Node tail;
    private int patientCount = 0;

    private class Node {
        Patient data;
        Node next;


        Node(Patient data) { //Node constructor            this.data = data;
            this.data = data;
        }
    }

    //I added a variable to the end.
    public void addPatient(Patient p) {
        Node variable = new Node(p);
        patientCount++;
        if (head == null) {  //If the list empty runs here.
            head = variable;
            tail = variable;
            head.next = null;
            System.out.println("1. patient added.");

        } else { // If the list is not empty runs here.
            tail.next = variable;
            tail = variable;
            variable.next = null;
            System.out.println(patientCount + ". patient added.");
        }
    }

    public void removePatient(int id) { //Deletes the patient who was given the ID
        System.out.println(id + ". patient deleted");
        if (head == null) { //If the list is empty.
            System.out.println("The list is empty.");
            return;
        }

        if (head.next == null && head.data.id == id) { //If there is a just one variable.
            head = null;
            tail = null;
            System.out.println("The only element on the list has been deleted.");
            return;
        }


        if (head.next != null && head.data != null && head.data.id == id) { //If the patient to be deleted is at the top of the list.
            head = head.next;
            System.out.println("The element at the beginning has been deleted.");
            return;
        }

        Node temp = head;

        while (temp.next != null && head.data != null && temp.next.data.id != id) { //Found the node before the node to be deleted.
            temp = temp.next;
        }
        if (temp.next == null) { //If the ID cannot be found
            System.out.println("Searched id not found.");
            return;
        }
        temp.next = temp.next.next;

        if (temp.next == null) { //If the deleted node is the last node, the tail is updated.
            tail = temp;
            System.out.println("The element at the end has been deleted.");
        }
    }

    public Patient findPatient(int id) {//Finds the patient in the given ID.
        if (head == null) { //IF the list is empty runs here.
            System.out.println("The list is empty.");
            return null; // Id not found
        }
        Node temp = head;
        while (temp != null) { //The list is scanned from the first node to the last node.
            if (temp.data != null && temp.data.id == id) { //If the ID matches, the patient is found.
                System.out.println("Founded patient:" + temp.data.name);
                return temp.data;
            }
            temp = temp.next;
        }
        return null; //If the ID not matches,return null.
    }

    public void printList() { //Prints all patients on the list to the screen.
        System.out.println("List:");
        if (head == null) { // If the list is empty runs here.
            System.out.println("The list is empty:");

        } else { //The list is printed from start to finish.
            Node current = head;
            while (current != null && current.data != null) {
                System.out.println("Name:" + current.data.name + " ");
                current = current.next;
            }
        }
    }
}



