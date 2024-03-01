6\. Zigzag Conversion

Medium

The string `"PAYPALISHIRING"` is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P A H N A P L S I I G Y I R 

And then read line by line: `"PAHNAPLSIIGYIR"`

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows); 

**Example 1:**

**Input:** s = "PAYPALISHIRING", numRows = 3

**Output:** "PAHNAPLSIIGYIR" 

**Example 2:**

**Input:** s = "PAYPALISHIRING", numRows = 4

**Output:** "PINALSIGYAHRPI"

**Explanation:** P I N A L S I G Y A H R P I 

**Example 3:**

**Input:** s = "A", numRows = 1

**Output:** "A" 

**Constraints:**

*   `1 <= s.length <= 1000`
*   `s` consists of English letters (lower-case and upper-case), `','` and `'.'`.
*   `1 <= numRows <= 1000`

To solve the Zigzag Conversion problem in Java using a `Solution` class, we'll follow these steps:

1. Define a `Solution` class with a method named `convert`.
2. Create an array of strings to represent each row of the zigzag pattern.
3. Initialize variables to keep track of the current row (`row`) and the direction of traversal (`down`).
4. Iterate through each character in the input string `s`.
   - Append the current character to the string representing the current row.
   - If we reach the first or last row, change the direction of traversal accordingly.
   - Update the current row based on the direction of traversal.
5. Concatenate the strings representing each row to form the final zigzag conversion.
6. Return the concatenated string.
7. Handle edge cases where the number of rows is 1 or the input string is empty.

Here's the implementation:

```java
public class Solution {

    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int row = 0;
        boolean down = false;

        for (char c : s.toCharArray()) {
            rows[row].append(c);
            if (row == 0 || row == numRows - 1) {
                down = !down;
            }
            row += down ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : rows) {
            result.append(sb);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        System.out.println("Example 1 Output: " + solution.convert(s1, numRows1));

        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        System.out.println("Example 2 Output: " + solution.convert(s2, numRows2));

        String s3 = "A";
        int numRows3 = 1;
        System.out.println("Example 3 Output: " + solution.convert(s3, numRows3));
    }
}
```

This implementation provides a solution to the Zigzag Conversion problem in Java.