package DataStructures.LinkedList.ProblemsOnLinkedList;


import DataStructures.LinkedList.SinglyLinkedList;

//Floyd's Tortoise and Hare Algorithm
public class CycleInList {
    //To find if a cycle is present or not
    public static boolean isCyclePresent(SinglyLinkedList.Node head){
        SinglyLinkedList.Node fast = head;
        SinglyLinkedList.Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow ){
                return true;
            }
        }
        return false;
    }

    //To calculate the length of the cycle present in the node
    public static int lengthOfCyclePresent(SinglyLinkedList.Node head){
        SinglyLinkedList.Node fast = head;
        SinglyLinkedList.Node slow = head;

        int length = 0;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow ){
                do{
                    slow = slow.next;
                    length++;
                }while(slow != fast);
            }
        }
        return length;
    }

    //Finding where the cycle is starting if present
    public static SinglyLinkedList.Node detectCycle(SinglyLinkedList.Node head) {
//        SinglyLinkedList.Node first = head;
//        SinglyLinkedList.Node second = head;
//
//        int length = lengthOfCyclePresent(head);
//
//        while(length > 0 ){
//            second = second.next;
//            length--;
//        }
//
//        while(first != second){
//            first = first.next;
//            second = second.next;
//        }
//        return second;
//        Alternate method

        SinglyLinkedList.Node fast = head;
        SinglyLinkedList.Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // return fast;
            }
        }
        return null;
    }
}
