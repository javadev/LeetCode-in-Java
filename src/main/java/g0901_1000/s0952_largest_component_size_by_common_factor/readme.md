952\. Largest Component Size by Common Factor

Hard

You are given an integer array of unique positive integers `nums`. Consider the following graph:

*   There are `nums.length` nodes, labeled `nums[0]` to `nums[nums.length - 1]`,
*   There is an undirected edge between `nums[i]` and `nums[j]` if `nums[i]` and `nums[j]` share a common factor greater than `1`.

Return _the size of the largest connected component in the graph_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2018/12/01/ex1.png)

**Input:** nums = [4,6,15,35]

**Output:** 4

**Example 2:**

![](https://assets.leetcode.com/uploads/2018/12/01/ex2.png)

**Input:** nums = [20,50,9,63]

**Output:** 2

**Example 3:**

![](https://assets.leetcode.com/uploads/2018/12/01/ex3.png)

**Input:** nums = [2,3,6,7,4,12,21,39]

**Output:** 8

**Constraints:**

*   <code>1 <= nums.length <= 2 * 10<sup>4</sup></code>
*   <code>1 <= nums[i] <= 10<sup>5</sup></code>
*   All the values of `nums` are **unique**.