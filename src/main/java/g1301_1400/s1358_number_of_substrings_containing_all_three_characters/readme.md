1358\. Number of Substrings Containing All Three Characters

Medium

Given a string `s` consisting only of characters _a_, _b_ and _c_.

Return the number of substrings containing **at least** one occurrence of all these characters _a_, _b_ and _c_.

**Example 1:**

**Input:** s = "abcabc"

**Output:** 10

**Explanation:** The substrings containing at least one occurrence of the characters _a_, _b_ and _c are "_abc_", "_abca_", "_abcab_", "_abcabc_", "_bca_", "_bcab_", "_bcabc_", "_cab_", "_cabc_"_ and _"_abc_"_ (**again**)_._

**Example 2:**

**Input:** s = "aaacb"

**Output:** 3

**Explanation:** The substrings containing at least one occurrence of the characters _a_, _b_ and _c are "_aaacb_", "_aacb_"_ and _"_acb_"._

**Example 3:**

**Input:** s = "abc"

**Output:** 1

**Constraints:**

*   `3 <= s.length <= 5 x 10^4`
*   `s` only consists of _a_, _b_ or _c _characters.