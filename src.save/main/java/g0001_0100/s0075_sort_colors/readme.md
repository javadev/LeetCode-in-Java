75\. Sort Colors

Medium

Given an array `nums` with `n` objects colored red, white, or blue, sort them **[in-place](https://en.wikipedia.org/wiki/In-place_algorithm)** so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers `0`, `1`, and `2` to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

**Example 1:**

**Input:** nums = [2,0,2,1,1,0]

**Output:** [0,0,1,1,2,2] 

**Example 2:**

**Input:** nums = [2,0,1]

**Output:** [0,1,2] 

**Example 3:**

**Input:** nums = [0]

**Output:** [0] 

**Example 4:**

**Input:** nums = [1]

**Output:** [1] 

**Constraints:**

*   `n == nums.length`
*   `1 <= n <= 300`
*   `nums[i]` is `0`, `1`, or `2`.

**Follow up:** Could you come up with a one-pass algorithm using only constant extra space?

To solve the "Sort Colors" problem in Java with the Solution class, follow these steps:

1. Define a method `sortColors` in the `Solution` class that takes an array of integers `nums` as input and sorts it in-place according to the colors red, white, and blue.
2. Initialize three pointers: `low`, `mid`, and `high`. `low` points to the beginning of the array, `mid` points to the current element being processed, and `high` points to the end of the array.
3. Loop while `mid` is less than or equal to `high`:
   - If `nums[mid]` is 0, swap `nums[low]` with `nums[mid]`, increment `low` and `mid`.
   - If `nums[mid]` is 1, increment `mid`.
   - If `nums[mid]` is 2, swap `nums[mid]` with `nums[high]`, decrement `high`.
4. After the loop, the array will be sorted in-place according to the colors red, white, and blue.

Here's the implementation of the `sortColors` method in Java:

```java
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
```

This implementation sorts the array in-place using a one-pass algorithm with constant extra space. It iterates through the array and swaps elements as needed to group them according to their colors. The time complexity of this solution is O(n), where n is the length of the array.