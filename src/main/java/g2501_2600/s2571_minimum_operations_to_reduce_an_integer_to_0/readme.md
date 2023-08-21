2571\. Minimum Operations to Reduce an Integer to 0

Medium

You are given a positive integer `n`, you can do the following operation **any** number of times:

*   Add or subtract a **power** of `2` from `n`.

Return _the **minimum** number of operations to make_ `n` _equal to_ `0`.

A number `x` is power of `2` if <code>x == 2<sup>i</sup></code> where `i >= 0`_._

**Example 1:**

**Input:** n = 39

**Output:** 3

**Explanation:** We can do the following operations: 

- Add 2<sup>0</sup> = 1 to n, so now n = 40. 

- Subtract 2<sup>3</sup> = 8 from n, so now n = 32. 

- Subtract 2<sup>5</sup> = 32 from n, so now n = 0. It can be shown that 3 is the minimum number of operations we need to make n equal to 0.

**Example 2:**

**Input:** n = 54

**Output:** 3

**Explanation:** We can do the following operations: 

- Add 2<sup>1</sup> = 2 to n, so now n = 56. 

- Add 2<sup>3</sup> = 8 to n, so now n = 64. 

- Subtract 2<sup>6</sup> = 64 from n, so now n = 0. So the minimum number of operations is 3.

**Constraints:**

*   <code>1 <= n <= 10<sup>5</sup></code>