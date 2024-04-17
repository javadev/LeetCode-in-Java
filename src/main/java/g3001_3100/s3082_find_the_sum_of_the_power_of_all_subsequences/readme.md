3082\. Find the Sum of the Power of All Subsequences

Hard

You are given an integer array `nums` of length `n` and a **positive** integer `k`.

The **power** of an array of integers is defined as the number of subsequences with their sum **equal** to `k`.

Return _the **sum** of **power** of all subsequences of_ `nums`_._

Since the answer may be very large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

**Example 1:**

**Input:** nums = [1,2,3], k = 3

**Output:** 6

**Explanation:**

There are `5` subsequences of nums with non-zero power:

*   The subsequence <code>[<ins>**1**</ins>,<ins>**2**</ins>,<ins>**3**</ins>]</code> has `2` subsequences with `sum == 3`: <code>[1,2,<ins>3</ins>]</code> and <code>[<ins>1</ins>,<ins>2</ins>,3]</code>.
*   The subsequence <code>[<ins>**1**</ins>,2,<ins>**3**</ins>]</code> has `1` subsequence with `sum == 3`: <code>[1,2,<ins>3</ins>]</code>.
*   The subsequence <code>[1,<ins>**2**</ins>,<ins>**3**</ins>]</code> has `1` subsequence with `sum == 3`: <code>[1,2,<ins>3</ins>]</code>.
*   The subsequence <code>[<ins>**1**</ins>,<ins>**2**</ins>,3]</code> has `1` subsequence with `sum == 3`: <code>[<ins>1</ins>,<ins>2</ins>,3]</code>.
*   The subsequence <code>[1,2,<ins>**3**</ins>]</code> has `1` subsequence with `sum == 3`: <code>[1,2,<ins>3</ins>]</code>.

Hence the answer is `2 + 1 + 1 + 1 + 1 = 6`.

**Example 2:**

**Input:** nums = [2,3,3], k = 5

**Output:** 4

**Explanation:**

There are `3` subsequences of nums with non-zero power:

*   The subsequence <code>[<ins>**2**</ins>,<ins>**3**</ins>,<ins>**3**</ins>]</code> has 2 subsequences with `sum == 5`: <code>[<ins>2</ins>,3,<ins>3</ins>]</code> and <code>[<ins>2</ins>,<ins>3</ins>,3]</code>.
*   The subsequence <code>[<ins>**2**</ins>,3,<ins>**3**</ins>]</code> has 1 subsequence with `sum == 5`: <code>[<ins>2</ins>,3,<ins>3</ins>]</code>.
*   The subsequence <code>[<ins>**2**</ins>,<ins>**3**</ins>,3]</code> has 1 subsequence with `sum == 5`: <code>[<ins>2</ins>,<ins>3</ins>,3]</code>.

Hence the answer is `2 + 1 + 1 = 4`.

**Example 3:**

**Input:** nums = [1,2,3], k = 7

**Output:** 0

**Explanation: **There exists no subsequence with sum `7`. Hence all subsequences of nums have `power = 0`.

**Constraints:**

*   `1 <= n <= 100`
*   <code>1 <= nums[i] <= 10<sup>4</sup></code>
*   `1 <= k <= 100`