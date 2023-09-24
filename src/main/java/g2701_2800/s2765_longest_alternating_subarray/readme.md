2765\. Longest Alternating Subarray

Easy

You are given a **0-indexed** integer array `nums`. A subarray `s` of length `m` is called **alternating** if:

*   `m` is greater than `1`.
*   <code>s<sub>1</sub> = s<sub>0</sub> + 1</code>.
*   The **0-indexed** subarray `s` looks like <code>[s<sub>0</sub>, s<sub>1</sub>, s<sub>0</sub>, s<sub>1</sub>,...,s<sub>(m-1) % 2</sub>]</code>. In other words, <code>s<sub>1</sub> - s<sub>0</sub> = 1</code>, <code>s<sub>2</sub> - s<sub>1</sub> = -1</code>, <code>s<sub>3</sub> - s<sub>2</sub> = 1</code>, <code>s<sub>4</sub> - s<sub>3</sub> = -1</code>, and so on up to <code>s[m - 1] - s[m - 2] = (-1)<sup>m</sup></code>.

Return _the maximum length of all **alternating** subarrays present in_ `nums` _or_ `-1` _if no such subarray exists__._

A subarray is a contiguous **non-empty** sequence of elements within an array.

**Example 1:**

**Input:** nums = [2,3,4,3,4]

**Output:** 4

**Explanation:** The alternating subarrays are [3,4], [3,4,3], and [3,4,3,4]. The longest of these is [3,4,3,4], which is of length 4. 

**Example 2:**

**Input:** nums = [4,5,6]

**Output:** 2

**Explanation:** [4,5] and [5,6] are the only two alternating subarrays. They are both of length 2. 

**Constraints:**

*   `2 <= nums.length <= 100`
*   <code>1 <= nums[i] <= 10<sup>4</sup></code>
