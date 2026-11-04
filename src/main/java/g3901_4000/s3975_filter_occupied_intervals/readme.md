3975\. Filter Occupied Intervals

Medium

You are given a 2D integer array `occupiedIntervals`, where <code>occupiedIntervals[i] = [start<sub>i</sub>, end<sub>i</sub>]</code> represents a time interval during which you are occupied. Each interval starts at <code>start<sub>i</sub></code> and ends at <code>end<sub>i</sub></code>, **inclusive**. These intervals may **overlap**.

You are also given two integers `freeStart` and `freeEnd`, which define a free time interval from `freeStart` to `freeEnd`, inclusive.

Your task is to merge **all** occupied intervals that overlap or touch, then remove **all** integer points in the free interval from the merged occupied intervals.

Two intervals touch if the second interval starts **immediately after** the first one ends. For example, `[1, 1]` and `[2, 2]` touch and should be merged into `[1, 2]`.

Return the **remaining** occupied intervals in **sorted** order. The returned intervals must be **non-overlapping** and must contain the **minimum** number of intervals possible. If there are no remaining occupied points, return an empty list.

**Example 1:**

**Input:** occupiedIntervals = [[2,6],[4,8],[10,10],[10,12],[14,16]], freeStart = 7, freeEnd = 11

**Output:** [[2,6],[12,12],[14,16]]

**Explanation:**

*   After merging, the occupied intervals are `[2, 8]`, `[10, 12]`, and `[14, 16]`.
*   Excluding the free interval `[7, 11]` results in `[2, 6]`, `[12, 12]`, and `[14, 16]`.

**Example 2:**

**Input:** occupiedIntervals = [[1,5],[2,3]], freeStart = 3, freeEnd = 8

**Output:** [[1,2]]

**Explanation:**

*   After merging, the occupied interval is `[1, 5]`.
*   Excluding the free interval `[3, 8]` results in `[1, 2]`.

**Constraints:**

*   <code>1 <= occupiedIntervals.length <= 5 * 10<sup>4</sup></code>
*   `occupiedIntervals[i].length == 2`
*   <code>1 <= start<sub>i</sub> <= end<sub>i</sub> <= 10<sup>9</sup></code>
*   <code>1 <= freeStart <= freeEnd <= 10<sup>9</sup></code>