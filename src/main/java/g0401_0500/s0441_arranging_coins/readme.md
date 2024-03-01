441\. Arranging Coins

Easy

You have `n` coins and you want to build a staircase with these coins. The staircase consists of `k` rows where the <code>i<sup>th</sup></code> row has exactly `i` coins. The last row of the staircase **may be** incomplete.

Given the integer `n`, return _the number of **complete rows** of the staircase you will build_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/04/09/arrangecoins1-grid.jpg)

**Input:** n = 5

**Output:** 2

**Explanation:** Because the 3<sup>rd</sup> row is incomplete, we return 2. 

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/04/09/arrangecoins2-grid.jpg)

**Input:** n = 8

**Output:** 3

**Explanation:** Because the 4<sup>th</sup> row is incomplete, we return 3. 

**Constraints:**

*   <code>1 <= n <= 2<sup>31</sup> - 1</code>