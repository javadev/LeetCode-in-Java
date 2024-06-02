3165\. Maximum Sum of Subsequence With Non-adjacent Elements

Hard

You are given an array `nums` consisting of integers. You are also given a 2D array `queries`, where <code>queries[i] = [pos<sub>i</sub>, x<sub>i</sub>]</code>.

For query `i`, we first set <code>nums[pos<sub>i</sub>]</code> equal to <code>x<sub>i</sub></code>, then we calculate the answer to query `i` which is the **maximum** sum of a subsequence of `nums` where **no two adjacent elements are selected**.

Return the _sum_ of the answers to all queries.

Since the final answer may be very large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

A **subsequence** is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

**Example 1:**

**Input:** nums = [3,5,9], queries = [[1,-2],[0,-3]]

**Output:** 21

**Explanation:**   
 After the 1<sup>st</sup> query, `nums = [3,-2,9]` and the maximum sum of a subsequence with non-adjacent elements is `3 + 9 = 12`.   
 After the 2<sup>nd</sup> query, `nums = [-3,-2,9]` and the maximum sum of a subsequence with non-adjacent elements is 9.

**Example 2:**

**Input:** nums = [0,-1], queries = [[0,-5]]

**Output:** 0

**Explanation:**   
 After the 1<sup>st</sup> query, `nums = [-5,-1]` and the maximum sum of a subsequence with non-adjacent elements is 0 (choosing an empty subsequence).

**Constraints:**

*   <code>1 <= nums.length <= 5 * 10<sup>4</sup></code>
*   <code>-10<sup>5</sup> <= nums[i] <= 10<sup>5</sup></code>
*   <code>1 <= queries.length <= 5 * 10<sup>4</sup></code>
*   <code>queries[i] == [pos<sub>i</sub>, x<sub>i</sub>]</code>
*   <code>0 <= pos<sub>i</sub> <= nums.length - 1</code>
*   <code>-10<sup>5</sup> <= x<sub>i</sub> <= 10<sup>5</sup></code>