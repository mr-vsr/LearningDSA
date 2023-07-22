package SearchingAlgorithms.ProblemsOnSearching;
//Finding the smallest element greater than the target character and the elements wrap around
// character array = ['a' , 'c' , 'j']
// target = 'z'
//output = 'a'  (no element is greater than 'z' therefore we return the first element)

public class SmallestLetter {
    public char Letter(char[] letters, char target) {
        int start = 0, end = letters.length - 1, mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
    
}
