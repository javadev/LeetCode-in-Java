42\. Trapping Rain Water

Hard

Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.

**Example 1:**

![](https://assets.leetcode.com/uploads/2018/10/22/rainwatertrap.png)

**Input:** height = [0,1,0,2,1,0,1,3,2,1,2,1]

**Output:** 6

**Explanation:** The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. 

**Example 2:**

**Input:** height = [4,2,0,3,2,5]

**Output:** 9 

**Constraints:**

*   `n == height.length`
*   <code>1 <= n <= 2 * 10<sup>4</sup></code>
*   <code>0 <= height[i] <= 10<sup>5</sup></code>

To solve the "Trapping Rain Water" problem in Java with a `Solution` class, we can follow these steps:

1. Define a `Solution` class.
2. Define a method named `trap` that takes an array of integers `height` as input and returns the amount of water it can trap after raining.
3. Initialize two pointers `left` and `right` at the beginning and end of the array respectively.
4. Initialize two variables `leftMax` and `rightMax` to keep track of the maximum height of bars encountered from the left and right directions respectively.
5. Iterate through the array using the two pointers:
   - Update `leftMax` as the maximum of `leftMax` and `height[left]`.
   - Update `rightMax` as the maximum of `rightMax` and `height[right]`.
   - If `height[left] < height[right]`, calculate the water trapped at the current position using `leftMax` and subtract the height of the current bar. Move `left` pointer to the right.
   - Otherwise, calculate the water trapped at the current position using `rightMax` and subtract the height of the current bar. Move `right` pointer to the left.
6. Continue this process until the two pointers meet.
7. Return the total amount of water trapped.

Here's the implementation:

```java
public class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int trappedWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                trappedWater += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                trappedWater += rightMax - height[right];
                right--;
            }
        }

        return trappedWater;
    }
}
```

This implementation provides a solution to the "Trapping Rain Water" problem in Java. It calculates the amount of water that can be trapped between bars by using two pointers to track the left and right boundaries and two variables to track the maximum heights of bars encountered from the left and right directions.