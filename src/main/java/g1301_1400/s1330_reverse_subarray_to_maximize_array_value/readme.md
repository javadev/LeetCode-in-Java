1330\. Reverse Subarray To Maximize Array Value

Hard

You are given an integer array `nums`. The _value_ of this array is defined as the sum of `|nums[i] - nums[i + 1]|` for all `0 <= i < nums.length - 1`.

You are allowed to select any subarray of the given array and reverse it. You can perform this operation **only once**.

Find maximum possible value of the final array.

**Example 1:**

**Input:** nums = [2,3,1,5,4]

**Output:** 10

**Explanation:** By reversing the subarray [3,1,5] the array becomes [2,5,1,3,4] whose value is 10.

**Example 2:**

**Input:** nums = [2,4,9,24,2,1,10]

**Output:** 68

**Constraints:**

*   <code>1 <= nums.length <= 3 * 10<sup>4</sup></code>
*   <code>-10<sup>5</sup> <= nums[i] <= 10<sup>5</sup></code>