1759\. Count Number of Homogenous Substrings

Medium

Given a string `s`, return _the number of **homogenous** substrings of_ `s`_._ Since the answer may be too large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

A string is **homogenous** if all the characters of the string are the same.

A **substring** is a contiguous sequence of characters within a string.

**Example 1:**

**Input:** s = "abbcccaa"

**Output:** 13

**Explanation:** The homogenous substrings are listed as below: 

"a" appears 3 times. 

"aa" appears 1 time. 

"b" appears 2 times. 

"bb" appears 1 time. 

"c" appears 3 times. 

"cc" appears 2 times. 

"ccc" appears 1 time. 

3 + 1 + 2 + 1 + 3 + 2 + 1 = 13.

**Example 2:**

**Input:** s = "xy"

**Output:** 2

**Explanation:** The homogenous substrings are "x" and "y".

**Example 3:**

**Input:** s = "zzzzz"

**Output:** 15

**Constraints:**

*   <code>1 <= s.length <= 10<sup>5</sup></code>
*   `s` consists of lowercase letters.