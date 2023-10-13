package DataStructures.LinkedList;

public class SinglyLinkedList {
    public Node head ;
    public Node tail;
    private int size;
    public SinglyLinkedList(){
        this.size = 0;
    }
     public class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
    public void insertRec(int index,int value){
        head = insertRec(index,value,head);
    }
    private Node insertRec(int index,int value,Node node){
        if(index==0){
            Node temp = new Node(value,node);
            size++;
            return temp;
        }
            node.next = insertRec(index-1, value, node.next);
        return node;
    }
    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        if(tail==null){
            tail = head;
        }
        size +=1;
    }
    public void insertLast(int data){
        if(tail==null){
            insertFirst(data);
            return;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        tail.next = null;
        size++;
    }
    public void insert(int data,int index){
        if(index==0){
            insertFirst(data);
            return;
        }
        if(index==size){
            insertLast(data);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp =  temp.next;
        }
        Node newNode = new Node(data,temp.next);
        temp.next = newNode;
        size++;
    }
    public int deleteFirst(){

        if(head == null){
            return -1;
        }

        int value = head.value;

        head = head.next;

        if(head==null){
            tail  = null;
        }

        size--;
        return value;
    }
    public int deleteLast(){

        if(size<=1){
            return deleteFirst();
        }

        Node prevNode = get(size-2);


        int val = tail.value;

        tail = prevNode;
        tail.next = null;
        size--;
        return val;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;

    }
    public Node get(int index){
        Node node = head;
        for(int i=1;i<=index;i++){
            node = node.next;
        }
        return node;
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
    public void deleteDuplicate(){
        Node currentNode = head;
        while(currentNode.next != null){
            if(currentNode.value == currentNode.next.value){
                currentNode.next = currentNode.next.next;
                size--;
            }else{
                currentNode = currentNode.next;
            }
        }
        tail = currentNode;
        tail.next = null;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void reverseList(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverseList(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void getMid(Node node){
        Node slow = node;
        Node fast = node;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.value);
    }
}
