package DataStructures.LinkedList;

public class SL {
    public static void main(String[] args) {
        SinglyLinkedList newList = new SinglyLinkedList();
        newList.insertFirst(2);
        newList.insertFirst(3);
        newList.insertFirst(4);
        newList.insertFirst(5);

        newList.display();

        newList.insertLast(6);
        newList.insert(7,2);

        newList.display();

        System.out.println(newList.deleteFirst());

        newList.display();

        System.out.println(newList.deleteLast());

        newList.display();

        System.out.println(newList.delete(2));

        newList.display();
    }
}
