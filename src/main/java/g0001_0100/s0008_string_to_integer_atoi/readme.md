8\. String to Integer (atoi)

Medium

Implement the `myAtoi(string s)` function, which converts a string to a 32-bit signed integer (similar to C/C++'s `atoi` function).

The algorithm for `myAtoi(string s)` is as follows:

1.  Read in and ignore any leading whitespace.
2.  Check if the next character (if not already at the end of the string) is `'-'` or `'+'`. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
3.  Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
4.  Convert these digits into an integer (i.e. `"123" -> 123`, `"0032" -> 32`). If no digits were read, then the integer is `0`. Change the sign as necessary (from step 2).
5.  If the integer is out of the 32-bit signed integer range <code>[-2<sup>31</sup>, 2<sup>31</sup> - 1]</code>, then clamp the integer so that it remains in the range. Specifically, integers less than <code>-2<sup>31</sup></code> should be clamped to <code>-2<sup>31</sup></code>, and integers greater than <code>2<sup>31</sup> - 1</code> should be clamped to <code>2<sup>31</sup> - 1</code>.
6.  Return the integer as the final result.

**Note:**

*   Only the space character `' '` is considered a whitespace character.
*   **Do not ignore** any characters other than the leading whitespace or the rest of the string after the digits.

**Example 1:**

**Input:** s = "42"

**Output:** 42

**Explanation:** The underlined characters are what is read in, the caret is the current reader position.

    Step 1: "42" (no characters read because there is no leading whitespace)
             ^ 
    Step 2: "42" (no characters read because there is neither a '-' nor '+')
             ^
    Step 3: "42" ("42" is read in)
               ^

The parsed integer is 42. Since 42 is in the range [-2<sup>31</sup>, 2<sup>31</sup> - 1], the final result is 42. 

**Example 2:**

**Input:** s = " -42"

**Output:** -42

**Explanation:**

    Step 1: " -42" (leading whitespace is read and ignored)
              ^ 
    Step 2: " -42" ('-' is read, so the result should be negative)
               ^
    Step 3: " -42" ("42" is read in)
                 ^
    The parsed integer is -42.

Since -42 is in the range [-2<sup>31</sup>, 2<sup>31</sup> - 1], the final result is -42. 

**Example 3:**

**Input:** s = "4193 with words"

**Output:** 4193

**Explanation:**

    Step 1: "4193 with words" (no characters read because there is no leading whitespace)
             ^
    Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
             ^
    Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
                 ^ 
    The parsed integer is 4193.

Since 4193 is in the range [-2<sup>31</sup>, 2<sup>31</sup> - 1], the final result is 4193. 

**Example 4:**

**Input:** s = "words and 987"

**Output:** 0

**Explanation:**

    Step 1: "words and 987" (no characters read because there is no leading whitespace)
             ^
    Step 2: "words and 987" (no characters read because there is neither a '-' nor '+')
             ^
    Step 3: "words and 987" (reading stops immediately because there is a non-digit 'w')
             ^
    The parsed integer is 0 because no digits were read.

Since 0 is in the range [-2<sup>31</sup>, 2<sup>31</sup> - 1], the final result is 0. 

**Example 5:**

**Input:** s = "-91283472332"

**Output:** -2147483648

**Explanation:**

    Step 1: "-91283472332" (no characters read because there is no leading whitespace)
            ^
    Step 2: "-91283472332" ('-' is read, so the result should be negative)
              ^
    Step 3: "-91283472332" ("91283472332" is read in)
                         ^
    The parsed integer is -91283472332.

Since -91283472332 is less than the lower bound of the range [-2<sup>31</sup>, 2<sup>31</sup> - 1], the final result is clamped to -2<sup>31</sup> = -2147483648.  

**Constraints:**

*   `0 <= s.length <= 200`
*   `s` consists of English letters (lower-case and upper-case), digits (`0-9`), `' '`, `'+'`, `'-'`, and `'.'`.

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