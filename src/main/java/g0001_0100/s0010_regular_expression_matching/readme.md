10\. Regular Expression Matching

Hard

Given an input string `s` and a pattern `p`, implement regular expression matching with support for `'.'` and `'*'` where:

*   `'.'` Matches any single character.
*   `'*'` Matches zero or more of the preceding element.

The matching should cover the **entire** input string (not partial).

**Example 1:**

**Input:** s = "aa", p = "a"

**Output:** false

**Explanation:** "a" does not match the entire string "aa". 

**Example 2:**

**Input:** s = "aa", p = "a\*"

**Output:** true

**Explanation:** '\*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa". 

**Example 3:**

**Input:** s = "ab", p = ".\*"

**Output:** true

**Explanation:** ".\*" means "zero or more (\*) of any character (.)". 

**Example 4:**

**Input:** s = "aab", p = "c\*a\*b"

**Output:** true

**Explanation:** c can be repeated 0 times, a can be repeated 1 time. Therefore, it matches "aab". 

**Example 5:**

**Input:** s = "mississippi", p = "mis\*is\*p\*."

**Output:** false 

**Constraints:**

*   `1 <= s.length <= 20`
*   `1 <= p.length <= 30`
*   `s` contains only lowercase English letters.
*   `p` contains only lowercase English letters, `'.'`, and `'*'`.
*   It is guaranteed for each appearance of the character `'*'`, there will be a previous valid character to match.

To solve the Regular Expression Matching problem in Java using a `Solution` class, we'll follow these steps:

1. Define a `Solution` class with a method named `isMatch`.
2. Implement a recursive approach to check for pattern matching.
3. Base cases:
   - If the pattern string is empty, return `s.isEmpty()`.
   - If the pattern string's length is 1 or the next character after `*` is `.`:
     - Check if the length of `s` is 1 and the characters match or the pattern is `.`.
     - If so, return `true`; otherwise, return `false`.
4. If the second character of the pattern is not `*`, recursively call `isMatch` with the substring starting from the second character.
5. If the second character of the pattern is `*`, recursively check all possibilities:
   - Zero occurrences of the preceding character (skipping `*` and the character before it).
   - One or more occurrences of the preceding character (matching the first character and recursively calling `isMatch` for the remaining part of the string).
6. Return the result of the recursive checks.
7. Handle edge cases where the input strings are empty or the pattern contains invalid characters.

Here's the implementation:

```java
public class Solution {

    public boolean isMatch(String s, String p) {
        if (p.isEmpty())
            return s.isEmpty();

        boolean firstMatch = !s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.');

        if (p.length() >= 2 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p));
        } else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String s1 = "aa";
        String p1 = "a";
        System.out.println("Example 1 Output: " + solution.isMatch(s1, p1));

        String s2 = "aa";
        String p2 = "a*";
        System.out.println("Example 2 Output: " + solution.isMatch(s2, p2));

        String s3 = "ab";
        String p3 = ".*";
        System.out.println("Example 3 Output: " + solution.isMatch(s3, p3));

        String s4 = "aab";
        String p4 = "c*a*b";
        System.out.println("Example 4 Output: " + solution.isMatch(s4, p4));

        String s5 = "mississippi";
        String p5 = "mis*is*p*.";
        System.out.println("Example 5 Output: " + solution.isMatch(s5, p5));
    }
}
```

This implementation provides a solution to the Regular Expression Matching problem in Java.