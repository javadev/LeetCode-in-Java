1416\. Restore The Array

Hard

A program was supposed to print an array of integers. The program forgot to print whitespaces and the array is printed as a string of digits `s` and all we know is that all integers in the array were in the range `[1, k]` and there are no leading zeros in the array.

Given the string `s` and the integer `k`, return _the number of the possible arrays that can be printed as_ `s` _using the mentioned program_. Since the answer may be very large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

**Example 1:**

**Input:** s = "1000", k = 10000

**Output:** 1

**Explanation:** The only possible array is [1000]

**Example 2:**

**Input:** s = "1000", k = 10

**Output:** 0

**Explanation:** There cannot be an array that was printed this way and has all integer >= 1 and <= 10.

**Example 3:**

**Input:** s = "1317", k = 2000

**Output:** 8

**Explanation:** Possible arrays are [1317],[131,7],[13,17],[1,317],[13,1,7],[1,31,7],[1,3,17],[1,3,1,7]

**Constraints:**

*   <code>1 <= s.length <= 10<sup>5</sup></code>
*   `s` consists of only digits and does not contain leading zeros.
*   <code>1 <= k <= 10<sup>9</sup></code>