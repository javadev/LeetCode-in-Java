3985\. Palindromic Subarray Sum

Hard

You are given an integer array `nums`.

Return the maximum possible sum of a non-empty subarrays of `nums` that is a palindrome.

**Example 1:**

**Input:** nums = [10,10]

**Output:** 20

**Explanation:**

The whole array `[10,10]` is a palindrome. Therefore, the maximum sum is `10 + 10 = 20`.

**Example 2:**

**Input:** nums = [1,2,3,2,1,5,6]

**Output:** 9

**Explanation:**

The contiguous subarray `[1,2,3,2,1]` is a palindrome. Its sum is `1 + 2 + 3 + 2 + 1 = 9` and it is the maximum sum.

**Example 3:**

**Input:** nums = [7,1,2,1,7,3,4,3,4]

**Output:** 18

**Explanation:**

The contiguous subarray `[7,1,2,1,7]` is a palindrome. Its sum is `7 + 1 + 2 + 1 + 7 = 18` and it is the maximum sum.

**Example 4:**

**Input:** nums = [1,2,3,4,5]

**Output:** 5

**Explanation:**

No subarray with length greater than 1 is a palindrome. The largest element in the array is 5. Therefore, the answer is 5.

**Example 5:**

**Input:** nums = [1000]

**Output:** 1000

**Explanation:**

The subarray with only one element is a palindrome. Therefore, the answer is 1000.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>