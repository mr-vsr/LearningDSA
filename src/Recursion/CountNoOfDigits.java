package Recursion;

public class CountNoOfDigits {
    // Using a static variable outside the function and then increasing and decreasing it
    private static int count = 0;
    public int getCount(){
        return this.count;
    }
    public void setCount(){
        this.count++;
    }
    public void countDigit(int n){
        if(n==0){
            return;
        }
        setCount();
        countDigit(n/10);
    }
}
