1137\. N-th Tribonacci Number

Easy

The Tribonacci sequence T<sub>n</sub> is defined as follows:

T<sub>0</sub> = 0, T<sub>1</sub> = 1, T<sub>2</sub> = 1, and T<sub>n+3</sub> = T<sub>n</sub> + T<sub>n+1</sub> + T<sub>n+2</sub> for n >= 0.

Given `n`, return the value of T<sub>n</sub>.

**Example 1:**

**Input:** n = 4

**Output:** 4

**Explanation:** T\_3 = 0 + 1 + 1 = 2 T\_4 = 1 + 1 + 2 = 4

**Example 2:**

**Input:** n = 25

**Output:** 1389537

**Constraints:**

*   `0 <= n <= 37`
*   The answer is guaranteed to fit within a 32-bit integer, ie. `answer <= 2^31 - 1`.