3946\. Maximum Number of Items From Sale I

Medium

You are given a 2D integer array `items`, where <code>items[i] = [factor<sub>i</sub>, price<sub>i</sub>]</code> represents the <code>i<sup>th</sup></code> item. You are also given an integer `budget`.

There are unlimited copies of each item available for purchase.You may buy any number of copies of any items such that the total cost of the purchased copies is at most `budget`.

After buying items, you may receive free copies according to the following rules:

*   For each item `i` that you bought **at least one copy** of, you receive **one free copy** of every item `j` such that `j != i` and <code>factor<sub>i</sub></code> divides <code>factor<sub>j</sub></code>.
*   Buying multiple copies of the same item `i` does **not** give additional free copies through item `i`.
*   The same item `j` can be received multiple times for free if it is received from purchases of different item types.

Return the **maximum total number of item copies** you can obtain, including both purchased copies and free copies, while spending at most `budget` on purchased items.

**Example 1:**

**Input:** items = [[6,2],[2,6],[3,4]], budget = 9

**Output:** 4

**Explanation:**

*   You can buy 2 copies of item 0 and 1 copy of item 2 for a total cost of `2 * 2 + 4 = 8`, which is not greater than `budget = 9`.
*   Buying item 2 gives 1 free copy of item 0, because <code>factor<sub>2</sub> = 3</code> divides <code>factor<sub>0</sub> = 6</code>.
*   You leave with 3 purchased copies and 1 free copy, for a total of 4 item copies.

**Example 2:**

**Input:** items = [[2,4],[3,2],[4,1],[6,4],[12,4]], budget = 8

**Output:** 10

**Explanation:**

*   You can buy 1 copy of item 0, 1 copy of item 1, and 2 copies of item 2 for a total cost of `4 + 2 + 2 * 1 = 8`.
*   Buying item 0 gives 1 free copy of items 2, 3, and 4.
*   Buying item 1 gives 1 free copy of items 3 and 4.
*   Buying item 2 gives 1 free copy of item 4.
*   Thus, you receive 6 free copies. You leave with 4 purchased copies and 6 free copies, for a total of 10 item copies.

**Constraints:**

*   `1 <= items.length <= 1000`
*   <code>items[i] = [factor<sub>i</sub>, price<sub>i</sub>]</code>
*   <code>1 <= factor<sub>i</sub>, price<sub>i</sub> <= 1500</code>
*   `1 <= budget <= 1500`