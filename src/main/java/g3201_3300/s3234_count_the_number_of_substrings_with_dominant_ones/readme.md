3234\. Count the Number of Substrings With Dominant Ones

Medium

You are given a binary string `s`.

Return the number of substrings with **dominant** ones.

A string has **dominant** ones if the number of ones in the string is **greater than or equal to** the **square** of the number of zeros in the string.

**Example 1:**

**Input:** s = "00011"

**Output:** 5

**Explanation:**

The substrings with dominant ones are shown in the table below.

| i | j | s[i..j] | Number of Zeros | Number of Ones |
|---|---|---------|-----------------|----------------|
| 3 | 3 | 1       | 0               | 1              |
| 4 | 4 | 1       | 0               | 1              |
| 2 | 3 | 01      | 1               | 1              |
| 3 | 4 | 11      | 0               | 2              |
| 2 | 4 | 011     | 1               | 2              |

**Example 2:**

**Input:** s = "101101"

**Output:** 16

**Explanation:**

The substrings with **non-dominant** ones are shown in the table below.

Since there are 21 substrings total and 5 of them have non-dominant ones, it follows that there are 16 substrings with dominant ones.

| i | j | s[i..j] | Number of Zeros | Number of Ones |
|---|---|---------|-----------------|----------------|
| 1 | 1 | 0       | 1               | 0              |
| 4 | 4 | 0       | 1               | 0              |
| 1 | 4 | 0110    | 2               | 2              |
| 0 | 4 | 10110   | 2               | 3              |
| 1 | 5 | 01101   | 2               | 3              |

**Constraints:**

*   <code>1 <= s.length <= 4 * 10<sup>4</sup></code>
*   `s` consists only of characters `'0'` and `'1'`.