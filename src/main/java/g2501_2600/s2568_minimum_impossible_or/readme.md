2568\. Minimum Impossible OR

Medium

You are given a **0-indexed** integer array `nums`.

We say that an integer x is **expressible** from `nums` if there exist some integers <code>0 <= index<sub>1</sub> < index<sub>2</sub> < ... < index<sub>k</sub> < nums.length</code> for which <code>nums[index<sub>1</sub>] | nums[index<sub>2</sub>] | ... | nums[index<sub>k</sub>] = x</code>. In other words, an integer is expressible if it can be written as the bitwise OR of some subsequence of `nums`.

Return _the minimum **positive non-zero integer** that is not_ _expressible from_ `nums`.

**Example 1:**

**Input:** nums = [2,1]

**Output:** 4

**Explanation:** 1 and 2 are already present in the array. We know that 3 is expressible, since nums[0] | nums[1] = 2 | 1 = 3. Since 4 is not expressible, we return 4.

**Example 2:**

**Input:** nums = [5,3,2]

**Output:** 1

**Explanation:** We can show that 1 is the smallest number that is not expressible.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>