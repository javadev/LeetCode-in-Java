1018\. Binary Prefix Divisible By 5

Easy

You are given a binary array `nums` (**0-indexed**).

We define <code>x<sub>i</sub></code> as the number whose binary representation is the subarray `nums[0..i]` (from most-significant-bit to least-significant-bit).

*   For example, if `nums = [1,0,1]`, then <code>x<sub>0</sub> = 1</code>, <code>x<sub>1</sub> = 2</code>, and <code>x<sub>2</sub> = 5</code>.

Return _an array of booleans_ `answer` _where_ `answer[i]` _is_ `true` _if_ <code>x<sub>i</sub></code> _is divisible by_ `5`.

**Example 1:**

**Input:** nums = [0,1,1]

**Output:** [true,false,false]

**Explanation:** The input numbers in binary are 0, 01, 011; which are 0, 1, and 3 in base-10. Only the first number is divisible by 5, so answer[0] is true.

**Example 2:**

**Input:** nums = [1,1,1]

**Output:** [false,false,false]

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   `nums[i]` is either `0` or `1`.