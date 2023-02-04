2325\. Decode the Message

Easy

You are given the strings `key` and `message`, which represent a cipher key and a secret message, respectively. The steps to decode `message` are as follows:

1.  Use the **first** appearance of all 26 lowercase English letters in `key` as the **order** of the substitution table.
2.  Align the substitution table with the regular English alphabet.
3.  Each letter in `message` is then **substituted** using the table.
4.  Spaces `' '` are transformed to themselves.

*   For example, given <code>key = "<ins>**hap**</ins>p<ins>**y**</ins> <ins>**bo**</ins>y"</code> (actual key would have **at least one** instance of each letter in the alphabet), we have the partial substitution table of (`'h' -> 'a'`, `'a' -> 'b'`, `'p' -> 'c'`, `'y' -> 'd'`, `'b' -> 'e'`, `'o' -> 'f'`).

Return _the decoded message_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/05/08/ex1new4.jpg)

**Input:** key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"

**Output:** "this is a secret"

**Explanation:** The diagram above shows the substitution table.

It is obtained by taking the first appearance of each letter in "<ins>**the**</ins> <ins>**quick**</ins> <ins>**brown**</ins> <ins>**f**</ins>o<ins>**x**</ins> <ins>**j**</ins>u<ins>**mps**</ins> o<ins>**v**</ins>er the <ins>**lazy**</ins> <ins>**d**</ins>o<ins>**g**</ins>".

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/05/08/ex2new.jpg)

**Input:** key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb"

**Output:** "the five boxing wizards jump quickly"

**Explanation:** The diagram above shows the substitution table.

It is obtained by taking the first appearance of each letter in "<ins>**eljuxhpwnyrdgtqkviszcfmabo**</ins>".

**Constraints:**

*   `26 <= key.length <= 2000`
*   `key` consists of lowercase English letters and `' '`.
*   `key` contains every letter in the English alphabet (`'a'` to `'z'`) **at least once**.
*   `1 <= message.length <= 2000`
*   `message` consists of lowercase English letters and `' '`.