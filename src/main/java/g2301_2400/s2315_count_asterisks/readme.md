2315\. Count Asterisks

Easy

You are given a string `s`, where every **two** consecutive vertical bars `'|'` are grouped into a **pair**. In other words, the 1<sup>st</sup> and 2<sup>nd</sup> `'|'` make a pair, the 3<sup>rd</sup> and 4<sup>th</sup> `'|'` make a pair, and so forth.

Return _the number of_ `'*'` _in_ `s`_, **excluding** the_ `'*'` _between each pair of_ `'|'`.

**Note** that each `'|'` will belong to **exactly** one pair.

**Example 1:**

**Input:** s = "l|\*e\*et|c\*\*o|\*de|"

**Output:** 2

**Explanation:** The considered characters are underlined: "<ins>l</ins>|\*e\*et|<ins>c\*\*o</ins>|\*de|".

The characters between the first and second '|' are excluded from the answer.

Also, the characters between the third and fourth '|' are excluded from the answer. There are 2 asterisks considered. Therefore, we return 2.

**Example 2:**

**Input:** s = "iamprogrammer"

**Output:** 0

**Explanation:** In this example, there are no asterisks in s. Therefore, we return 0. 

**Example 3:**

**Input:** s = "yo|uar|e\*\*|b|e\*\*\*au|tifu|l"

**Output:** 5

**Explanation:** The considered characters are underlined: "<ins>yo</ins>|uar|<ins>e\*\*</ins>|b|<ins>e\*\*\*au</ins>|tifu|<ins>l</ins>".

There are 5 asterisks considered. Therefore, we return 5.

**Constraints:**

*   `1 <= s.length <= 1000`
*   `s` consists of lowercase English letters, vertical bars `'|'`, and asterisks `'*'`.
*   `s` contains an **even** number of vertical bars `'|'`.
