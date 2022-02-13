372\. Super Pow

Medium

Your task is to calculate <code>a<sup>b</sup></code> mod `1337` where `a` is a positive integer and `b` is an extremely large positive integer given in the form of an array.

**Example 1:**

**Input:** a = 2, b = [3]

**Output:** 8

**Example 2:**

**Input:** a = 2, b = [1,0]

**Output:** 1024

**Example 3:**

**Input:** a = 1, b = [4,3,3,8,5,2]

**Output:** 1

**Example 4:**

**Input:** a = 2147483647, b = [2,0,0]

**Output:** 1198

**Constraints:**

*   <code>1 <= a <= 2<sup>31</sup> - 1</code>
*   `1 <= b.length <= 2000`
*   `0 <= b[i] <= 9`
*   `b` doesn't contain leading zeros.