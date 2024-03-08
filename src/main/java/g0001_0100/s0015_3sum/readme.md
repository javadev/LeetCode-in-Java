15\. 3Sum

Medium

Given an integer array nums, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

Notice that the solution set must not contain duplicate triplets.

**Example 1:**

**Input:** nums = [-1,0,1,2,-1,-4]

**Output:** [[-1,-1,2],[-1,0,1]] 

**Example 2:**

**Input:** nums = []

**Output:** [] 

**Example 3:**

**Input:** nums = [0]

**Output:** [] 

**Constraints:**

*   `0 <= nums.length <= 3000`
*   <code>-10<sup>5</sup> <= nums[i] <= 10<sup>5</sup></code>

To solve the 3Sum problem in Java using a `Solution` class, we'll follow these steps:

1. Define a `Solution` class with a method named `threeSum` that takes an array of integers `nums` as input and returns a list of lists representing the triplets that sum up to zero.
2. Sort the input array `nums` to ensure that duplicate triplets are avoided.
3. Initialize an empty list `result` to store the triplets.
4. Iterate over the elements of the sorted array `nums` up to the second to last element.
5. Within the outer loop, initialize two pointers, `left` and `right`, where `left` starts at the next element after the current element and `right` starts at the last element of the array.
6. While `left` is less than `right`, check if the sum of the current element (`nums[i]`), `nums[left]`, and `nums[right]` equals zero.
7. If the sum is zero, add `[nums[i], nums[left], nums[right]]` to the `result` list.
8. Move the `left` pointer to the right (increment `left`) and the `right` pointer to the left (decrement `right`).
9. If the sum is less than zero, increment `left`.
10. If the sum is greater than zero, decrement `right`.
11. After the inner loop finishes, increment the outer loop index while skipping duplicates.
12. Return the `result` list containing all the valid triplets.

Here's the implementation:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Example 1 Output: " + solution.threeSum(nums1));

        int[] nums2 = {};
        System.out.println("Example 2 Output: " + solution.threeSum(nums2));

        int[] nums3 = {0};
        System.out.println("Example 3 Output: " + solution.threeSum(nums3));
    }
}
```

This implementation provides a solution to the 3Sum problem in Java.