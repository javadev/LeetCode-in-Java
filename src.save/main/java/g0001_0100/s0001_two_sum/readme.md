1\. Two Sum

Easy

Given an array of integers `nums` and an integer `target`, return _indices of the two numbers such that they add up to `target`_.

You may assume that each input would have **_exactly_ one solution**, and you may not use the _same_ element twice.

You can return the answer in any order.

**Example 1:**

**Input:** nums = [2,7,11,15], target = 9

**Output:** [0,1]

**Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1]. 

**Example 2:**

**Input:** nums = [3,2,4], target = 6

**Output:** [1,2] 

**Example 3:**

**Input:** nums = [3,3], target = 6

**Output:** [0,1] 

**Constraints:**

*   <code>2 <= nums.length <= 10<sup>4</sup></code>
*   <code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code>
*   <code>-10<sup>9</sup> <= target <= 10<sup>9</sup></code>
*   **Only one valid answer exists.**

**Follow-up:** Can you come up with an algorithm that is less than <code>O(n<sup>2</sup>)</code> time complexity?

To solve the Two Sum problem in Java using a `Solution` class, we'll follow these steps:

1. Define a `Solution` class with a method named `twoSum`.
2. Inside the `twoSum` method, create a hashmap to store elements and their indices.
3. Iterate through the array:
   - For each element, calculate the complement required to reach the target sum.
   - Check if the complement exists in the hashmap.
   - If found, return the indices of the current element and the complement.
   - If not found, add the current element and its index to the hashmap.
4. Handle edge cases:
   - If no solution is found, return an empty array or null (depending on the problem requirements).

Here's the implementation:

```java
import java.util.HashMap;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store elements and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check if the complement exists in the hashmap
            if (map.containsKey(complement)) {
                // Return the indices of the current element and the complement
                return new int[]{map.get(complement), i};
            }
            // Add the current element and its index to the hashmap
            map.put(nums[i], i);
        }
        // If no solution is found, return an empty array or null
        return new int[]{};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Example 1 Output: [" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Example 2 Output: [" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Example 3 Output: [" + result3[0] + ", " + result3[1] + "]");
    }
}
```

This implementation provides a solution to the Two Sum problem with a time complexity of O(n), where n is the number of elements in the input array.