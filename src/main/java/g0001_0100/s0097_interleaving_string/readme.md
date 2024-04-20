97\. Interleaving String

Medium

Given strings `s1`, `s2`, and `s3`, find whether `s3` is formed by an **interleaving** of `s1` and `s2`.

An **interleaving** of two strings `s` and `t` is a configuration where they are divided into **non-empty** substrings such that:

*   <code>s = s<sub>1</sub> + s<sub>2</sub> + ... + s<sub>n</sub></code>
*   <code>t = t<sub>1</sub> + t<sub>2</sub> + ... + t<sub>m</sub></code>
*   `|n - m| <= 1`
*   The **interleaving** is <code>s<sub>1</sub> + t<sub>1</sub> + s<sub>2</sub> + t<sub>2</sub> + s<sub>3</sub> + t<sub>3</sub> + ...</code> or <code>t<sub>1</sub> + s<sub>1</sub> + t<sub>2</sub> + s<sub>2</sub> + t<sub>3</sub> + s<sub>3</sub> + ...</code>

**Note:** `a + b` is the concatenation of strings `a` and `b`.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/09/02/interleave.jpg)

**Input:** s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"

**Output:** true 

**Example 2:**

**Input:** s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"

**Output:** false 

**Example 3:**

**Input:** s1 = "", s2 = "", s3 = ""

**Output:** true 

**Constraints:**

*   `0 <= s1.length, s2.length <= 100`
*   `0 <= s3.length <= 200`
*   `s1`, `s2`, and `s3` consist of lowercase English letters.

**Follow up:** Could you solve it using only `O(s2.length)` additional memory space?