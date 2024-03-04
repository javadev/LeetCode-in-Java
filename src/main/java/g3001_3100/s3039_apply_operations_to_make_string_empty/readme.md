3039\. Apply Operations to Make String Empty

Medium

You are given a string `s`.

Consider performing the following operation until `s` becomes **empty**:

*   For **every** alphabet character from `'a'` to `'z'`, remove the **first** occurrence of that character in `s` (if it exists).

For example, let initially `s = "aabcbbca"`. We do the following operations:

*   Remove the underlined characters <code>s = "<ins>**a**</ins>a**<ins>bc</ins>**bbca"</code>. The resulting string is `s = "abbca"`.
*   Remove the underlined characters <code>s = "<ins>**ab**</ins>b<ins>**c**</ins>a"</code>. The resulting string is `s = "ba"`.
*   Remove the underlined characters <code>s = "<ins>**ba**</ins>"</code>. The resulting string is `s = ""`.

Return _the value of the string_ `s` _right **before** applying the **last** operation_. In the example above, answer is `"ba"`.

**Example 1:**

**Input:** s = "aabcbbca"

**Output:** "ba"

**Explanation:** Explained in the statement.

**Example 2:**

**Input:** s = "abcd"

**Output:** "abcd"

**Explanation:** We do the following operation: 
- Remove the underlined characters s = "<ins>**abcd**</ins>". The resulting string is s = "". 

The string just before the last operation is "abcd".

**Constraints:**

*   <code>1 <= s.length <= 5 * 10<sup>5</sup></code>
*   `s` consists only of lowercase English letters.