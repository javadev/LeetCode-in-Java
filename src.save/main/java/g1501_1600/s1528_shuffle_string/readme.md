1528\. Shuffle String

Easy

You are given a string `s` and an integer array `indices` of the **same length**. The string `s` will be shuffled such that the character at the <code>i<sup>th</sup></code> position moves to `indices[i]` in the shuffled string.

Return _the shuffled string_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/07/09/q1.jpg)

**Input:** s = "codeleet", `indices` = [4,5,6,7,0,2,1,3]

**Output:** "leetcode"

**Explanation:** As shown, "codeleet" becomes "leetcode" after shuffling.

**Example 2:**

**Input:** s = "abc", `indices` = [0,1,2]

**Output:** "abc"

**Explanation:** After shuffling, each character remains in its position.

**Constraints:**

*   `s.length == indices.length == n`
*   `1 <= n <= 100`
*   `s` consists of only lowercase English letters.
*   `0 <= indices[i] < n`
*   All values of `indices` are **unique**.