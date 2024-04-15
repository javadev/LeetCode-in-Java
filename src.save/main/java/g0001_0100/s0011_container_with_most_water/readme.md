11\. Container With Most Water

Medium

Given `n` non-negative integers <code>a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub></code> , where each represents a point at coordinate <code>(i, a<sub>i</sub>)</code>. `n` vertical lines are drawn such that the two endpoints of the line `i` is at <code>(i, a<sub>i</sub>)</code> and `(i, 0)`. Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

**Notice** that you may not slant the container.

**Example 1:**

![](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg)

**Input:** height = [1,8,6,2,5,4,8,3,7]

**Output:** 49

**Explanation:** The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49. 

**Example 2:**

**Input:** height = [1,1]

**Output:** 1 

**Example 3:**

**Input:** height = [4,3,2,1,4]

**Output:** 16 

**Example 4:**

**Input:** height = [1,2,1]

**Output:** 2 

**Constraints:**

*   `n == height.length`
*   <code>2 <= n <= 10<sup>5</sup></code>
*   <code>0 <= height[i] <= 10<sup>4</sup></code>

To solve the Container With Most Water problem in Java using a `Solution` class, we'll follow these steps:

1. Define a `Solution` class with a method named `maxArea` that takes an array of integers `height` as input and returns the maximum area of water that can be contained.
2. Initialize two pointers, `left` pointing to the start of the array and `right` pointing to the end of the array.
3. Initialize a variable `maxArea` to store the maximum area encountered so far, initially set to 0.
4. Iterate while `left` is less than `right`.
5. Calculate the current area using the formula: `(right - left) * min(height[left], height[right])`.
6. Update `maxArea` if the current area is greater than `maxArea`.
7. Move the pointer pointing to the smaller height towards the other pointer. If `height[left] < height[right]`, increment `left`, otherwise decrement `right`.
8. Continue the iteration until `left` becomes greater than or equal to `right`.
9. Return `maxArea`.

Here's the implementation:

```java
public class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Example 1 Output: " + solution.maxArea(height1));

        int[] height2 = {1, 1};
        System.out.println("Example 2 Output: " + solution.maxArea(height2));

        int[] height3 = {4, 3, 2, 1, 4};
        System.out.println("Example 3 Output: " + solution.maxArea(height3));

        int[] height4 = {1, 2, 1};
        System.out.println("Example 4 Output: " + solution.maxArea(height4));
    }
}
```

This implementation provides a solution to the Container With Most Water problem in Java.