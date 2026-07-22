3844\. Longest Almost-Palindromic Substring

Medium

You are given a string `s` consisting of lowercase English letters.

A substring is **almost-palindromic** if it becomes a palindrome after removing **exactly** one character from it.

Return an integer denoting the length of the **longest** **almost-palindromic** substring in `s`.

**Example 1:**

**Input:** s = "abca"

**Output:** 4

**Explanation:**

Choose the substring <code>"<ins>**abca**</ins>"</code>.

*   Remove <code>"ab<ins>**c**</ins>a"</code>.
*   The string becomes `"aba"`, which is a palindrome.
*   Therefore, `"abca"` is almost-palindromic.

**Example 2:**

**Input:** s = "abba"

**Output:** 4

**Explanation:**

Choose the substring <code>"<ins>**abba**</ins>"</code>.

*   Remove <code>"a<ins>**b**</ins>ba"</code>.
*   The string becomes `"aba"`, which is a palindrome.
*   Therefore, `"abba"` is almost-palindromic.

**Example 3:**

**Input:** s = "zzabba"

**Output:** 5

**Explanation:**

Choose the substring <code>"z<ins>**zabba**</ins>"</code>.

*   Remove <code>"<ins>**z**</ins>abba"</code>.
*   The string becomes `"abba"`, which is a palindrome.
*   Therefore, `"zabba"` is almost-palindromic.

**Constraints:**

*   `2 <= s.length <= 2500`
*   `s` consists of only lowercase English letters.