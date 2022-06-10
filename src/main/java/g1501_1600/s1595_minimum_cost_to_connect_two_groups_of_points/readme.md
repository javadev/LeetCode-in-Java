1595\. Minimum Cost to Connect Two Groups of Points

Hard

You are given two groups of points where the first group has <code>size<sub>1</sub></code> points, the second group has <code>size<sub>2</sub></code> points, and <code>size<sub>1</sub> >= size<sub>2</sub></code>.

The `cost` of the connection between any two points are given in an <code>size<sub>1</sub> x size<sub>2</sub></code> matrix where `cost[i][j]` is the cost of connecting point `i` of the first group and point `j` of the second group. The groups are connected if **each point in both groups is connected to one or more points in the opposite group**. In other words, each point in the first group must be connected to at least one point in the second group, and each point in the second group must be connected to at least one point in the first group.

Return _the minimum cost it takes to connect the two groups_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/09/03/ex1.jpg)

**Input:** cost = [[15, 96], [36, 2]]

**Output:** 17

**Explanation:** The optimal way of connecting the groups is:

1--A

2--B

This results in a total cost of 17.

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/09/03/ex2.jpg)

**Input:** cost = [[1, 3, 5], [4, 1, 1], [1, 5, 3]]

**Output:** 4

**Explanation:** The optimal way of connecting the groups is:

1--A

2--B

2--C

3--A

This results in a total cost of 4.

Note that there are multiple points connected to point 2 in the first group and point A in the second group.

This does not matter as there is no limit to the number of points that can be connected. We only care about the minimum total cost.

**Example 3:**

**Input:** cost = [[2, 5, 1], [3, 4, 7], [8, 1, 2], [6, 2, 4], [3, 8, 8]]

**Output:** 10

**Constraints:**

*   <code>size<sub>1</sub> == cost.length</code>
*   <code>size<sub>2</sub> == cost[i].length</code>
*   <code>1 <= size<sub>1</sub>, size<sub>2</sub> <= 12</code>
*   <code>size<sub>1</sub> >= size<sub>2</sub></code>
*   `0 <= cost[i][j] <= 100`