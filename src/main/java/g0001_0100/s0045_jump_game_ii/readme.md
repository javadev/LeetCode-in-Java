45\. Jump Game II

Medium

Given an array of non-negative integers `nums`, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

You can assume that you can always reach the last index.

**Example 1:**

**Input:** nums = [2,3,1,1,4]

**Output:** 2

**Explanation:** The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index. 

**Example 2:**

**Input:** nums = [2,3,0,1,4]

**Output:** 2 

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>4</sup></code>
*   `0 <= nums[i] <= 1000`

To solve the "Jump Game II" problem in Java with a `Solution` class, we can follow these steps:

1. Define a `Solution` class.
2. Define a method named `jump` that takes an array of non-negative integers `nums` as input and returns the minimum number of jumps required to reach the last index.
3. Initialize variables `maxReach`, `steps`, and `end` to keep track of the maximum reachable position, the number of steps taken, and the end position respectively. Initialize `maxReach` to 0 and `end` to 0.
4. Iterate through the array from index 0 to `nums.length - 2`:
   - Update `maxReach` as the maximum of `maxReach` and `i + nums[i]`.
   - If the current index `i` equals `end`, update `end` to `maxReach` and increment `steps`.
5. Return `steps`.

Here's the implementation:

```java
public class Solution {
    public int jump(int[] nums) {
        int maxReach = 0;
        int steps = 0;
        int end = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            if (i == end) {
                end = maxReach;
                steps++;
            }
        }

        return steps;
    }
}
```

This implementation provides a solution to the "Jump Game II" problem in Java. It calculates the minimum number of jumps required to reach the last index by iterating through the array and updating the maximum reachable position and the end position accordingly.