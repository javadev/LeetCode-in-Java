1014\. Best Sightseeing Pair

Medium

You are given an integer array `values` where values[i] represents the value of the <code>i<sup>th</sup></code> sightseeing spot. Two sightseeing spots `i` and `j` have a **distance** `j - i` between them.

The score of a pair (`i < j`) of sightseeing spots is `values[i] + values[j] + i - j`: the sum of the values of the sightseeing spots, minus the distance between them.

Return _the maximum score of a pair of sightseeing spots_.

**Example 1:**

**Input:** values = [8,1,5,2,6]

**Output:** 11

**Explanation:** i = 0, j = 2, values[i] + values[j] + i - j = 8 + 5 + 0 - 2 = 11

**Example 2:**

**Input:** values = [1,2]

**Output:** 2

**Constraints:**

*   <code>2 <= values.length <= 5 * 10<sup>4</sup></code>
*   `1 <= values[i] <= 1000`