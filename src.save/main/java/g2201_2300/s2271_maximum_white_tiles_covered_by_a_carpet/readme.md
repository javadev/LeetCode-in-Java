2271\. Maximum White Tiles Covered by a Carpet

Medium

You are given a 2D integer array `tiles` where <code>tiles[i] = [l<sub>i</sub>, r<sub>i</sub>]</code> represents that every tile `j` in the range <code>l<sub>i</sub> <= j <= r<sub>i</sub></code> is colored white.

You are also given an integer `carpetLen`, the length of a single carpet that can be placed **anywhere**.

Return _the **maximum** number of white tiles that can be covered by the carpet_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/03/25/example1drawio3.png)

**Input:** tiles = [[1,5],[10,11],[12,18],[20,25],[30,32]], carpetLen = 10

**Output:** 9

**Explanation:** Place the carpet starting on tile 10. 

It covers 9 white tiles, so we return 9. 

Note that there may be other places where the carpet covers 9 white tiles. 

It can be shown that the carpet cannot cover more than 9 white tiles.

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/03/24/example2drawio.png)

**Input:** tiles = [[10,11],[1,1]], carpetLen = 2

**Output:** 2

**Explanation:** Place the carpet starting on tile 10. 

It covers 2 white tiles, so we return 2.

**Constraints:**

*   <code>1 <= tiles.length <= 5 * 10<sup>4</sup></code>
*   `tiles[i].length == 2`
*   <code>1 <= l<sub>i</sub> <= r<sub>i</sub> <= 10<sup>9</sup></code>
*   <code>1 <= carpetLen <= 10<sup>9</sup></code>
*   The `tiles` are **non-overlapping**.