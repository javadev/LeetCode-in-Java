3748\. Count Stable Subarrays

Hard

You are given an integer array `nums`.

A ****non-empty subarrays**** of `nums` is called **stable** if it contains **no inversions**, i.e., there is no pair of indices `i < j` such that `nums[i] > nums[j]`.

You are also given a **2D integer array** `queries` of length `q`, where each <code>queries[i] = [l<sub>i</sub>, r<sub>i</sub>]</code> represents a query. For each query <code>[l<sub>i</sub>, r<sub>i</sub>]</code>, compute the number of **stable subarrays** that lie entirely within the segment <code>nums[l<sub>i</sub>..r<sub>i</sub>]</code>.

Return an integer array `ans` of length `q`, where `ans[i]` is the answer to the <code>i<sup>th</sup></code> query.

**Note**:

*   A single element subarray is considered stable.

**Example 1:**

**Input:** nums = [3,1,2], queries = [[0,1],[1,2],[0,2]]

**Output:** [2,3,4]

**Explanation:**

*   For `queries[0] = [0, 1]`, the subarray is `[nums[0], nums[1]] = [3, 1]`.
    *   The stable subarrays are `[3]` and `[1]`. The total number of stable subarrays is 2.
*   For `queries[1] = [1, 2]`, the subarray is `[nums[1], nums[2]] = [1, 2]`.
    *   The stable subarrays are `[1]`, `[2]`, and `[1, 2]`. The total number of stable subarrays is 3.
*   For `queries[2] = [0, 2]`, the subarray is `[nums[0], nums[1], nums[2]] = [3, 1, 2]`.
    *   The stable subarrays are `[3]`, `[1]`, `[2]`, and `[1, 2]`. The total number of stable subarrays is 4.

Thus, `ans = [2, 3, 4]`.

**Example 2:**

**Input:** nums = [2,2], queries = [[0,1],[0,0]]

**Output:** [3,1]

**Explanation:**

*   For `queries[0] = [0, 1]`, the subarray is `[nums[0], nums[1]] = [2, 2]`.
    *   The stable subarrays are `[2]`, `[2]`, and `[2, 2]`. The total number of stable subarrays is 3.
*   For `queries[1] = [0, 0]`, the subarray is `[nums[0]] = [2]`.
    *   The stable subarray is `[2]`. The total number of stable subarrays is 1.

Thus, `ans = [3, 1]`.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>5</sup></code>
*   <code>1 <= queries.length <= 10<sup>5</sup></code>
*   <code>queries[i] = [l<sub>i</sub>, r<sub>i</sub>]</code>
*   <code>0 <= l<sub>i</sub> <= r<sub>i</sub> <= nums.length - 1</code>