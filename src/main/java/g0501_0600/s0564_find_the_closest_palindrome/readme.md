564\. Find the Closest Palindrome

Hard

Given a string `n` representing an integer, return _the closest integer (not including itself), which is a palindrome_. If there is a tie, return _**the smaller one**_.

The closest is defined as the absolute difference minimized between two integers.

**Example 1:**

**Input:** n = "123"

**Output:** "121"

**Example 2:**

**Input:** n = "1"

**Output:** "0"

**Explanation:** 0 and 2 are the closest palindromes but we return the smallest which is 0.

**Constraints:**

*   `1 <= n.length <= 18`
*   `n` consists of only digits.
*   `n` does not have leading zeros.
*   `n` is representing an integer in the range <code>[1, 10<sup>18</sup> - 1]</code>.