3947\. Maximum Number of Items From Sale II

Medium

You are given a 2D integer array `items`, where <code>items[i] = [factor<sub>i</sub>, price<sub>i</sub>]</code> represents the <code>i<sup>th</sup></code> item. You are also given an integer `budget`.

There are unlimited copies of each item available for purchase. You may buy any number of copies of any items such that the total cost of the purchased copies is at most `budget`.

After buying items, you may receive free copies according to the following rules:

*   Each purchased copy of item `i` can give you **at most one** free copy of another item `j`.
*   The free item must satisfy `i != j` and <code>factor<sub>i</sub></code> divides <code>factor<sub>j</sub></code>.
*   For each ordered pair `(i, j)`, you can receive a free copy of item `j` from purchases of item `i` **at most once**, regardless of how many copies of item `i` you buy.
*   The same item `j` can be received multiple times for free if it is received from purchases of different item types.

Return the **maximum total number of item copies** you can obtain, including both purchased copies and free copies, while spending at most `budget` on purchased items.

**Example 1:**

**Input:** items = [[1,6],[2,4],[3,5]], budget = 19

**Output:** 5

**Explanation:**

*   You can buy 2 copies of item 0 and 1 copy of item 1 for a total cost of `2 * 6 + 4 = 16`, which is not greater than `budget = 19`.
*   One purchased copy of item 0 gives 1 free copy of item 1, because <code>factor<sub>0</sub> = 1</code> divides <code>factor<sub>1</sub> = 2</code>.
*   The other purchased copy of item 0 gives 1 free copy of item 2, because <code>factor<sub>0</sub> = 1</code> divides <code>factor<sub>2</sub> = 3</code>.
*   You leave with 3 purchased copies and 2 free copies, for a total of 5 item copies.

**Example 2:**

**Input:** items = [[2,8],[1,10],[6,6],[4,12],[5,20],[5,17]], budget = 35

**Output:** 7

**Explanation:**

*   You can buy 2 copies of item 0, 1 copy of item 1, and 1 copy of item 2 for a total cost of `2 * 8 + 10 + 6 = 32`, which is not greater than `budget = 35`.
*   One purchased copy of item 0 gives 1 free copy of item 2, because <code>factor<sub>0</sub> = 2</code> divides <code>factor<sub>2</sub> = 6</code>.
*   The other purchased copy of item 0 gives 1 free copy of item 3, because <code>factor<sub>0</sub> = 2</code> divides <code>factor<sub>3</sub> = 4</code>.
*   The purchased copy of item 1 gives 1 free copy of item 2, because <code>factor<sub>1</sub> = 1</code> divides <code>factor<sub>2</sub> = 6</code>.
*   Buying item 2 gives no free copy, because <code>factor<sub>2</sub> = 6</code> does not divide the factor of any other item.
*   You leave with 4 purchased copies and 3 free copies, for a total of 7 item copies.

**Constraints:**

*   <code>1 <= items.length <= 10<sup>5</sup></code>
*   <code>items[i] = [factor<sub>i</sub>, price<sub>i</sub>]</code>
*   <code>1 <= factor<sub>i</sub> <= items.length</code>
*   <code>1 <= price<sub>i</sub> <= 10<sup>9</sup></code>
*   <code>1 <= budget <= 10<sup>9</sup></code>