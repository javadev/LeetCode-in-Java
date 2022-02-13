823\. Binary Trees With Factors

Medium

Given an array of unique integers, `arr`, where each integer `arr[i]` is strictly greater than `1`.

We make a binary tree using these integers, and each number may be used for any number of times. Each non-leaf node's value should be equal to the product of the values of its children.

Return _the number of binary trees we can make_. The answer may be too large so return the answer **modulo** <code>10<sup>9</sup> + 7</code>.

**Example 1:**

**Input:** arr = [2,4]

**Output:** 3

**Explanation:** We can make these trees: `[2], [4], [4, 2, 2]`

**Example 2:**

**Input:** arr = [2,4,5,10]

**Output:** 7

**Explanation:** We can make these trees: `[2], [4], [5], [10], [4, 2, 2], [10, 2, 5], [10, 5, 2]`.

**Constraints:**

*   `1 <= arr.length <= 1000`
*   <code>2 <= arr[i] <= 10<sup>9</sup></code>
*   All the values of `arr` are **unique**.