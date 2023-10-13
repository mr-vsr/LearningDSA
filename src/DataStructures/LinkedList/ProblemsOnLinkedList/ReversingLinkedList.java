package DataStructures.LinkedList.ProblemsOnLinkedList;

import DataStructures.LinkedList.SinglyLinkedList;

import javax.xml.crypto.dsig.SignedInfo;

public class ReversingLinkedList {

    public static SinglyLinkedList.Node reverseList(SinglyLinkedList.Node head) {
        SinglyLinkedList.Node previous = null;
        SinglyLinkedList.Node present = head;
        SinglyLinkedList.Node next = present.next;

        while(present != null){
            present.next = previous;
            previous = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        return previous;
    }
    //Reversing a part of the linked list
    public SinglyLinkedList.Node reverseBetween(SinglyLinkedList.Node head, int left, int right) {
        if(left==right){
            return head;
        }
        // skipping the first left-1 nodes
        SinglyLinkedList.Node current = head;
        SinglyLinkedList.Node prev = null;

        for(int i=0;current!=null && i<left-1;i++){
            prev = current;
            current = current.next;
        }
        SinglyLinkedList.Node last = prev;  //the node where the reversed sub list needs to be connected
        SinglyLinkedList.Node newEnd = current; //the node where the reversed sub list needs to be connected

        //Reversal of the sub list
        SinglyLinkedList.Node next = current.next;
        for(int i=0; current != null && i<right-left+1;i++){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }
        if(last != null){
            last.next = prev;
        }
        else{
            head=prev;
        }
        newEnd.next = current;
        return head;
    }

    //Checking if the given linked list is palindromic or not
    public static boolean isPalindrome(SinglyLinkedList.Node head) {
        SinglyLinkedList.Node mid = getMid(head);
        SinglyLinkedList.Node secondHead = reverseList(mid);
         while(head != null && secondHead != null){
             if(head.value != secondHead.value){
                 return false;
             }
             head = head.next;
             secondHead = secondHead.next;
         }
         return true;
    }
    public static SinglyLinkedList.Node getMid(SinglyLinkedList.Node head){
        SinglyLinkedList.Node slow = head;
        SinglyLinkedList.Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public SinglyLinkedList.Node reverseKGroup(SinglyLinkedList.Node head, int k) {
        if(k<=1 || head == null || head.next == null ){
            return head;
        }
        SinglyLinkedList.Node prev = null;
        SinglyLinkedList.Node current = head;

        while(true){
            SinglyLinkedList.Node last = prev;
            SinglyLinkedList.Node newEnd = current;

            SinglyLinkedList.Node next = current.next;
            for(int i=0;i<k && current != null ; i++){
                current.next = prev;
                prev = current;
                current = next;
                if(next != null){
                    next = next.next;
                }
            }
            if(last != null){
                last.next = prev;
            }
            else{
                head=prev;
            }
            newEnd.next = current;

            if(current == null) {
                break;
            }
        }
        return head;
    }
}
