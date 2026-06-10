3814\. Maximum Capacity Within Budget

Medium

You are given two integer arrays `costs` and `capacity`, both of length `n`, where `costs[i]` represents the purchase cost of the <code>i<sup>th</sup></code> machine and `capacity[i]` represents its performance capacity.

You are also given an integer `budget`.

You may select **at most two distinct** machines such that the **total cost** of the selected machines is **strictly less** than `budget`.

Return the **maximum** achievable total capacity of the selected machines.

**Example 1:**

**Input:** costs = [4,8,5,3], capacity = [1,5,2,7], budget = 8

**Output:** 8

**Explanation:**

*   Choose two machines with `costs[0] = 4` and `costs[3] = 3`.
*   The total cost is `4 + 3 = 7`, which is strictly less than `budget = 8`.
*   The maximum total capacity is `capacity[0] + capacity[3] = 1 + 7 = 8`.

**Example 2:**

**Input:** costs = [3,5,7,4], capacity = [2,4,3,6], budget = 7

**Output:** 6

**Explanation:**

*   Choose one machine with `costs[3] = 4`.
*   The total cost is 4, which is strictly less than `budget = 7`.
*   The maximum total capacity is `capacity[3] = 6`.

**Example 3:**

**Input:** costs = [2,2,2], capacity = [3,5,4], budget = 5

**Output:** 9

**Explanation:**

*   Choose two machines with `costs[1] = 2` and `costs[2] = 2`.
*   The total cost is `2 + 2 = 4`, which is strictly less than `budget = 5`.
*   The maximum total capacity is `capacity[1] + capacity[2] = 5 + 4 = 9`.

**Constraints:**

*   <code>1 <= n == costs.length == capacity.length <= 10<sup>5</sup></code>
*   <code>1 <= costs[i], capacity[i] <= 10<sup>5</sup></code>
*   <code>1 <= budget <= 2 * 10<sup>5</sup></code>