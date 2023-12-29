package DataStructures.Trees.Heaps;

import java.util.ArrayList;
//Making the head data structure into generics type so that it can take up any value
class Heap<T extends Comparable<T>> {

    private ArrayList<T> list; //For storing the values

    public Heap() {//constructor to create a new object of type head
        list = new ArrayList<>();
    }

    //A function which swaps two given indexes values in the list
    private void swap(int first, int second) {
        T temp = list.get(first);//Get the first value
        list.set(first, list.get(second));//replace the first position with the second value
        list.set(second, temp);//replace the second position with the first value stored in temp
    }

    //This method returns the position of parent node for a given index.
    private int parent(int index) {
        return (index - 1) / 2;
    }

    //This method returns the position of the left child for a given node.
    private int left(int index) {
        return index * 2 + 1;
    }

    //This method returns the position of the right child for a given node.
    private int right(int index) {
        return index * 2 + 2;
    }


    //This method allows users to enter data into the heap.
    public void insert(T value) {
        list.add(value);
        upheap(list.size() - 1);
    }

    //This method checks from bottom to up way if the child is greater than parent if yes then swap(in case of max heap)
    //if the child is less than parent if yes then swap (in case of min heap)
    private void upheap(int index) {
        if(index == 0) {//Is it the root node or not?
            return;
        }
        int p = parent(index);//get the parent index.
        //compare the child value with the parent value if the compareTo() return a negative value means condition is false
        //therefore swap the parent and the child positions.
        if(list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            upheap(p);
        }
    }

    //A method which removes the top value from the heap.
    //It takes the last element from the list and makes it the new top then calls a down heap function.
    //This function compares the parent with the left and right child and which ever is greater(in case of max heap) is replaced.
    // which ever is lesser(in case of min heap) is replaced. Then it recursively calls down heap on the child which was swapped.
    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Removing from an empty heap!");
        }

        T temp = list.get(0);

        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }

        return temp;
    }

    //Down heap function compares the node of the heap top to bottom and replaces if any node does not statifies the condition.
    private void downheap(int index) {
        int min = index;
        int left = left(index);//get the left child position
        int right = right(index);//get the right child position

        //If left is suitable for replacement with the parent replace it.
        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }

        //If right is suitable to be replaced with the parent replace it.
        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }


        //check if the swapped child must not be equal to the index as in that case it will be swapped with itself
        if(min != index) {
            swap(min, index);//swap in other case
            downheap(min);//call the recursive call on the child position the parent was swapped with
        }
    }

    //A method which performs heap sort on a given heap.
    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while(!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }
}
