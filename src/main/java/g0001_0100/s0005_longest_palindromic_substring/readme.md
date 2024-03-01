5\. Longest Palindromic Substring

Medium

Given a string `s`, return _the longest palindromic substring_ in `s`.

**Example 1:**

**Input:** s = "babad"

**Output:** "bab" **Note:** "aba" is also a valid answer. 

**Example 2:**

**Input:** s = "cbbd"

**Output:** "bb" 

**Example 3:**

**Input:** s = "a"

**Output:** "a" 

**Example 4:**

**Input:** s = "ac"

**Output:** "a" 

**Constraints:**

*   `1 <= s.length <= 1000`
*   `s` consist of only digits and English letters.

To solve the Longest Palindromic Substring problem in Java using a `Solution` class, we'll follow these steps:

1. Define a `Solution` class with a method named `longestPalindrome`.
2. Initialize variables to keep track of the start and end indices of the longest palindromic substring found so far (`start` and `end`).
3. Iterate through the string `s`:
   - For each character in the string, expand around it to check if it forms a palindrome.
   - Handle both odd-length and even-length palindromes separately.
   - Update `start` and `end` indices if a longer palindrome is found.
4. Return the substring from `start` to `end`.
5. Handle edge cases where the input string is empty or has a length of 1.

Here's the implementation:

```java
public class Solution {
    
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String s1 = "babad";
        System.out.println("Example 1 Output: " + solution.longestPalindrome(s1));

        String s2 = "cbbd";
        System.out.println("Example 2 Output: " + solution.longestPalindrome(s2));

        String s3 = "a";
        System.out.println("Example 3 Output: " + solution.longestPalindrome(s3));

        String s4 = "ac";
        System.out.println("Example 4 Output: " + solution.longestPalindrome(s4));
    }
}
```

This implementation provides a solution to the Longest Palindromic Substring problem in Java.