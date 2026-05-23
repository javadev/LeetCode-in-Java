3789\. Minimum Cost to Acquire Required Items

Medium

You are given five integers `cost1`, `cost2`, `costBoth`, `need1`, and `need2`.

There are three types of items available:

*   An item of **type 1** costs `cost1` and contributes 1 unit to the type 1 requirement only.
*   An item of **type 2** costs `cost2` and contributes 1 unit to the type 2 requirement only.
*   An item of **type 3** costs `costBoth` and contributes 1 unit to **both** type 1 and type 2 requirements.

You must collect enough items so that the total contribution toward type 1 is **at least** `need1` and the total contribution toward type 2 is **at least** `need2`.

Return an integer representing the **minimum** possible total cost to achieve these requirements.

**Example 1:**

**Input:** cost1 = 3, cost2 = 2, costBoth = 1, need1 = 3, need2 = 2

**Output:** 3

**Explanation:**

After buying three type 3 items, which cost `3 * 1 = 3`, the total contribution to type 1 is 3 (`>= need1 = 3`) and to type 2 is 3 (`>= need2 = 2`).   
Any other valid combination would cost more, so the minimum total cost is 3.

**Example 2:**

**Input:** cost1 = 5, cost2 = 4, costBoth = 15, need1 = 2, need2 = 3

**Output:** 22

**Explanation:**

We buy `need1 = 2` items of type 1 and `need2 = 3` items of type 2: `2 * 5 + 3 * 4 = 10 + 12 = 22`.   
Any other valid combination would cost more, so the minimum total cost is 22.

**Example 3:**

**Input:** cost1 = 5, cost2 = 4, costBoth = 15, need1 = 0, need2 = 0

**Output:** 0

**Explanation:**

Since no items are required (`need1 = need2 = 0`), we buy nothing and pay 0.

**Constraints:**

*   <code>1 <= cost1, cost2, costBoth <= 10<sup>6</sup></code>
*   <code>0 <= need1, need2 <= 10<sup>9</sup></code>