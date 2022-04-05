1492\. The kth Factor of n

Medium

You are given two positive integers `n` and `k`. A factor of an integer `n` is defined as an integer `i` where `n % i == 0`.

Consider a list of all factors of `n` sorted in **ascending order**, return _the_ <code>k<sup>th</sup></code> _factor_ in this list or return `-1` if `n` has less than `k` factors.

**Example 1:**

**Input:** n = 12, k = 3

**Output:** 3

**Explanation:** Factors list is [1, 2, 3, 4, 6, 12], the 3<sup>rd</sup> factor is 3.

**Example 2:**

**Input:** n = 7, k = 2

**Output:** 7

**Explanation:** Factors list is [1, 7], the 2<sup>nd</sup> factor is 7.

**Example 3:**

**Input:** n = 4, k = 4

**Output:** -1

**Explanation:** Factors list is [1, 2, 4], there is only 3 factors. We should return -1.

**Constraints:**

*   `1 <= k <= n <= 1000`