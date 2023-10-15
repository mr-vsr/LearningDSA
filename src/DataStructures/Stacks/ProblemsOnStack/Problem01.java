package DataStructures.Stacks.ProblemsOnStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem01 {
        public static List<Integer> lastVisitedIntegers(List<String> words) {
            Stack<Integer> stack = new Stack<>();
            List<Integer> ans = new ArrayList<>();
            int size = 0;

            for (String word : words) {
                size++;
                if (word.equals("prev")) {
                    if (stack.isEmpty()) {
                        ans.add(-1);
                    } else {
                        ans.add(stack.pop());
                    }
                }else{
                        int num = Integer.parseInt(word);
                        stack.push(num);
                }
            }

            return ans;
        }


    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("1");
        words.add("prev");
        words.add("2");
        words.add("prev");
        words.add("prev");
        System.out.println(lastVisitedIntegers(words));
    }
}
