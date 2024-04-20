395\. Longest Substring with At Least K Repeating Characters

Medium

Given a string `s` and an integer `k`, return _the length of the longest substring of_ `s` _such that the frequency of each character in this substring is greater than or equal to_ `k`.

**Example 1:**

**Input:** s = "aaabb", k = 3

**Output:** 3

**Explanation:** The longest substring is "aaa", as 'a' is repeated 3 times.

**Example 2:**

**Input:** s = "ababbc", k = 2

**Output:** 5

**Explanation:** The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.

**Constraints:**

*   <code>1 <= s.length <= 10<sup>4</sup></code>
*   `s` consists of only lowercase English letters.
*   <code>1 <= k <= 10<sup>5</sup></code>