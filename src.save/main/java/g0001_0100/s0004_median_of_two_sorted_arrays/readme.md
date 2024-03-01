4\. Median of Two Sorted Arrays

Hard

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return **the median** of the two sorted arrays.

The overall run time complexity should be `O(log (m+n))`.

**Example 1:**

**Input:** nums1 = [1,3], nums2 = [2]

**Output:** 2.00000

**Explanation:** merged array = [1,2,3] and median is 2. 

**Example 2:**

**Input:** nums1 = [1,2], nums2 = [3,4]

**Output:** 2.50000

**Explanation:** merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5. 

**Example 3:**

**Input:** nums1 = [0,0], nums2 = [0,0]

**Output:** 0.00000 

**Example 4:**

**Input:** nums1 = [], nums2 = [1]

**Output:** 1.00000 

**Example 5:**

**Input:** nums1 = [2], nums2 = []

**Output:** 2.00000 

**Constraints:**

*   `nums1.length == m`
*   `nums2.length == n`
*   `0 <= m <= 1000`
*   `0 <= n <= 1000`
*   `1 <= m + n <= 2000`
*   <code>-10<sup>6</sup> <= nums1[i], nums2[i] <= 10<sup>6</sup></code>

To solve the Median of Two Sorted Arrays problem in Java using a `Solution` class, we'll follow these steps:

1. Define a `Solution` class with a method named `findMedianSortedArrays`.
2. Calculate the total length of the combined array (m + n).
3. Determine the middle index or indices of the combined array based on its length (for both even and odd lengths).
4. Implement a binary search algorithm to find the correct position for partitioning the two arrays such that elements to the left are less than or equal to elements on the right.
5. Calculate the median based on the partitioned arrays.
6. Handle edge cases where one or both arrays are empty or where the combined length is odd or even.
7. Return the calculated median.

Here's the implementation:

```java
public class Solution {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;
        int left = (totalLength + 1) / 2;
        int right = (totalLength + 2) / 2;
        return (findKth(nums1, 0, nums2, 0, left) + findKth(nums1, 0, nums2, 0, right)) / 2.0;
    }

    private int findKth(int[] nums1, int i, int[] nums2, int j, int k) {
        if (i >= nums1.length) return nums2[j + k - 1];
        if (j >= nums2.length) return nums1[i + k - 1];
        if (k == 1) return Math.min(nums1[i], nums2[j]);

        int midVal1 = (i + k / 2 - 1 < nums1.length) ? nums1[i + k / 2 - 1] : Integer.MAX_VALUE;
        int midVal2 = (j + k / 2 - 1 < nums2.length) ? nums2[j + k / 2 - 1] : Integer.MAX_VALUE;

        if (midVal1 < midVal2) {
            return findKth(nums1, i + k / 2, nums2, j, k - k / 2);
        } else {
            return findKth(nums1, i, nums2, j + k / 2, k - k / 2);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] nums1_1 = {1, 3};
        int[] nums2_1 = {2};
        System.out.println("Example 1 Output: " + solution.findMedianSortedArrays(nums1_1, nums2_1));

        int[] nums1_2 = {1, 2};
        int[] nums2_2 = {3, 4};
        System.out.println("Example 2 Output: " + solution.findMedianSortedArrays(nums1_2, nums2_2));

        int[] nums1_3 = {0, 0};
        int[] nums2_3 = {0, 0};
        System.out.println("Example 3 Output: " + solution.findMedianSortedArrays(nums1_3, nums2_3));

        int[] nums1_4 = {};
        int[] nums2_4 = {1};
        System.out.println("Example 4 Output: " + solution.findMedianSortedArrays(nums1_4, nums2_4));

        int[] nums1_5 = {2};
        int[] nums2_5 = {};
        System.out.println("Example 5 Output: " + solution.findMedianSortedArrays(nums1_5, nums2_5));
    }
}
```

This implementation provides a solution to the Median of Two Sorted Arrays problem in Java with a runtime complexity of O(log(min(m, n))).