3209\. Number of Subarrays With AND Value of K

Hard

Given an array of integers `nums` and an integer `k`, return the number of subarrays of `nums` where the bitwise `AND` of the elements of the subarray equals `k`.

**Example 1:**

**Input:** nums = [1,1,1], k = 1

**Output:** 6

**Explanation:**

All subarrays contain only 1's.

**Example 2:**

**Input:** nums = [1,1,2], k = 1

**Output:** 3

**Explanation:**

Subarrays having an `AND` value of 1 are: <code>[<ins>**1**</ins>,1,2]</code>, <code>[1,<ins>**1**</ins>,2]</code>, <code>[<ins>**1,1**</ins>,2]</code>.

**Example 3:**

**Input:** nums = [1,2,3], k = 2

**Output:** 2

**Explanation:**

Subarrays having an `AND` value of 2 are: <code>[1,**<ins>2</ins>**,3]</code>, <code>[1,<ins>**2,3**</ins>]</code>.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>0 <= nums[i], k <= 10<sup>9</sup></code>