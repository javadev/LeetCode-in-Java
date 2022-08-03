991\. Broken Calculator

Medium

There is a broken calculator that has the integer `startValue` on its display initially. In one operation, you can:

*   multiply the number on display by `2`, or
*   subtract `1` from the number on display.

Given two integers `startValue` and `target`, return _the minimum number of operations needed to display_ `target` _on the calculator_.

**Example 1:**

**Input:** startValue = 2, target = 3

**Output:** 2

**Explanation:** Use double operation and then decrement operation {2 -> 4 -> 3}.

**Example 2:**

**Input:** startValue = 5, target = 8

**Output:** 2

**Explanation:** Use decrement and then double {5 -> 4 -> 8}.

**Example 3:**

**Input:** startValue = 3, target = 10

**Output:** 3

**Explanation:** Use double, decrement and double {3 -> 6 -> 5 -> 10}.

**Constraints:**

*   <code>1 <= x, y <= 10<sup>9</sup></code>