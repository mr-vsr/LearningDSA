package DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {

//-----------Singly Linked List-------------------------------------------------------------------------------------

        SinglyLinkedList newList = new SinglyLinkedList();
        newList.insertFirst(2);
        newList.insertFirst(3);
        newList.insertFirst(4);
        newList.insertFirst(5);


        newList.insertLast(6);
        newList.insert(7,2);

        newList.display();

        newList.deleteFirst();
        newList.deleteLast();
        newList.deleteFirst();
        newList.deleteLast();
        newList.deleteFirst();
        newList.deleteLast();

        newList.display();

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
