500\. Keyboard Row

Easy

Given an array of strings `words`, return _the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below_.

In the **American keyboard**:

*   the first row consists of the characters `"qwertyuiop"`,
*   the second row consists of the characters `"asdfghjkl"`, and
*   the third row consists of the characters `"zxcvbnm"`.

![](https://assets.leetcode.com/uploads/2018/10/12/keyboard.png)

**Example 1:**

**Input:** words = ["Hello","Alaska","Dad","Peace"]

**Output:** ["Alaska","Dad"]

**Example 2:**

**Input:** words = ["omk"]

**Output:** []

**Example 3:**

**Input:** words = ["adsdf","sfd"]

**Output:** ["adsdf","sfd"]

**Constraints:**

*   `1 <= words.length <= 20`
*   `1 <= words[i].length <= 100`
*   `words[i]` consists of English letters (both lowercase and uppercase).