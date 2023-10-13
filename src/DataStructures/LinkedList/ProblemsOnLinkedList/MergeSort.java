package DataStructures.LinkedList.ProblemsOnLinkedList;

import DataStructures.LinkedList.SinglyLinkedList;

public class MergeSort {
    public static SinglyLinkedList.Node getMid(SinglyLinkedList.Node head){
        SinglyLinkedList.Node midPrev = null;
        while(head != null && head.next != null){
            midPrev = (midPrev == null)?head: midPrev.next;
            head = head.next.next;
        }
        SinglyLinkedList.Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

//    Merge function where we are storing the merged list in a linked list
    public static SinglyLinkedList.Node merge(SinglyLinkedList.Node firstHead, SinglyLinkedList.Node secondHead){

        SinglyLinkedList.Node f = firstHead;
        SinglyLinkedList.Node s = secondHead;

        SinglyLinkedList ans = new SinglyLinkedList();

        while(f != null && s != null){

            if(f.value > s.value){
                ans.insertLast(s.value);
                s = s.next;
            }else{
                ans.insertLast(f.value);
                f = f.next;
            }
        }

        while(f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s != null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans.head;
    }

//    Merge function where we are just storing the position of head and tail of the linked list and not actually using a
//    linked list for merging the two list
    public static SinglyLinkedList.Node mergeTwo(SinglyLinkedList.Node left, SinglyLinkedList.Node right){
        SinglyLinkedList.Node dummyHead = null ;
        SinglyLinkedList.Node tail = dummyHead;
        while(left != null && right != null){
            if(left.value>right.value){
                tail.next = right;
                right = right.next;
                tail = tail.next;
            }else{
                tail.next = left;
                tail = tail.next;
                left = left.next;
            }
        }
        tail.next = (left != null)? left : right;
        return dummyHead.next;
    }

    public static SinglyLinkedList.Node mergeSort(SinglyLinkedList.Node head){
        if(head == null || head.next == null ){
            return head;
        }

        SinglyLinkedList.Node mid = getMid(head);

        SinglyLinkedList.Node left = mergeSort(head);
        SinglyLinkedList.Node right = mergeSort(mid);
        SinglyLinkedList.Node ans = merge(left,right);

        return ans;

    }
}
