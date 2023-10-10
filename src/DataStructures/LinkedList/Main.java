package DataStructures.LinkedList;

import DataStructures.LinkedList.ProblemsOnLinkedList.CycleInList;
import DataStructures.LinkedList.ProblemsOnLinkedList.MergingLists;

public class Main {
    public static void main(String[] args) {

//-----------Singly Linked List-------------------------------------------------------------------------------------

//        SinglyLinkedList newList = new SinglyLinkedList();
//        newList.insertLast(1);
//        newList.insertLast(1);
//        newList.insertLast(4);
//        newList.insertLast(5);
//
//        newList.display();



        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.insertLast(1);
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(3);

        list1.display();

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.insertLast(4);
        list2.insertLast(5);
        list2.insertLast(6);

        list2.display();

        SinglyLinkedList ans = MergingLists.merge(list1,list2);
        ans.display();

        System.out.println(CycleInList.isCyclePresent(list1.head));

        System.out.println(CycleInList.detectCycle(list2.head));

//-----------Doubly Linked List---------------------------------------------------------------------------------------------------

//        DoublyLinkedList list = new DoublyLinkedList();
//        list.insertFirst(4);
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(1);
//
//        list.insertLast(5);
//        list.insertLast(6);
//
//
//        list.insert(6,7);
//
//        list.deleteFirst();
//        list.deleteLast();
//        list.deleteLast();
//        list.deleteLast();
//        list.deleteLast();
//        list.deleteLast();
//        list.deleteLast();
//        list.deleteLast();
//
//        list.display();
//        list.displayRev();
//
//        list.insertLast(1);
//        list.insertFirst(2);
//        list.insert(2,3);
//
//        list.display();
//        list.displayRev();

//-----------Circular Linked List-----------------------------------------------------------------------------------

//        CircularLinkedList list = new CircularLinkedList();
//        list.insert(1);
//        list.insert(2);
//        list.insert(3);
//        list.insert(4);
//        list.insert(5);
//
//        list.display();
//
//        list.delete(4);
//        list.display();



    }

}
