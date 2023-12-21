524\. Longest Word in Dictionary through Deleting

Medium

Given a string `s` and a string array `dictionary`, return _the longest string in the dictionary that can be formed by deleting some of the given string characters_. If there is more than one possible result, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.

**Example 1:**

**Input:** s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]

**Output:** "apple"

**Example 2:**

**Input:** s = "abpcplea", dictionary = ["a","b","c"]

**Output:** "a"

**Constraints:**

*   `1 <= s.length <= 1000`
*   `1 <= dictionary.length <= 1000`
*   `1 <= dictionary[i].length <= 1000`
*   `s` and `dictionary[i]` consist of lowercase English letters.