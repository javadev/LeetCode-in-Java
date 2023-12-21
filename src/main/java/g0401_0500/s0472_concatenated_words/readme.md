472\. Concatenated Words

Hard

Given an array of strings `words` (**without duplicates**), return _all the **concatenated words** in the given list of_ `words`.

A **concatenated word** is defined as a string that is comprised entirely of at least two shorter words in the given array.

**Example 1:**

**Input:** words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]

**Output:** ["catsdogcats","dogcatsdog","ratcatdogcat"]

**Explanation:** "catsdogcats" can be concatenated by "cats", "dog" and "cats"; "dogcatsdog" can be concatenated by "dog", "cats" and "dog"; "ratcatdogcat" can be concatenated by "rat", "cat", "dog" and "cat".

**Example 2:**

**Input:** words = ["cat","dog","catdog"]

**Output:** ["catdog"]

**Constraints:**

*   <code>1 <= words.length <= 10<sup>4</sup></code>
*   `0 <= words[i].length <= 1000`
*   `words[i]` consists of only lowercase English letters.
*   <code>0 <= sum(words[i].length) <= 10<sup>5</sup></code>