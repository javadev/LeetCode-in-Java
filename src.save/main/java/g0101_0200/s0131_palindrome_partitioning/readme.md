131\. Palindrome Partitioning

Medium

Given a string `s`, partition `s` such that every substring of the partition is a **palindrome**. Return all possible palindrome partitioning of `s`.

A **palindrome** string is a string that reads the same backward as forward.

**Example 1:**

**Input:** s = "aab"

**Output:** [["a","a","b"],["aa","b"]] 

**Example 2:**

**Input:** s = "a"

**Output:** [["a"]] 

**Constraints:**

*   `1 <= s.length <= 16`
*   `s` contains only lowercase English letters.

To solve the "Palindrome Partitioning" problem in Java with a `Solution` class, we'll use backtracking. Below are the steps:

1. **Create a `Solution` class**: Define a class named `Solution` to encapsulate our solution methods.

2. **Create a `partition` method**: This method takes a string `s` as input and returns all possible palindrome partitioning of `s`.

3. **Define a recursive helper method**: Define a recursive helper method `backtrack` to find all possible palindrome partitions.
   - The method should take the current index `start`, the current partition `partition`, and the list to store all partitions `result`.
   - Base case: If `start` reaches the end of the string `s`, add the current partition to the result list and return.
   - Iterate from `start` to the end of the string:
     - Check if the substring from `start` to `i` is a palindrome.
     - If it is a palindrome, add the substring to the current partition and recursively call the `backtrack` method with the updated index and partition.
     - After the recursive call, remove the last substring added to the partition to backtrack and explore other partitions.

4. **Initialize a list to store all partitions**: Create an ArrayList named `result` to store all possible palindrome partitions.

5. **Call the helper method**: Call the `backtrack` method with the initial index, an empty partition list, and the result list.

6. **Return the result list**: After exploring all possible partitions, return the list containing all palindrome partitions.

Here's the Java implementation:

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }
    
    // Recursive helper method to find all possible palindrome partitions
    private void backtrack(String s, int start, List<String> partition, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(partition));
            return;
        }
        
        for (int i = start; i < s.length(); i++) {
            String substring = s.substring(start, i + 1);
            if (isPalindrome(substring)) {
                partition.add(substring);
                backtrack(s, i + 1, partition, result);
                partition.remove(partition.size() - 1); // Backtrack
            }
        }
    }
    
    // Helper method to check if a string is a palindrome
    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
```

This implementation follows the steps outlined above and efficiently finds all possible palindrome partitions of the given string in Java.