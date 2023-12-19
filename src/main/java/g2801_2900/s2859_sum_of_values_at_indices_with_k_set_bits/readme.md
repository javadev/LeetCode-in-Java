2859\. Sum of Values at Indices With K Set Bits

Easy

You are given a **0-indexed** integer array `nums` and an integer `k`.

Return _an integer that denotes the **sum** of elements in_ `nums` _whose corresponding **indices** have **exactly**_ `k` _set bits in their binary representation._

The **set bits** in an integer are the `1`'s present when it is written in binary.

*   For example, the binary representation of `21` is `10101`, which has `3` set bits.

**Example 1:**

**Input:** nums = [5,10,1,5,2], k = 1

**Output:** 13

**Explanation:** The binary representation of the indices are: 

0 = 000<sub>2</sub> 

1 = 001<sub>2</sub> 

2 = 010<sub>2</sub> 

3 = 011<sub>2</sub> 

4 = 100<sub>2</sub> 

Indices 1, 2, and 4 have k = 1 set bits in their binary representation. Hence, the answer is nums[1] + nums[2] + nums[4] = 13.

**Example 2:**

**Input:** nums = [4,3,2,1], k = 2

**Output:** 1

**Explanation:** The binary representation of the indices are: 

0 = 00<sub>2</sub> 

1 = 01<sub>2</sub> 

2 = 10<sub>2</sub> 

3 = 11<sub>2</sub> 

Only index 3 has k = 2 set bits in its binary representation. Hence, the answer is nums[3] = 1.

**Constraints:**

*   `1 <= nums.length <= 1000`
*   <code>1 <= nums[i] <= 10<sup>5</sup></code>
*   `0 <= k <= 10`