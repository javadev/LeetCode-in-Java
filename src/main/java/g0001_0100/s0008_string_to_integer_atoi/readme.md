8\. String to Integer (atoi)

Medium

Implement the `myAtoi(string s)` function, which converts a string to a 32-bit signed integer.

The algorithm for `myAtoi(string s)` is as follows:

1.  **Whitespace**: Ignore any leading whitespace (`" "`).
2.  **Signedness**: Determine the sign by checking if the next character is `'-'` or `'+'`, assuming positivity if neither present.
3.  **Conversion**: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
4.  **Rounding**: If the integer is out of the 32-bit signed integer range <code>[-2<sup>31</sup>, 2<sup>31</sup> - 1]</code>, then round the integer to remain in the range. Specifically, integers less than <code>-2<sup>31</sup></code> should be rounded to <code>-2<sup>31</sup></code>, and integers greater than <code>2<sup>31</sup> - 1</code> should be rounded to <code>2<sup>31</sup> - 1</code>.

Return the integer as the final result.

**Example 1:**

**Input:** s = "42"

**Output:** 42

**Explanation:**

    The underlined characters are what is read in and the caret is the current reader position.
    Step 1: "42" (no characters read because there is no leading whitespace)
             ^
    Step 2: "42" (no characters read because there is neither a '-' nor '+')
             ^
    Step 3: "42" ("42" is read in)
              ^ 

**Example 2:**

**Input:** s = " -042"

**Output:** \-42

**Explanation:**

    Step 1: "___-042" (leading whitespace is read and ignored)
                ^
    Step 2: " -042" ('-' is read, so the result should be negative)
              ^
    Step 3: " -042" ("042" is read in, leading zeros ignored in the result)
                 ^ 

**Example 3:**

**Input:** s = "1337c0d3"

**Output:** 1337

**Explanation:**

    Step 1: "1337c0d3" (no characters read because there is no leading whitespace)
             ^
    Step 2: "1337c0d3" (no characters read because there is neither a '-' nor '+')
             ^
    Step 3: "1337c0d3" ("1337" is read in; reading stops because the next character is a non-digit)
                 ^ 

**Example 4:**

**Input:** s = "0-1"

**Output:** 0

**Explanation:**

    Step 1: "0-1" (no characters read because there is no leading whitespace)
             ^
    Step 2: "0-1" (no characters read because there is neither a '-' nor '+')
             ^
    Step 3: "0-1" ("0" is read in; reading stops because the next character is a non-digit)
              ^ 

**Example 5:**

**Input:** s = "words and 987"

**Output:** 0

**Explanation:**

Reading stops at the first non-digit character 'w'.

To solve the String to Integer (atoi) problem in Java using a `Solution` class, we'll follow these steps:

1. Define a `Solution` class with a method named `myAtoi`.
2. Trim leading whitespace from the input string `s`.
3. Check if the string is empty after trimming. If so, return 0.
4. Initialize variables to keep track of the sign of the integer (`sign`), the starting index of the numeric characters (`start`), and the result (`result`).
5. Check if the first character of the trimmed string is `'-'` or `'+'`. Update `sign` accordingly, and move the starting index accordingly.
6. Iterate through the characters of the trimmed string starting from the `start` index:
   - Check if the current character is a digit. If not, break the loop.
   - Convert the character to its numeric value and update the `result`.
   - Check if the result exceeds the 32-bit integer range. If so, clamp it to the range and return.
7. Multiply the `result` by the sign and return the final value.
8. Handle edge cases where the input string is empty, consists of only whitespace, or contains non-numeric characters at the beginning.

Here's the implementation:

```java
public class Solution {

    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty())
            return 0;

        int sign = 1;
        int start = 0;
        long result = 0;

        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            start++;
        }

        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c))
                break;
            result = result * 10 + (c - '0');
            if (result * sign > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (result * sign < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }

        return (int) (result * sign);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String s1 = "42";
        System.out.println("Example 1 Output: " + solution.myAtoi(s1));

        String s2 = " -42";
        System.out.println("Example 2 Output: " + solution.myAtoi(s2));

        String s3 = "4193 with words";
        System.out.println("Example 3 Output: " + solution.myAtoi(s3));

        String s4 = "words and 987";
        System.out.println("Example 4 Output: " + solution.myAtoi(s4));

        String s5 = "-91283472332";
        System.out.println("Example 5 Output: " + solution.myAtoi(s5));
    }
}
```

This implementation provides a solution to the String to Integer (atoi) problem in Java.

**Constraints:**

*   `0 <= s.length <= 200`
*   `s` consists of English letters (lower-case and upper-case), digits (`0-9`), `' '`, `'+'`, `'-'`, and `'.'`.
