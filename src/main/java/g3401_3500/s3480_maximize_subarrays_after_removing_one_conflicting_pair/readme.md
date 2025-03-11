3480\. Maximize Subarrays After Removing One Conflicting Pair

Hard

You are given an integer `n` which represents an array `nums` containing the numbers from 1 to `n` in order. Additionally, you are given a 2D array `conflictingPairs`, where `conflictingPairs[i] = [a, b]` indicates that `a` and `b` form a conflicting pair.

Remove **exactly** one element from `conflictingPairs`. Afterward, count the number of non-empty subarrays of `nums` which do not contain both `a` and `b` for any remaining conflicting pair `[a, b]`.

Return the **maximum** number of subarrays possible after removing **exactly** one conflicting pair.

**Example 1:**

**Input:** n = 4, conflictingPairs = [[2,3],[1,4]]

**Output:** 9

**Explanation:**

*   Remove `[2, 3]` from `conflictingPairs`. Now, `conflictingPairs = [[1, 4]]`.
*   There are 9 subarrays in `nums` where `[1, 4]` do not appear together. They are `[1]`, `[2]`, `[3]`, `[4]`, `[1, 2]`, `[2, 3]`, `[3, 4]`, `[1, 2, 3]` and `[2, 3, 4]`.
*   The maximum number of subarrays we can achieve after removing one element from `conflictingPairs` is 9.

**Example 2:**

**Input:** n = 5, conflictingPairs = [[1,2],[2,5],[3,5]]

**Output:** 12

**Explanation:**

*   Remove `[1, 2]` from `conflictingPairs`. Now, `conflictingPairs = [[2, 5], [3, 5]]`.
*   There are 12 subarrays in `nums` where `[2, 5]` and `[3, 5]` do not appear together.
*   The maximum number of subarrays we can achieve after removing one element from `conflictingPairs` is 12.

**Constraints:**

*   <code>2 <= n <= 10<sup>5</sup></code>
*   `1 <= conflictingPairs.length <= 2 * n`
*   `conflictingPairs[i].length == 2`
*   `1 <= conflictingPairs[i][j] <= n`
*   `conflictingPairs[i][0] != conflictingPairs[i][1]`