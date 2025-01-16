1437\. Check If All 1's Are at Least Length K Places Away

Easy

Given an binary array `nums` and an integer `k`, return `true` _if all_ `1`_'s are at least_ `k` _places away from each other, otherwise return_ `false`.

**Example 1:**

![](https://leetcode-in-java.github.io/src/main/java/g1401_1500/s1437_check_if_all_1s_are_at_least_length_k_places_away/sample_1_1791.png)

**Input:** nums = [1,0,0,0,1,0,0,1], k = 2

**Output:** true

**Explanation:** Each of the 1s are at least 2 places away from each other.

**Example 2:**

![](https://leetcode-in-java.github.io/src/main/java/g1401_1500/s1437_check_if_all_1s_are_at_least_length_k_places_away/sample_2_1791.png)

**Input:** nums = [1,0,0,1,0,1], k = 2

**Output:** false

**Explanation:** The second 1 and third 1 are only one apart from each other.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   `0 <= k <= nums.length`
*   `nums[i]` is `0` or `1`