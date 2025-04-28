3528\. Unit Conversion I

Medium

There are `n` types of units indexed from `0` to `n - 1`. You are given a 2D integer array `conversions` of length `n - 1`, where <code>conversions[i] = [sourceUnit<sub>i</sub>, targetUnit<sub>i</sub>, conversionFactor<sub>i</sub>]</code>. This indicates that a single unit of type <code>sourceUnit<sub>i</sub></code> is equivalent to <code>conversionFactor<sub>i</sub></code> units of type <code>targetUnit<sub>i</sub></code>.

Return an array `baseUnitConversion` of length `n`, where `baseUnitConversion[i]` is the number of units of type `i` equivalent to a single unit of type 0. Since the answer may be large, return each `baseUnitConversion[i]` **modulo** <code>10<sup>9</sup> + 7</code>.

**Example 1:**

**Input:** conversions = [[0,1,2],[1,2,3]]

**Output:** [1,2,6]

**Explanation:**

*   Convert a single unit of type 0 into 2 units of type 1 using `conversions[0]`.
*   Convert a single unit of type 0 into 6 units of type 2 using `conversions[0]`, then `conversions[1]`.

![](https://assets.leetcode.com/uploads/2025/03/12/example1.png)

**Example 2:**

**Input:** conversions = [[0,1,2],[0,2,3],[1,3,4],[1,4,5],[2,5,2],[4,6,3],[5,7,4]]

**Output:** [1,2,3,8,10,6,30,24]

**Explanation:**

*   Convert a single unit of type 0 into 2 units of type 1 using `conversions[0]`.
*   Convert a single unit of type 0 into 3 units of type 2 using `conversions[1]`.
*   Convert a single unit of type 0 into 8 units of type 3 using `conversions[0]`, then `conversions[2]`.
*   Convert a single unit of type 0 into 10 units of type 4 using `conversions[0]`, then `conversions[3]`.
*   Convert a single unit of type 0 into 6 units of type 5 using `conversions[1]`, then `conversions[4]`.
*   Convert a single unit of type 0 into 30 units of type 6 using `conversions[0]`, `conversions[3]`, then `conversions[5]`.
*   Convert a single unit of type 0 into 24 units of type 7 using `conversions[1]`, `conversions[4]`, then `conversions[6]`.

**Constraints:**

*   <code>2 <= n <= 10<sup>5</sup></code>
*   `conversions.length == n - 1`
*   <code>0 <= sourceUnit<sub>i</sub>, targetUnit<sub>i</sub> < n</code>
*   <code>1 <= conversionFactor<sub>i</sub> <= 10<sup>9</sup></code>
*   It is guaranteed that unit 0 can be converted into any other unit through a **unique** combination of conversions without using any conversions in the opposite direction.