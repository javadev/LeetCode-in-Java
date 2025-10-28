31\. Next Permutation

Medium

A **permutation** of an array of integers is an arrangement of its members into a sequence or linear order.

*   For example, for `arr = [1,2,3]`, the following are all the permutations of `arr`: `[1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1]`.

The **next permutation** of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the **next permutation** of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

*   For example, the next permutation of `arr = [1,2,3]` is `[1,3,2]`.
*   Similarly, the next permutation of `arr = [2,3,1]` is `[3,1,2]`.
*   While the next permutation of `arr = [3,2,1]` is `[1,2,3]` because `[3,2,1]` does not have a lexicographical larger rearrangement.

Given an array of integers `nums`, _find the next permutation of_ `nums`.

The replacement must be **[in place](http://en.wikipedia.org/wiki/In-place_algorithm)** and use only constant extra memory.

**Example 1:**

**Input:** nums = [1,2,3]

**Output:** [1,3,2] 

**Example 2:**

**Input:** nums = [3,2,1]

**Output:** [1,2,3] 

**Example 3:**

**Input:** nums = [1,1,5]

**Output:** [1,5,1] 

**Constraints:**

*   `1 <= nums.length <= 100`
*   `0 <= nums[i] <= 100`

To solve the "Next Permutation" problem in Java with a `Solution` class, we can follow these steps:

1. Define a `Solution` class.
2. Define a method named `nextPermutation` that takes an integer array `nums` as input and modifies it to find the next permutation in lexicographic order.
3. Find the first index `i` from the right such that `nums[i] > nums[i - 1]`. If no such index exists, reverse the entire array, as it's already the last permutation.
4. Find the smallest index `j` from the right such that `nums[j] > nums[i - 1]`.
5. Swap `nums[i - 1]` with `nums[j]`.
6. Reverse the suffix of the array starting from index `i`.

Here's the implementation:

```java
public class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        // Step 1: Find the first index i from the right such that nums[i] > nums[i - 1]
        int i = n - 1;
        while (i > 0 && nums[i] <= nums[i - 1]) {
            i--;
        }
        
        // Step 2: If no such index exists, reverse the entire array
        if (i == 0) {
            reverse(nums, 0, n - 1);
            return;
        }
        
        // Step 3: Find the smallest index j from the right such that nums[j] > nums[i - 1]
        int j = n - 1;
        while (nums[j] <= nums[i - 1]) {
            j--;
        }
        
        // Step 4: Swap nums[i - 1] with nums[j]
        swap(nums, i - 1, j);
        
        // Step 5: Reverse the suffix of the array starting from index i
        reverse(nums, i, n - 1);
    }
    
    // Helper method to reverse a portion of the array
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    
    // Helper method to swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
```

This implementation provides a solution to the "Next Permutation" problem in Java. It finds the next lexicographically greater permutation of the given array `nums` and modifies it in place.
