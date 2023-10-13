package DataStructures.LinkedList.ProblemsOnLinkedList;

import DataStructures.LinkedList.SinglyLinkedList;

public class RotatingLinkedList {
    public SinglyLinkedList.Node rotateRight(SinglyLinkedList.Node head, int k) {
        if( k<=0 || head == null || head.next == null){
            return head;
        }

        SinglyLinkedList.Node tail = head;
        int length = 1;

        while(tail.next != null ){
            tail = tail.next;
            length++;
        }

        tail.next = head; // established a circular connection between the head and tail node

        int rotations = k % length; // Used circular counting to prevent redundant calculations
        int skip = length - rotations; // To find the position of the new Last Node

        SinglyLinkedList.Node newTail = head; //To find the new tail

        for(int i=0; i < skip-1; i++){
            newTail =newTail.next;
        }
        head = newTail.next;
        newTail.next = null;
        return head;
    }
}
