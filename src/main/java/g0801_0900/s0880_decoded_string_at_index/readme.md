880\. Decoded String at Index

Medium

You are given an encoded string `s`. To decode the string to a tape, the encoded string is read one character at a time and the following steps are taken:

*   If the character read is a letter, that letter is written onto the tape.
*   If the character read is a digit `d`, the entire current tape is repeatedly written `d - 1` more times in total.

Given an integer `k`, return _the_ <code>k<sup>th</sup></code> _letter (**1-indexed)** in the decoded string_.

**Example 1:**

**Input:** s = "leet2code3", k = 10

**Output:** "o"

**Explanation:** The decoded string is "leetleetcodeleetleetcodeleetleetcode". The 10<sup>th</sup> letter in the string is "o".

**Example 2:**

**Input:** s = "ha22", k = 5

**Output:** "h"

**Explanation:** The decoded string is "hahahaha". The 5<sup>th</sup> letter is "h".

**Example 3:**

**Input:** s = "a2345678999999999999999", k = 1

**Output:** "a"

**Explanation:** The decoded string is "a" repeated 8301530446056247680 times. The 1<sup>st</sup> letter is "a".

**Constraints:**

*   `2 <= s.length <= 100`
*   `s` consists of lowercase English letters and digits `2` through `9`.
*   `s` starts with a letter.
*   <code>1 <= k <= 10<sup>9</sup></code>
*   It is guaranteed that `k` is less than or equal to the length of the decoded string.
*   The decoded string is guaranteed to have less than <code>2<sup>63</sup></code> letters.