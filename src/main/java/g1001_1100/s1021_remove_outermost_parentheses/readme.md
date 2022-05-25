1021\. Remove Outermost Parentheses

Easy

A valid parentheses string is either empty `""`, `"(" + A + ")"`, or `A + B`, where `A` and `B` are valid parentheses strings, and `+` represents string concatenation.

*   For example, `""`, `"()"`, `"(())()"`, and `"(()(()))"` are all valid parentheses strings.

A valid parentheses string `s` is primitive if it is nonempty, and there does not exist a way to split it into `s = A + B`, with `A` and `B` nonempty valid parentheses strings.

Given a valid parentheses string `s`, consider its primitive decomposition: <code>s = P<sub>1</sub> + P<sub>2</sub> + ... + P<sub>k</sub></code>, where <code>P<sub>i</sub></code> are primitive valid parentheses strings.

Return `s` _after removing the outermost parentheses of every primitive string in the primitive decomposition of_ `s`.

**Example 1:**

**Input:** s = "(()())(())"

**Output:** "()()()"

**Explanation:** 

The input string is "(()())(())", with primitive decomposition "(()())" + "(())". 

After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

**Example 2:**

**Input:** s = "(()())(())(()(()))"

**Output:** "()()()()(())"

**Explanation:** 

The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))". 

After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".

**Example 3:**

**Input:** s = "()()"

**Output:** ""

**Explanation:** 

The input string is "()()", with primitive decomposition "()" + "()". 

After removing outer parentheses of each part, this is "" + "" = "".

**Constraints:**

*   <code>1 <= s.length <= 10<sup>5</sup></code>
*   `s[i]` is either `'('` or `')'`.
*   `s` is a valid parentheses string.