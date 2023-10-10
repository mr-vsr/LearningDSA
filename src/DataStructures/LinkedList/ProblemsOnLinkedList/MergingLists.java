package DataStructures.LinkedList.ProblemsOnLinkedList;

import DataStructures.LinkedList.SinglyLinkedList;

public class MergingLists {
    public static SinglyLinkedList merge(SinglyLinkedList first, SinglyLinkedList second){
        SinglyLinkedList.Node f = first.head;
        SinglyLinkedList.Node s = second.head;

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
        return ans;
    }
}
