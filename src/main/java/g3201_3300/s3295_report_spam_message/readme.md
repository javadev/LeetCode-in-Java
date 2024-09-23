3295\. Report Spam Message

Medium

You are given an array of strings `message` and an array of strings `bannedWords`.

An array of words is considered **spam** if there are **at least** two words in it that **exactly** match any word in `bannedWords`.

Return `true` if the array `message` is spam, and `false` otherwise.

**Example 1:**

**Input:** message = ["hello","world","leetcode"], bannedWords = ["world","hello"]

**Output:** true

**Explanation:**

The words `"hello"` and `"world"` from the `message` array both appear in the `bannedWords` array.

**Example 2:**

**Input:** message = ["hello","programming","fun"], bannedWords = ["world","programming","leetcode"]

**Output:** false

**Explanation:**

Only one word from the `message` array (`"programming"`) appears in the `bannedWords` array.

**Constraints:**

*   <code>1 <= message.length, bannedWords.length <= 10<sup>5</sup></code>
*   `1 <= message[i].length, bannedWords[i].length <= 15`
*   `message[i]` and `bannedWords[i]` consist only of lowercase English letters.