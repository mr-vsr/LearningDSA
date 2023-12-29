//You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order, and each of their nodes contains a single digit.
// Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
package DataStructures.LinkedList.ProblemsOnLinkedList;

public class sumOfNodes {
    //This is my first approach where I have used a helper function which is returning the root node of my new linked list.
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return helper(l1,l2,0);
    }
    //Inside helper function I am checking if both the linked list are null or not if yes then check if the carry is zero or not?
    //If it is zero means our linked list contains all the required nodes.
    //otherwise create a new node with the value carry and return it.
    //Then I am using sum variable to store the sum of the values of the two linked list.
    //I am creating a new node and storing the value of sum%10 to only get the ones place and pass the tens place as carry.
    //This node's next is the recursive call to the helper function with the next values of linked lists given.
    //Now I need to make sure the linked list are not empty so if condition to check it and if any of the linked list is empty before
    //other, then I am assigning another node with value 0 to it.
//    private ListNode helper(ListNode l1,ListNode l2,int carry){
//        if(l1 == null && l2 == null){
//            if(carry>0){
//                return new ListNode(carry);
//            }
//            else{
//                return null;
//            }
//        }
//        int sum = l1.val + l2.val + carry;
//
//        ListNode node = new ListNode(sum%10);
//
//        ListNode temp = new ListNode(0);
//        if(l1.next == null && l2.next != null){
//            l1.next = temp;
//        }
//        if(l2.next == null && l1.next != null){
//            l2.next = temp;
//        }
//
//        node.next = helper(l1.next,l2.next,sum/10);
//        return node;
//    }

    //Approach two => a better helper function than the first approach
    private ListNode helper(ListNode l1, ListNode l2, int carry){
        if(l1 == null && l2 == null){
            if(carry>0){
                return new ListNode(carry);
            }
            return null;
        }
        int sum = (l1 != null ? l1.val:0) + (l2 != null ? l2.val:0 ) + carry;
        ListNode node = new ListNode(sum%10);

        ListNode nextL1 = l1 != null ? l1.next : null;
        ListNode nextL2 = l2 != null ? l2.next : null;
        node.next = helper(nextL1, nextL2,sum/10);
        return node;
    }
}
