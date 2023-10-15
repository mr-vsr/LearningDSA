package DataStructures.Queues;

import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {
//        QueueUsingStackInsertion queue = new QueueUsingStackInsertion();
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//        queue.insert(4);
//        queue.insert(5);
//        queue.display();
//        System.out.println(queue.delete());
//        System.out.println(queue.delete());
//        queue.display();

        QueueUsingStackDeletion queue = new QueueUsingStackDeletion();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.display();
        System.out.println(queue.delete());
        System.out.println(queue.delete());
        queue.display();
    }
}
//This is implementation of queue using two stack where insertion is in constant time and deletion is in O(n)
class QueueUsingStackInsertion{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackInsertion(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void insert(int val){
        first.push(val);
    }
    public int delete(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int deleted = second.pop();

        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return deleted;
    }
    public boolean IsEmpty(){
        return first.isEmpty();
    }

    public void display() {
        System.out.println(first);
    }
}

//This is implementation of queue using two stack where deletion is in constant time and insertion is in O(n)
class QueueUsingStackDeletion{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackDeletion(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public int delete(){
        return second.pop();
    }
    public void insert(int val){
        while(!second.isEmpty()){
            first.push(second.pop());
        }

        first.push(val);

        while(!first.isEmpty()){
            second.push(first.pop());
        }
    }
    public boolean IsEmpty(){
        return first.isEmpty();
    }

    public void display() {
        System.out.println(second);
    }
}