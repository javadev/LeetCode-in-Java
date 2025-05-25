3557\. Find Maximum Number of Non Intersecting Substrings

Medium

You are given a string `word`.

Return the **maximum** number of non-intersecting ****substring**** of word that are at **least** four characters long and start and end with the same letter.

**Example 1:**

**Input:** word = "abcdeafdef"

**Output:** 2

**Explanation:**

The two substrings are `"abcdea"` and `"fdef"`.

**Example 2:**

**Input:** word = "bcdaaaab"

**Output:** 1

**Explanation:**

The only substring is `"aaaa"`. Note that we cannot **also** choose `"bcdaaaab"` since it intersects with the other substring.

**Constraints:**

*   <code>1 <= word.length <= 2 * 10<sup>5</sup></code>
*   `word` consists only of lowercase English letters.