41\. First Missing Positive

Hard

Given an unsorted integer array `nums`, return the smallest missing positive integer.

You must implement an algorithm that runs in `O(n)` time and uses constant extra space.

**Example 1:**

**Input:** nums = [1,2,0]

**Output:** 3 

**Example 2:**

**Input:** nums = [3,4,-1,1]

**Output:** 2 

**Example 3:**

**Input:** nums = [7,8,9,11,12]

**Output:** 1 

**Constraints:**

*   <code>1 <= nums.length <= 5 * 10<sup>5</sup></code>
*   <code>-2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1</code>

To solve the "First Missing Positive" problem in Java with a `Solution` class, we can follow these steps:

1. Define a `Solution` class.
2. Define a method named `firstMissingPositive` that takes an array of integers `nums` as input and returns the smallest missing positive integer.
3. Iterate through the array and mark the positive integers found by negating the value at the corresponding index.
4. Iterate through the modified array again and return the index of the first positive number (which is the smallest missing positive integer).
5. If no positive number is found, return `nums.length + 1`.

Here's the implementation:

```java
public class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Mark positive integers found by negating the value at the corresponding index
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0 && nums[i] <= n) {
                int pos = nums[i] - 1;
                if (nums[pos] != nums[i]) {
                    int temp = nums[pos];
                    nums[pos] = nums[i];
                    nums[i] = temp;
                    i--; // Revisit the swapped number
                }
            }
        }

        // Find the first positive number (smallest missing positive integer)
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If no positive number is found, return nums.length + 1
        return n + 1;
    }
}
```

This implementation provides a solution to the "First Missing Positive" problem in Java. It marks positive integers found by negating the value at the corresponding index and then iterates through the modified array to find the smallest missing positive integer. If no positive number is found, it returns `nums.length + 1`.