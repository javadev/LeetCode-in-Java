2384\. Largest Palindromic Number

Medium

You are given a string `num` consisting of digits only.

Return _the **largest palindromic** integer (in the form of a string) that can be formed using digits taken from_ `num`. It should not contain **leading zeroes**.

**Notes:**

*   You do **not** need to use all the digits of `num`, but you must use **at least** one digit.
*   The digits can be reordered.

**Example 1:**

**Input:** num = "444947137"

**Output:** "7449447"

**Explanation:**

Use the digits "4449477" from "<ins>**44494**</ins><ins>**7**</ins>13<ins>**7**</ins>" to form the palindromic integer "7449447".

It can be shown that "7449447" is the largest palindromic integer that can be formed.

**Example 2:**

**Input:** num = "00009"

**Output:** "9"

**Explanation:**

It can be shown that "9" is the largest palindromic integer that can be formed.

Note that the integer returned should not contain leading zeroes.

**Constraints:**

*   <code>1 <= num.length <= 10<sup>5</sup></code>
*   `num` consists of digits.