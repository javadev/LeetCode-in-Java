55\. Jump Game

Medium

You are given an integer array `nums`. You are initially positioned at the array's **first index**, and each element in the array represents your maximum jump length at that position.

Return `true` _if you can reach the last index, or_ `false` _otherwise_.

**Example 1:**

**Input:** nums = [2,3,1,1,4]

**Output:** true

**Explanation:** Jump 1 step from index 0 to 1, then 3 steps to the last index. 

**Example 2:**

**Input:** nums = [3,2,1,0,4]

**Output:** false

**Explanation:** You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index. 

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>4</sup></code>
*   <code>0 <= nums[i] <= 10<sup>5</sup></code>

To solve the "Jump Game" problem in Java with the Solution class, follow these steps:

1. Define a method `canJump` in the `Solution` class that takes an integer array `nums` as input and returns a boolean indicating whether it's possible to reach the last index.
2. Initialize a variable `maxReach` to keep track of the maximum index that can be reached.
3. Iterate through the array `nums` from index `0` to `nums.length - 1`:
   - Check if the current index `i` is greater than `maxReach`. If it is, return `false` as it's not possible to reach the last index.
   - Update `maxReach` as the maximum of `maxReach` and `i + nums[i]`, which represents the furthest index that can be reached from the current position.
4. After iterating through all elements in `nums`, return `true` as it's possible to reach the last index.

Here's the implementation of the `canJump` method in Java:

```java
class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
```

This implementation efficiently determines whether it's possible to reach the last index in the given array `nums` using a greedy approach, with a time complexity of O(n).