22\. Generate Parentheses

Medium

Given `n` pairs of parentheses, write a function to _generate all combinations of well-formed parentheses_.

**Example 1:**

**Input:** n = 3

**Output:** ["((()))","(()())","(())()","()(())","()()()"] 

**Example 2:**

**Input:** n = 1

**Output:** ["()"] 

**Constraints:**

*   `1 <= n <= 8`

To solve the "Generate Parentheses" problem in Java with a `Solution` class, we can use a backtracking approach. Here are the steps:

1. Define a `Solution` class.
2. Define a method named `generateParenthesis` that takes an integer `n` as input and returns a list of strings representing all combinations of well-formed parentheses.
3. Create an empty list to store the result.
4. Call the recursive helper function `generateParenthesisHelper` with the empty string `""`, counts of open and close parentheses set to `0`, the value of `n`, and the result list.
5. In the `generateParenthesisHelper` function:
   - If the length of the current string is equal to `2 * n`, add it to the result list.
   - If the count of open parentheses is less than `n`, append an open parenthesis to the current string and call the function recursively with increased open count.
   - If the count of close parentheses is less than the count of open parentheses, append a close parenthesis to the current string and call the function recursively with increased close count.
6. Return the result list.

Here's the implementation:

```java
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper("", 0, 0, n, result);
        return result;
    }

    private void generateParenthesisHelper(String current, int open, int close, int n, List<String> result) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            generateParenthesisHelper(current + "(", open + 1, close, n, result);
        }

        if (close < open) {
            generateParenthesisHelper(current + ")", open, close + 1, n, result);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int n1 = 3;
        System.out.println("Parentheses combinations for n = " + n1 + ":");
        System.out.println(solution.generateParenthesis(n1));

        int n2 = 1;
        System.out.println("\nParentheses combinations for n = " + n2 + ":");
        System.out.println(solution.generateParenthesis(n2));
    }
}
```

This implementation provides a solution to the "Generate Parentheses" problem in Java using a backtracking approach.