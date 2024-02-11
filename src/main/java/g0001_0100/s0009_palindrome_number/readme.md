9\. Palindrome Number

Easy

Given an integer `x`, return `true` if `x` is palindrome integer.

An integer is a **palindrome** when it reads the same backward as forward. For example, `121` is palindrome while `123` is not.

**Example 1:**

**Input:** x = 121

**Output:** true 

**Example 2:**

**Input:** x = -121

**Output:** false

**Explanation:** From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome. 

**Example 3:**

**Input:** x = 10

**Output:** false

**Explanation:** Reads 01 from right to left. Therefore it is not a palindrome. 

**Example 4:**

**Input:** x = -101

**Output:** false 

**Constraints:**

*   <code>-2<sup>31</sup> <= x <= 2<sup>31</sup> - 1</code>

**Follow up:** Could you solve it without converting the integer to a string?

To solve the Palindrome Number problem in Java using a `Solution` class, we'll follow these steps:

1. Define a `Solution` class with a method named `isPalindrome`.
2. Handle special cases where `x` is negative or divisible by 10 but not equal to zero, as they cannot be palindromes.
3. Initialize variables to keep track of the reversed number (`reversed`) and the original number (`original`).
4. Iterate through the digits of the original number `x`:
   - Extract the least significant digit using the modulo operator and append it to the reversed number.
   - Update `original` by removing the least significant digit using integer division.
5. Check if the reversed number is equal to the original number. If so, return `true`; otherwise, return `false`.

Here's the implementation:

```java
public class Solution {

    public boolean isPalindrome(int x) {
        // Special cases:
        // As discussed, negative numbers are not palindromes.
        // Also, if the last digit of the number is 0, it can't be a palindrome unless the number is 0 itself.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        while (original > reversed) {
            int digit = original % 10;
            reversed = reversed * 10 + digit;
            original /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by reversed / 10
        // For example when the input is 12321, at the end of the while loop we get x = 12, reversed = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return original == reversed || original == reversed / 10;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int x1 = 121;
        System.out.println("Example 1 Output: " + solution.isPalindrome(x1));

        int x2 = -121;
        System.out.println("Example 2 Output: " + solution.isPalindrome(x2));

        int x3 = 10;
        System.out.println("Example 3 Output: " + solution.isPalindrome(x3));

        int x4 = -101;
        System.out.println("Example 4 Output: " + solution.isPalindrome(x4));
    }
}
```

This implementation provides a solution to the Palindrome Number problem in Java.