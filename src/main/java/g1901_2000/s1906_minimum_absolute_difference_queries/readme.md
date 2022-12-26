1906\. Minimum Absolute Difference Queries

Medium

The **minimum absolute difference** of an array `a` is defined as the **minimum value** of `|a[i] - a[j]|`, where `0 <= i < j < a.length` and `a[i] != a[j]`. If all elements of `a` are the **same**, the minimum absolute difference is `-1`.

*   For example, the minimum absolute difference of the array `[5,2,3,7,2]` is `|2 - 3| = 1`. Note that it is not `0` because `a[i]` and `a[j]` must be different.

You are given an integer array `nums` and the array `queries` where <code>queries[i] = [l<sub>i</sub>, r<sub>i</sub>]</code>. For each query `i`, compute the **minimum absolute difference** of the **subarray** <code>nums[l<sub>i</sub>...r<sub>i</sub>]</code> containing the elements of `nums` between the **0-based** indices <code>l<sub>i</sub></code> and <code>r<sub>i</sub></code> (**inclusive**).

Return _an **array**_ `ans` _where_ `ans[i]` _is the answer to the_ <code>i<sup>th</sup></code> _query_.

A **subarray** is a contiguous sequence of elements in an array.

The value of `|x|` is defined as:

*   `x` if `x >= 0`.
*   `-x` if `x < 0`.

**Example 1:**

**Input:** nums = [1,3,4,8], queries = [[0,1],[1,2],[2,3],[0,3]]

**Output:** [2,1,4,1]

**Explanation:** The queries are processed as follows: 

- queries[0] = [0,1]: The subarray is [1,3] and the minimum absolute difference is |1-3| = 2. 

- queries[1] = [1,2]: The subarray is [3,4] and the minimum absolute difference is |3-4| = 1. 

- queries[2] = [2,3]: The subarray is [4,8] and the minimum absolute difference is |4-8| = 4. 

- queries[3] = [0,3]: The subarray is [1,3,4,8] and the minimum absolute difference is |3-4| = 1.

**Example 2:**

**Input:** nums = [4,5,2,2,7,10], queries = [[2,3],[0,2],[0,5],[3,5]]

**Output:** [-1,1,1,3]

**Explanation:** The queries are processed as follows: 

- queries[0] = [2,3]: The subarray is [2,2] and the minimum absolute difference is -1 because all the elements are the same. 

- queries[1] = [0,2]: The subarray is [4,5,2] and the minimum absolute difference is |4-5| = 1. 

- queries[2] = [0,5]: The subarray is [4,5,2,2,7,10] and the minimum absolute difference is |4-5| = 1. 

- queries[3] = [3,5]: The subarray is [2,7,10] and the minimum absolute difference is |7-10| = 3.

**Constraints:**

*   <code>2 <= nums.length <= 10<sup>5</sup></code>
*   `1 <= nums[i] <= 100`
*   <code>1 <= queries.length <= 2 * 10<sup>4</sup></code>
*   <code>0 <= l<sub>i</sub> < r<sub>i</sub> < nums.length</code>