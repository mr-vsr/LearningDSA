package DataStructures.LinkedList;

public class DoublyLinkedList {

    private Node head;

    public void insertFirst(int value){
        Node newNode = new Node(value);

        newNode.next = head;
        newNode.prev = null;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
    }
    public void insertLast(int value){
        Node newNode = new Node(value);
        Node last = head;

        if(head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }

        while(last.next != null){
            last = last.next;
        }

        last.next  = newNode;
        newNode.prev = last;



    }
    public void insert(int after,int value){
            Node posi = find(after);

            if(posi == null){
                System.out.println("Doesn't exists!");
                return;
            }

            Node newNode  = new Node(value);

            newNode.prev = posi;

            if(posi.next != null){
                posi.next.prev = newNode;
                newNode.next = posi.next;
            }
            posi.next = newNode;

    }

    public int deleteFirst(){
        if(head == null){
            return -1;
        }

        int val = head.value;

        if(head.next != null){
            head = head.next;
            head.prev = null;
        }
        else{
            head = null;
        }

        return val;

    }
    public int deleteLast(){

        if(head==null){
            return -1;
        }

        Node last = head;

        while(last.next != null){
            last = last.next;
        }
        int val;

        if(last == head){
            val = head.value;
            head = null;
            return val;
        }

        val = last.value;
        last.prev.next = null;
        last.prev = null;

        return val;


    }
//    public int delete(){
//
//    }
    public Node find(int value){
        Node temp = head;
        while(temp.value!=value){
            temp = temp.next;
        }
        return temp;
    }
    public void display(){
        if(head == null){
            System.out.println("END");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void displayRev(){

        if(head == null){
            System.out.println("START");
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        while(temp != null){
            System.out.print(temp.value + " <- ");
            temp = temp.prev;
        }
        System.out.println("START");
    }
    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev = next;
        }
    }
}
