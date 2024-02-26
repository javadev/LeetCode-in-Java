2223\. Sum of Scores of Built Strings

Hard

You are **building** a string `s` of length `n` **one** character at a time, **prepending** each new character to the **front** of the string. The strings are labeled from `1` to `n`, where the string with length `i` is labeled <code>s<sub>i</sub></code>.

*   For example, for `s = "abaca"`, <code>s<sub>1</sub> == "a"</code>, <code>s<sub>2</sub> == "ca"</code>, <code>s<sub>3</sub> == "aca"</code>, etc.

The **score** of <code>s<sub>i</sub></code> is the length of the **longest common prefix** between <code>s<sub>i</sub></code> and <code>s<sub>n</sub></code> (Note that <code>s == s<sub>n</sub></code>).

Given the final string `s`, return _the **sum** of the **score** of every_ <code>s<sub>i</sub></code>.

**Example 1:**

**Input:** s = "babab"

**Output:** 9

**Explanation:** For s<sub>1</sub> == "b", the longest common prefix is "b" which has a score of 1. 

For s<sub>2</sub> == "ab", there is no common prefix so the score is 0. 

For s<sub>3</sub> == "bab", the longest common prefix is "bab" which has a score of 3. 

For s<sub>4</sub> == "abab", there is no common prefix so the score is 0. 

For s<sub>5</sub> == "babab", the longest common prefix is "babab" which has a score of 5. 

The sum of the scores is 1 + 0 + 3 + 0 + 5 = 9, so we return 9.

**Example 2:**

**Input:** s = "azbazbzaz"

**Output:** 14

**Explanation:** 

For s<sub>2</sub> == "az", the longest common prefix is "az" which has a score of 2. 

For s<sub>6</sub> == "azbzaz", the longest common prefix is "azb" which has a score of 3. 

For s<sub>9</sub> == "azbazbzaz", the longest common prefix is "azbazbzaz" which has a score of 9. 

For all other s<sub>i</sub>, the score is 0. 

The sum of the scores is 2 + 3 + 9 = 14, so we return 14.

**Constraints:**

*   <code>1 <= s.length <= 10<sup>5</sup></code>
*   `s` consists of lowercase English letters.