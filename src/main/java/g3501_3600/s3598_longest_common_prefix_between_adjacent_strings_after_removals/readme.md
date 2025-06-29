3598\. Longest Common Prefix Between Adjacent Strings After Removals

Medium

You are given an array of strings `words`. For each index `i` in the range `[0, words.length - 1]`, perform the following steps:

*   Remove the element at index `i` from the `words` array.
*   Compute the **length** of the **longest common prefix** among all **adjacent** pairs in the modified array.

Return an array `answer`, where `answer[i]` is the length of the longest common prefix between the adjacent pairs after removing the element at index `i`. If **no** adjacent pairs remain or if **none** share a common prefix, then `answer[i]` should be 0.

**Example 1:**

**Input:** words = ["jump","run","run","jump","run"]

**Output:** [3,0,0,3,3]

**Explanation:**

*   Removing index 0:
    *   `words` becomes `["run", "run", "jump", "run"]`
    *   Longest adjacent pair is `["run", "run"]` having a common prefix `"run"` (length 3)
*   Removing index 1:
    *   `words` becomes `["jump", "run", "jump", "run"]`
    *   No adjacent pairs share a common prefix (length 0)
*   Removing index 2:
    *   `words` becomes `["jump", "run", "jump", "run"]`
    *   No adjacent pairs share a common prefix (length 0)
*   Removing index 3:
    *   `words` becomes `["jump", "run", "run", "run"]`
    *   Longest adjacent pair is `["run", "run"]` having a common prefix `"run"` (length 3)
*   Removing index 4:
    *   words becomes `["jump", "run", "run", "jump"]`
    *   Longest adjacent pair is `["run", "run"]` having a common prefix `"run"` (length 3)

**Example 2:**

**Input:** words = ["dog","racer","car"]

**Output:** [0,0,0]

**Explanation:**

*   Removing any index results in an answer of 0.

**Constraints:**

*   <code>1 <= words.length <= 10<sup>5</sup></code>
*   <code>1 <= words[i].length <= 10<sup>4</sup></code>
*   `words[i]` consists of lowercase English letters.
*   The sum of `words[i].length` is smaller than or equal <code>10<sup>5</sup></code>.