3776\. Minimum Moves to Balance Circular Array

Medium

You are given a **circular** array `balance` of length `n`, where `balance[i]` is the net balance of person `i`.

In one move, a person can transfer **exactly** 1 unit of balance to either their left or right neighbor.

Return the **minimum** number of moves required so that every person has a **non-negative** balance. If it is impossible, return `-1`.

**Note**: You are guaranteed that **at most** 1 index has a **negative** balance initially.

**Example 1:**

**Input:** balance = [5,1,-4]

**Output:** 4

**Explanation:**

One optimal sequence of moves is:

*   Move 1 unit from `i = 1` to `i = 2`, resulting in `balance = [5, 0, -3]`
*   Move 1 unit from `i = 0` to `i = 2`, resulting in `balance = [4, 0, -2]`
*   Move 1 unit from `i = 0` to `i = 2`, resulting in `balance = [3, 0, -1]`
*   Move 1 unit from `i = 0` to `i = 2`, resulting in `balance = [2, 0, 0]`

Thus, the minimum number of moves required is 4.

**Example 2:**

**Input:** balance = [1,2,-5,2]

**Output:** 6

**Explanation:**

One optimal sequence of moves is:

*   Move 1 unit from `i = 1` to `i = 2`, resulting in `balance = [1, 1, -4, 2]`
*   Move 1 unit from `i = 1` to `i = 2`, resulting in `balance = [1, 0, -3, 2]`
*   Move 1 unit from `i = 3` to `i = 2`, resulting in `balance = [1, 0, -2, 1]`
*   Move 1 unit from `i = 3` to `i = 2`, resulting in `balance = [1, 0, -1, 0]`
*   Move 1 unit from `i = 0` to `i = 1`, resulting in `balance = [0, 1, -1, 0]`
*   Move 1 unit from `i = 1` to `i = 2`, resulting in `balance = [0, 0, 0, 0]`

Thus, the minimum number of moves required is 6.

**Example 3:**

**Input:** balance = [-3,2]

**Output:** \-1

**Explanation:**

It is impossible to make all balances non-negative for `balance = [-3, 2]`, so the answer is -1.

**Constraints:**

*   <code>1 <= n == balance.length <= 10<sup>5</sup></code>
*   <code>-10<sup>9</sup> <= balance[i] <= 10<sup>9</sup></code>
*   There is at most one negative value in `balance` initially.