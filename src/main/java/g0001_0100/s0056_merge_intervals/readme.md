56\. Merge Intervals

Medium

Given an array of `intervals` where <code>intervals[i] = [start<sub>i</sub>, end<sub>i</sub>]</code>, merge all overlapping intervals, and return _an array of the non-overlapping intervals that cover all the intervals in the input_.

**Example 1:**

**Input:** intervals = [[1,3],[2,6],[8,10],[15,18]]

**Output:** [[1,6],[8,10],[15,18]]

**Explanation:** Since intervals [1,3] and [2,6] overlaps, merge them into [1,6]. 

**Example 2:**

**Input:** intervals = [[1,4],[4,5]]

**Output:** [[1,5]]

**Explanation:** Intervals [1,4] and [4,5] are considered overlapping. 

**Constraints:**

*   <code>1 <= intervals.length <= 10<sup>4</sup></code>
*   `intervals[i].length == 2`
*   <code>0 <= start<sub>i</sub> <= end<sub>i</sub> <= 10<sup>4</sup></code>

To solve the "Merge Intervals" problem in Java with the Solution class, follow these steps:

1. Define a method `merge` in the `Solution` class that takes an array of integer arrays `intervals` as input and returns an array of the non-overlapping intervals that cover all the intervals in the input.
2. Sort the intervals based on the start times.
3. Initialize an ArrayList to store the merged intervals.
4. Iterate through the sorted intervals:
   - If the list of merged intervals is empty or the current interval's start time is greater than the end time of the last merged interval, add the current interval to the list of merged intervals.
   - Otherwise, merge the current interval with the last merged interval by updating its end time if needed.
5. Convert the ArrayList of merged intervals into an array and return it as the result.

Here's the implementation of the `merge` method in Java:

```java
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || interval[0] > merged.get(merged.size() - 1)[1]) {
                merged.add(interval);
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
```

This implementation efficiently merges overlapping intervals in the given array `intervals` using sorting and iteration, with a time complexity of O(n log n) due to sorting.