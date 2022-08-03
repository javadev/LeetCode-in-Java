667\. Beautiful Arrangement II

Medium

Given two integers `n` and `k`, construct a list `answer` that contains `n` different positive integers ranging from `1` to `n` and obeys the following requirement:

*   Suppose this list is <code>answer = [a<sub>1</sub>, a<sub>2</sub>, a<sub>3</sub>, ... , a<sub>n</sub>]</code>, then the list <code>[|a<sub>1</sub> - a<sub>2</sub>|, |a<sub>2</sub> - a<sub>3</sub>|, |a<sub>3</sub> - a<sub>4</sub>|, ... , |a<sub>n-1</sub> - a<sub>n</sub>|]</code> has exactly `k` distinct integers.

Return _the list_ `answer`. If there multiple valid answers, return **any of them**.

**Example 1:**

**Input:** n = 3, k = 1

**Output:** [1,2,3] Explanation: The [1,2,3] has three different positive integers ranging from 1 to 3, and the [1,1] has exactly 1 distinct integer: 1

**Example 2:**

**Input:** n = 3, k = 2

**Output:** [1,3,2] Explanation: The [1,3,2] has three different positive integers ranging from 1 to 3, and the [2,1] has exactly 2 distinct integers: 1 and 2.

**Constraints:**

*   <code>1 <= k < n <= 10<sup>4</sup></code>