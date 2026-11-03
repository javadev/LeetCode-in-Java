3971\. Maximum Total Value

Hard

You are given two integer arrays `value` and `decay`, and an integer `m`.

*   `value[i]` represents the initial value at index `i`.
*   `decay[i]` represents how much the value decreases after each selection of index `i`.

You may select any index **multiple** times. The total number of selections across all indices must not exceed `m`.

If you select index `i` for the <code>t<sup>th</sup></code> time, where `t` is 1-indexed, the value gained is `value[i] - decay[i] * (t - 1)`.

Return the **maximum** total value you can obtain. Since the answer may be large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

**Example 1:**

**Input:** value = [6,5,4], decay = [2,1,1], m = 4

**Output:** 19

**Explanation:**

One optimal sequence of selections is as follows:

*   By selecting index 0, the value gained is 6.
*   By selecting index 1, the value gained is 5.
*   By selecting index 2, the value gained is 4.
*   By selecting index 0 again, the value gained is `6 - 2 = 4`.

The total value is `6 + 5 + 4 + 4 = 19`. No other sequence of at most 4 selections gives a higher total value.

**Example 2:**

**Input:** value = [7,2,2], decay = [3,2,1], m = 2

**Output:** 11

**Explanation:**

One optimal sequence of selections is as follows:

*   By selecting index 0, the value gained is 7.
*   By selecting index 0 again, the value gained is `7 - 3 = 4`.

The total value is `7 + 4 = 11`.

**Example 3:**

**Input:** value = [4,3], decay = [5,4], m = 5

**Output:** 7

**Explanation:**

One optimal sequence of selections is as follows:

*   By selecting index 0, the value gained is 4.
*   By selecting index 1, the value gained is 3.

The total value is `4 + 3 = 7`.

**Constraints:**

*   <code>1 <= value.length == decay.length <= 10<sup>5</sup></code>
*   <code>1 <= value[i], decay[i] <= 10<sup>9</sup></code>
*   <code>1 <= m <= 10<sup>9</sup></code>