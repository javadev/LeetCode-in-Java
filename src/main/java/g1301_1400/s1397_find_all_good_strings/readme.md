1397\. Find All Good Strings

Hard

Given the strings `s1` and `s2` of size `n` and the string `evil`, return _the number of **good** strings_.

A **good** string has size `n`, it is alphabetically greater than or equal to `s1`, it is alphabetically smaller than or equal to `s2`, and it does not contain the string `evil` as a substring. Since the answer can be a huge number, return this **modulo** <code>10<sup>9</sup> + 7</code>.

**Example 1:**

**Input:** n = 2, s1 = "aa", s2 = "da", evil = "b"

**Output:** 51

**Explanation:** There are 25 good strings starting with 'a': "aa","ac","ad",...,"az". Then there are 25 good strings starting with 'c': "ca","cc","cd",...,"cz" and finally there is one good string starting with 'd': "da".

**Example 2:**

**Input:** n = 8, s1 = "leetcode", s2 = "leetgoes", evil = "leet"

**Output:** 0

**Explanation:** All strings greater than or equal to s1 and smaller than or equal to s2 start with the prefix "leet", therefore, there is not any good string.

**Example 3:**

**Input:** n = 2, s1 = "gx", s2 = "gz", evil = "x"

**Output:** 2

**Constraints:**

*   `s1.length == n`
*   `s2.length == n`
*   `s1 <= s2`
*   `1 <= n <= 500`
*   `1 <= evil.length <= 50`
*   All strings consist of lowercase English letters.