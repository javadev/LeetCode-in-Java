4017\. Peaks in Array II

Hard

You are given an integer array `nums` of length `n` and a 2D integer array `queries`.

A **non-empty subarrays** `nums[i..j]` is called a **peak subarray** if:

*   Its length is **at least** 3.
*   There exists an index `k` such that `i < k < j` and:
    *   `nums[k] > nums[k - 1]`
    *   `nums[k] > nums[k + 1]`

You have to process queries of two types:

*   <code>[1, l<sub>i</sub>, r<sub>i</sub>]</code>: Calculate the number of **peak subarrays** fully contained within <code>nums[l<sub>i</sub>..r<sub>i</sub>]</code>.
*   <code>[2, index<sub>i</sub>, val<sub>i</sub>]</code>: Update <code>nums[index<sub>i</sub>]</code> to <code>val<sub>i</sub></code>. This update applies to all subsequent queries.

Return an array `answer`, where `answer[i]` is the answer to the <code>i<sup>th</sup></code> query of type 1 in the order they appear.

**Example 1:**

**Input:** nums = [1,3,2,4], queries = [[1,0,3],[2,1,1],[1,0,3]]

**Output:** [2,0]

**Explanation:**

*   Query `[1, 0, 3]`:
    *   `[1, 3, 2]`: choose `k = 1`. Then `nums[k] = 3`, `nums[k - 1] = 1`, and `nums[k + 1] = 2`. Since `3 > 1` and `3 > 2`, this is a peak subarray.
    *   `[1, 3, 2, 4]`: choose `k = 1`. Then `nums[k] = 3`, `nums[k - 1] = 1`, and `nums[k + 1] = 2`. Since `3 > 1` and `3 > 2`, this is a peak subarray.
*   Query `[2, 1, 1]`: Update `nums[1]` to 1. The array becomes `[1, 1, 2, 4]`.
*   Query `[1, 0, 3]`: There are no peak subarrays now.
*   Thus, `answer = [2, 0]`.

**Example 2:**

**Input:** nums = [9,8,9,8], queries = [[1,1,3],[2,2,1],[1,0,2]]

**Output:** [1,0]

**Explanation:**

*   Query `[1, 1, 3]`:
    *   `nums[1..3] = [8, 9, 8]`: choose `k = 2`. Then `nums[k] = 9`, `nums[k - 1] = 8`, and `nums[k + 1] = 8`. Since `9 > 8` and `9 > 8`, this is a peak subarray.
*   Query `[2, 2, 1]`: Update `nums[2]` to 1. The array becomes `[9, 8, 1, 8]`.
*   Query `[1, 0, 2]`: There are no peak subarrays.
*   Thus, `answer = [1, 0]`.

**Example 3:**

**Input:** nums = [3,6,2,7,1], queries = [[1,1,3],[2,3,0],[1,0,4]]

**Output:** [0,3]

**Explanation:**

*   Query `[1, 1, 3]`: The only subarray of length at least 3 is `[6, 2, 7]`. Its only possible peak index is `k = 2`, but `nums[2] = 2` is less than both `nums[1] = 6` and `nums[3] = 7`, so it is not a peak subarray.
*   Query `[2, 3, 0]`: Update `nums[3]` to 0. The array becomes `[3, 6, 2, 0, 1]`.
*   Query `[1, 0, 4]`:
    *   `[3, 6, 2]`: choose `k = 1`. Then `nums[k] = 6`, `nums[k - 1] = 3`, and `nums[k + 1] = 2`. Since `6 > 3` and `6 > 2`, this is a peak subarray.
    *   `[3, 6, 2, 0]`: choose `k = 1`. Then `nums[k] = 6`, `nums[k - 1] = 3`, and `nums[k + 1] = 2`. Since `6 > 3` and `6 > 2`, this is a peak subarray.
    *   `[3, 6, 2, 0, 1]`: choose `k = 1`. Then `nums[k] = 6`, `nums[k - 1] = 3`, and `nums[k + 1] = 2`. Since `6 > 3` and `6 > 2`, this is a peak subarray.
*   Thus, `answer = [0, 3]`.

**Constraints:**

*   <code>3 <= n == nums.length <= 10<sup>5</sup></code>
*   <code>0 <= nums[i] <= 10<sup>5</sup></code>
*   <code>1 <= queries.length <= 10<sup>5</sup></code>
*   <code>queries[i] = [1, l<sub>i</sub>, r<sub>i</sub>]</code> or <code>queries[i] = [2, index<sub>i</sub>, val<sub>i</sub>]</code>
*   <code>0 <= l<sub>i</sub> < r<sub>i</sub> <= n - 1</code>
*   <code>0 <= index<sub>i</sub> <= n - 1</code>
*   <code>0 <= val<sub>i</sub> <= 10<sup>5</sup></code>