package DataStructures.LinkedList.ProblemsOnLinkedList;

import DataStructures.LinkedList.SinglyLinkedList;

public class ReOrderingLinkedList {

    public void reorderList(SinglyLinkedList.Node head) {
        if(head == null || head.next == null){
            return;
        }
        SinglyLinkedList.Node mid = ReversingLinkedList.getMid(head);
        SinglyLinkedList.Node hs = ReversingLinkedList.reverseList(mid);
        SinglyLinkedList.Node hf = head;

//        reordering the linked list
        while(hf != null && hs != null){

            SinglyLinkedList.Node temp = hf.next;  //Reordering the first half of the linked list and moving it forward
            hf.next = hs;
            hf = temp;

            temp = hs.next; //ReOrdering the second half of the linked list and moving it forward
            hs.next = hf;
            hs = temp;
        }
        if(hf != null){
            hf.next = null;
        }
    }
}
