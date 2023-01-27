2490\. Circular Sentence

Easy

A **sentence** is a list of words that are separated by a **single** space with no leading or trailing spaces.

*   For example, `"Hello World"`, `"HELLO"`, `"hello world hello world"` are all sentences.

Words consist of **only** uppercase and lowercase English letters. Uppercase and lowercase English letters are considered different.

A sentence is **circular** if:

*   The last character of a word is equal to the first character of the next word.
*   The last character of the last word is equal to the first character of the first word.

For example, `"leetcode exercises sound delightful"`, `"eetcode"`, `"leetcode eats soul"` are all circular sentences. However, `"Leetcode is cool"`, `"happy Leetcode"`, `"Leetcode"` and `"I like Leetcode"` are **not** circular sentences.

Given a string `sentence`, return `true` _if it is circular_. Otherwise, return `false`.

**Example 1:**

**Input:** sentence = "leetcode exercises sound delightful"

**Output:** true

**Explanation:** The words in sentence are ["leetcode", "exercises", "sound", "delightful"].
- leetcod<ins>e</ins>'s last character is equal to <ins>e</ins>xercises's first character. 
- exercise<ins>s</ins>'s last character is equal to <ins>s</ins>ound's first character. 
- soun<ins>d</ins>'s last character is equal to <ins>d</ins>elightful's first character. 
- delightfu<ins>l</ins>'s last character is equal to <ins>l</ins>eetcode's first character. 

The sentence is circular.

**Example 2:**

**Input:** sentence = "eetcode"

**Output:** true

**Explanation:** The words in sentence are ["eetcode"].
- eetcod<ins>e</ins>'s last character is equal to <ins>e</ins>etcode's first character. The sentence is circular.

**Example 3:**

**Input:** sentence = "Leetcode is cool"

**Output:** false

**Explanation:** The words in sentence are ["Leetcode", "is", "cool"]. - Leetcod<ins>e</ins>'s last character is **not** equal to <ins>i</ins>s's first character. The sentence is **not** circular.

**Constraints:**

*   `1 <= sentence.length <= 500`
*   `sentence` consist of only lowercase and uppercase English letters and spaces.
*   The words in `sentence` are separated by a single space.
*   There are no leading or trailing spaces.