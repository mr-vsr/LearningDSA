package DataStructures.LinkedList.ProblemsOnLinkedList;

//    Write an algorithm to determine if a number n is happy.
//
//    A happy number is a number defined by the following process:
//
//    Starting with any positive integer, replace the number by the sum of the squares of its digits.
//    Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//    Those numbers for which this process ends in 1 are happy.
public class HappyNumber {
        public boolean isHappy(int n) {
            int fast = n;
            int slow = n;

            do{
                slow = squareOfDigitsSum(slow);
                fast = squareOfDigitsSum(squareOfDigitsSum(fast));
                if(slow == 1){
                    return true;
                }
            }while(slow != fast);

            return false;
        }
        private int squareOfDigitsSum(int n){
            int ans = 0;
            while(n >0){
                int rem = n%10;
                ans += rem*rem;
                n /= 10;
            }
            return ans;
        }
}
