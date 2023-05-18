227\. Basic Calculator II

Medium

Given a string `s` which represents an expression, _evaluate this expression and return its value_.

The integer division should truncate toward zero.

You may assume that the given expression is always valid. All intermediate results will be in the range of <code>[-2<sup>31</sup>, 2<sup>31</sup> - 1]</code>.

**Note:** You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as `eval()`.

**Example 1:**

**Input:** s = "3+2\*2"

**Output:** 7 

**Example 2:**

**Input:** s = " 3/2 "

**Output:** 1 

**Example 3:**

**Input:** s = " 3+5 / 2 "

**Output:** 5 

**Constraints:**

*   <code>1 <= s.length <= 3 * 10<sup>5</sup></code>
*   `s` consists of integers and operators `('+', '-', '*', '/')` separated by some number of spaces.
*   `s` represents **a valid expression**.
*   All the integers in the expression are non-negative integers in the range <code>[0, 2<sup>31</sup> - 1]</code>.
*   The answer is **guaranteed** to fit in a **32-bit integer**.