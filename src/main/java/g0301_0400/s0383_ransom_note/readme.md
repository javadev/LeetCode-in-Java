383\. Ransom Note

Easy

Given two strings `ransomNote` and `magazine`, return `true` _if_ `ransomNote` _can be constructed by using the letters from_ `magazine` _and_ `false` _otherwise_.

Each letter in `magazine` can only be used once in `ransomNote`.

**Example 1:**

**Input:** ransomNote = "a", magazine = "b"

**Output:** false 

**Example 2:**

**Input:** ransomNote = "aa", magazine = "ab"

**Output:** false 

**Example 3:**

**Input:** ransomNote = "aa", magazine = "aab"

**Output:** true 

**Constraints:**

*   <code>1 <= ransomNote.length, magazine.length <= 10<sup>5</sup></code>
*   `ransomNote` and `magazine` consist of lowercase English letters.