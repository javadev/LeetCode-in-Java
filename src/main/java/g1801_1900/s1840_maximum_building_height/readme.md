1840\. Maximum Building Height

Hard

You want to build `n` new buildings in a city. The new buildings will be built in a line and are labeled from `1` to `n`.

However, there are city restrictions on the heights of the new buildings:

*   The height of each building must be a non-negative integer.
*   The height of the first building **must** be `0`.
*   The height difference between any two adjacent buildings **cannot exceed** `1`.

Additionally, there are city restrictions on the maximum height of specific buildings. These restrictions are given as a 2D integer array `restrictions` where <code>restrictions[i] = [id<sub>i</sub>, maxHeight<sub>i</sub>]</code> indicates that building <code>id<sub>i</sub></code> must have a height **less than or equal to** <code>maxHeight<sub>i</sub></code>.

It is guaranteed that each building will appear **at most once** in `restrictions`, and building `1` will **not** be in `restrictions`.

Return _the **maximum possible height** of the **tallest** building_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/04/08/ic236-q4-ex1-1.png)

**Input:** n = 5, restrictions = [[2,1],[4,1]]

**Output:** 2

**Explanation:** The green area in the image indicates the maximum allowed height for each building. We can build the buildings with heights [0,1,2,1,2], and the tallest building has a height of 2.

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/04/08/ic236-q4-ex2.png)

**Input:** n = 6, restrictions = []

**Output:** 5

**Explanation:** The green area in the image indicates the maximum allowed height for each building. We can build the buildings with heights [0,1,2,3,4,5], and the tallest building has a height of 5.

**Example 3:**

![](https://assets.leetcode.com/uploads/2021/04/08/ic236-q4-ex3.png)

**Input:** n = 10, restrictions = [[5,3],[2,5],[7,4],[10,3]]

**Output:** 5

**Explanation:** The green area in the image indicates the maximum allowed height for each building. We can build the buildings with heights [0,1,2,3,3,4,4,5,4,3], and the tallest building has a height of 5.

**Constraints:**

*   <code>2 <= n <= 10<sup>9</sup></code>
*   <code>0 <= restrictions.length <= min(n - 1, 10<sup>5</sup>)</code>
*   <code>2 <= id<sub>i</sub> <= n</code>
*   <code>id<sub>i</sub></code> is **unique**.
*   <code>0 <= maxHeight<sub>i</sub> <= 10<sup>9</sup></code>