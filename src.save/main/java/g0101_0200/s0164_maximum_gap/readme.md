164\. Maximum Gap

Hard

Given an integer array `nums`, return _the maximum difference between two successive elements in its sorted form_. If the array contains less than two elements, return `0`.

You must write an algorithm that runs in linear time and uses linear extra space.

**Example 1:**

**Input:** nums = [3,6,9,1]

**Output:** 3

**Explanation:** The sorted form of the array is [1,3,6,9], either (3,6) or (6,9) has the maximum difference 3. 

**Example 2:**

**Input:** nums = [10]

**Output:** 0

**Explanation:** The array contains less than 2 elements, therefore return 0. 

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>0 <= nums[i] <= 10<sup>9</sup></code>