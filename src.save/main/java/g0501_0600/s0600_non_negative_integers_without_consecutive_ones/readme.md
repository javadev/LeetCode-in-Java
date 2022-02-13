600\. Non-negative Integers without Consecutive Ones

Hard

Given a positive integer `n`, return the number of the integers in the range `[0, n]` whose binary representations **do not** contain consecutive ones.

**Example 1:**

**Input:** n = 5

**Output:** 5

**Explanation:**

    Here are the non-negative integers <= 5 with their corresponding binary representations:
    0 : 0
    1 : 1
    2 : 10
    3 : 11
    4 : 100
    5 : 101
    Among them, only integer 3 disobeys the rule (two consecutive ones) and the other 5 satisfy the rule. 

**Example 2:**

**Input:** n = 1

**Output:** 2 

**Example 3:**

**Input:** n = 2

**Output:** 3 

**Constraints:**

*   <code>1 <= n <= 10<sup>9</sup></code>