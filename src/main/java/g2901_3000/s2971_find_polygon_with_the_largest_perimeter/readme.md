2971\. Find Polygon With the Largest Perimeter

Medium

You are given an array of **positive** integers `nums` of length `n`.

A **polygon** is a closed plane figure that has at least `3` sides. The **longest side** of a polygon is **smaller** than the sum of its other sides.

Conversely, if you have `k` (`k >= 3`) **positive** real numbers <code>a<sub>1</sub></code>, <code>a<sub>2</sub></code>, <code>a<sub>3</sub></code>, ..., <code>a<sub>k</sub></code> where <code>a<sub>1</sub> <= a<sub>2</sub> <= a<sub>3</sub> <= ... <= a<sub>k</sub></code> **and** <code>a<sub>1</sub> + a<sub>2</sub> + a<sub>3</sub> + ... + a<sub>k-1</sub> > a<sub>k</sub></code>, then there **always** exists a polygon with `k` sides whose lengths are <code>a<sub>1</sub></code>, <code>a<sub>2</sub></code>, <code>a<sub>3</sub></code>, ..., <code>a<sub>k</sub></code>.

The **perimeter** of a polygon is the sum of lengths of its sides.

Return _the **largest** possible **perimeter** of a **polygon** whose sides can be formed from_ `nums`, _or_ `-1` _if it is not possible to create a polygon_.

**Example 1:**

**Input:** nums = [5,5,5]

**Output:** 15

**Explanation:** The only possible polygon that can be made from nums has 3 sides: 5, 5, and 5. The perimeter is 5 + 5 + 5 = 15.

**Example 2:**

**Input:** nums = [1,12,1,2,5,50,3]

**Output:** 12

**Explanation:** The polygon with the largest perimeter which can be made from nums has 5 sides: 1, 1, 2, 3, and 5. The perimeter is 1 + 1 + 2 + 3 + 5 = 12. We cannot have a polygon with either 12 or 50 as the longest side because it is not possible to include 2 or more smaller sides that have a greater sum than either of them. It can be shown that the largest possible perimeter is 12.

**Example 3:**

**Input:** nums = [5,5,50]

**Output:** -1

**Explanation:** There is no possible way to form a polygon from nums, as a polygon has at least 3 sides and 50 > 5 + 5.

**Constraints:**

*   <code>3 <= n <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>