686\. Repeated String Match

Medium

Given two strings `a` and `b`, return _the minimum number of times you should repeat string_ `a` _so that string_ `b` _is a substring of it_. If it is impossible for `b` to be a substring of `a` after repeating it, return `-1`.

**Notice:** string `"abc"` repeated 0 times is `""`, repeated 1 time is `"abc"` and repeated 2 times is `"abcabc"`.

**Example 1:**

**Input:** a = "abcd", b = "cdabcdab"

**Output:** 3

**Explanation:** We return 3 because by repeating a three times "ab**cdabcdab**cd", b is a substring of it.

**Example 2:**

**Input:** a = "a", b = "aa"

**Output:** 2

**Constraints:**

*   <code>1 <= a.length, b.length <= 10<sup>4</sup></code>
*   `a` and `b` consist of lowercase English letters.